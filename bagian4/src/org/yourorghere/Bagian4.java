package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Bagian4 implements GLEventListener, MouseListener, MouseMotionListener, KeyListener {

    public static void main(String[] args) {
        Frame frame = new Frame("KAMERA - UAS GRAFIS");
        GLCanvas canvas = new GLCanvas();
        canvas.addGLEventListener(new Bagian4());
        canvas.addKeyListener(new Bagian4());
        frame.add(canvas);
        frame.setSize(1280, 800);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new Thread(new Runnable() {
                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
// Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

    class vector {

        float x;
        float y;
        float z;

        public vector(float startX, float startY, float startZ) {
            x = startX;
            y = startY;
            z = startZ;
        }
    }
    private float view_rotx = 20.0f;
    private float view_roty = 30.0f;
    private int oldMouseX;
    private int oldMouseY;

    float Cx = 0, Cy = 2.5f, Cz = 0;
    float Lx = 0, Ly = 2.5f, Lz = -10f;
    vector vertikal = new vector(0f, 1f, 0f);//deklarasi awal vetor untuk gerakan naik & turun

    public void init(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        gl.glShadeModel(GL.GL_FLAT);

        float ambient[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float difusse[] = {1.0f, 1.0f, 1.0f, 1.0f};
        float specular[] = {0.2f, 1.0f, 0.2f, 1.0f};
        float position[] = {20.0f, 30.0f, 20.0f, 0.0f};

        gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ambient, 0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, difusse, 0);
        gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, position, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, specular, 0);

        float[] mambient = {0.1745f, 0.01175f, 0.01175f, 0.55f};
        float[] mdiffuse = {0.61424f, 0.04136f, 0.04136f, 0.55f};
        float[] mspecular = {0.727811f, 0.626959f, 0.626959f, 0.55f};
        float mshine = 76.8f;

        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, mambient, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_DIFFUSE, mdiffuse, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, mspecular, 0);
        gl.glMaterialf(GL.GL_FRONT, GL.GL_SHININESS, mshine);
        gl.glEnable(GL.GL_LIGHTING);//hilang
        gl.glEnable(GL.GL_LIGHT0);
        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glEnable(GL.GL_NORMALIZE);

        drawable.addMouseListener(this);
        drawable.addMouseMotionListener(this);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        if (height <= 0) {
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }
    
    static float zoom = 1.86f;
    static float out = 0.01f;
    static float plus = 0.003f;
    static float batas1 = 2.3f;
    static float batas2 = 1.87f;
    static float rotkaret = 0.0f;
    static float puter = 0.0f;

    static boolean bout = false;
    static boolean bin = false;

    public void display(GLAutoDrawable drawable) {

        if (bout) {
            zoom += plus;
            if (zoom > batas1) {
                bout = false;
            }
        }

        if (bin) {
            zoom -= plus;
            if (zoom < batas2) {
                bin = false;
            }
        }

        GL gl = drawable.getGL();
        GLU glu = new GLU();
// Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
// Reset the current matrix to the "identity"
        gl.glLoadIdentity();

        glu.gluLookAt(Cx, Cy, Cz,
                Lx, Ly, Lz,
                vertikal.x, vertikal.y, vertikal.z);

        gl.glTranslatef(-1f, 0f, -18f);

        gl.glRotatef(view_rotx, 1.0f, 0.0f, 0.0f);
        gl.glRotatef(view_roty, 0.0f, 1.0f, 0.0f);

        gl.glPushMatrix();
        gl.glColor3d(1, 0, 0);
        gl.glTranslatef(-0.95f, 1f, 1f);
        Objek.Balok(gl);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(-0.2f, 2f, 1.8f);
        Objek.Bola(gl);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(-1.5f, 2f, 3.5f);
        gl.glRotated(90, 0, 1, 0);
        Objek.Tabung(gl);
        gl.glPopMatrix();

        

        gl.glPushMatrix();
        gl.glTranslatef(0.5f, 3.2f, 2f);
        gl.glRotated(90, 1, 0, 0);
        Objek.Tabung2(gl);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(1f, 2.5f, 2f);
        gl.glRotated(45, 0, 0, -1);
        Objek.kotak(gl);
        gl.glPopMatrix();
                gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        oldMouseX = e.getX();
        oldMouseY = e.getY();
    }

    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Dimension size = e.getComponent().getSize();
        float thetaY = 360.0f * ((float) (x - oldMouseX) / (float) size.width);
        float thetaX = 360.0f * ((float) (oldMouseY - y) / (float) size.height);
        oldMouseX = x;
        oldMouseY = y;
        view_rotx += thetaX;
        view_roty += thetaY;
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void keyTyped(KeyEvent ke) {
    }

    public void keyPressed(KeyEvent ke) {
        System.out.println(ke.getKeyCode());
        if (ke.getKeyCode() == 38) {
            bout = true;
        } else if (ke.getKeyCode() == 40) {
            bin = true;
        } else if (ke.getKeyCode() == 32) {
            puter += 10;
        }

    }

    public void keyReleased(KeyEvent ke) {

    }

}
