/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

/**
 *
 * @author uasrpl
 */
public class Objek {

    static void Body(GL gl) {
        gl.glBegin(GL.GL_POLYGON); //bottom
        gl.glColor3d(0, 0, 0);
        gl.glVertex3f(1.7f, 0.0f, 0.0f);
        gl.glVertex3f(1.7f, 0.0f, 1.5f);
        gl.glVertex3f(2f, 0.0f, 1.5f);
        gl.glVertex3f(2f, 0.0f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); //left
        gl.glColor3d(0, 0, 0);
        gl.glVertex3f(1.7f, 0.0f, 0.0f);
        gl.glVertex3f(2f, 0.0f, 0.0f);
        gl.glVertex3f(2f, 1.0f, 0.0f);
        gl.glVertex3f(1.7f, 1.0f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); //top
        gl.glColor3d(0, 0, 0);
        gl.glVertex3f(1.7f, 1.05f, 0.0f);
        gl.glVertex3f(1.7f, 1.05f, 2f);
        gl.glVertex3f(1.9f, 1.05f, 2f);
        gl.glVertex3f(1.9f, 1.05f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); //top2
        gl.glColor3d(0.1, 0.1, 0.1);
        gl.glVertex3f(1.9f, 1.05f, 0.0f);
        gl.glVertex3f(1.9f, 1.05f, 2f);
        gl.glVertex3f(2f, 1.0f, 1.95f);
        gl.glVertex3f(2f, 1.0f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); //top3
        gl.glColor3d(0, 0, 1);
        gl.glVertex3f(2f, 1.0f, 1.5f);
        gl.glVertex3f(2f, 1.0f, 1.95f);
        gl.glVertex3f(2.3f, 0.85f, 1.80f);
        gl.glVertex3f(2.3f, 0.85f, 1.55f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//back
        gl.glVertex3f(1.7f, 0.0f, 0.0f);
        gl.glVertex3f(1.7f, 0.0f, 2f);
        gl.glVertex3f(1.7f, 1.05f, 2f);
        gl.glVertex3f(1.7f, 1.05f, 0.0f);
        gl.glEnd();

        gl.glColor3d(0, 0, 0);
        gl.glBegin(GL.GL_POLYGON);//front
        gl.glVertex3f(2.0f, 0.0f, 0.0f);
        gl.glVertex3f(2.0f, 0.0f, 1.5f);
        gl.glVertex3f(2.0f, 1f, 1.5f);
        gl.glVertex3f(2.0f, 1f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); //right
        gl.glColor3d(0, 0, 0);
        gl.glVertex3f(1.9f, 0.0f, 2.0f);
        gl.glVertex3f(2f, 0.0f, 1.98f);
        gl.glVertex3f(2.3f, 0.0f, 1.8f);
        
        gl.glColor3d(0.1, 0.1, 0.1);
        gl.glVertex3f(2.3f, 0.85f, 1.8f);
        gl.glVertex3f(2f, 1.0f, 1.98f);
        gl.glVertex3f(1.9f, 1.05f, 2.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//front2
        gl.glColor3d(0, 0, 0);
        gl.glVertex3f(2.3f, 0.0f, 1.55f);
        gl.glVertex3f(2.3f, 0.0f, 1.8f);
        gl.glVertex3f(2.3f, 0.85f, 1.8f);
        gl.glVertex3f(2.3f, 0.85f, 1.55f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); //right left
        gl.glColor3d(0, 0, 0);
        gl.glVertex3f(2f, 0.0f, 1.5f);
        gl.glVertex3f(2.3f, 0.0f, 1.55f);
        gl.glVertex3f(2.3f, 0.85f, 1.55f);
        gl.glVertex3f(2f, 1.0f, 1.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON); //right
        gl.glColor3d(0, 0, 0);
        gl.glVertex3f(1.7f, 0.0f, 2.0f);
        gl.glVertex3f(1.9f, 0.0f, 2.0f);
        gl.glVertex3f(1.9f, 1.05f, 2.0f);
        gl.glVertex3f(1.7f, 1.05f, 2.0f);
        gl.glEnd();
    }

    static void Lcd(GL gl) {
        gl.glBegin(GL.GL_POLYGON); //front
        gl.glColor3d(0.5, 0.5, 0.5);
        gl.glVertex3f(1f, 0.9f, 0.0f);
        gl.glVertex3f(2.4f, 0.9f, 0f);
        gl.glVertex3f(2.4f, 0.0f, 0f);
        gl.glVertex3f(1f, 0.0f, 0.0f);
        gl.glEnd();
    }
        
        

    static void Flash(GL gl) {
        gl.glBegin(GL.GL_POLYGON); //front
        gl.glColor3d(0.8, 0.8, 0.8);        
        gl.glVertex3f(0f, 0.15f, 0.0f);
        gl.glVertex3f(0.3f, 0.15f, 0f);
        gl.glVertex3f(0.3f, 0.0f, 0f);
        gl.glVertex3f(0f, 0.0f, 0.0f);
        gl.glEnd();

    }
    
    static void Shutter(GL gl) {
        float BODY_LENGTH = 0.05f;//panjang
        float BODY_RADIUS = 0.08f;//lebar
        float BODY_LENGTH2 = 0.03f;
        float BODY_RADIUS2 = 0.05f;
        
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        gl.glColor3d(0, 0, 0);
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS,BODY_LENGTH, SLICES, STACKS);//tabung
        gl.glColor3d(0.2, 0.2, 0.2);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);//tutup
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        
        gl.glTranslated(0, 0, -0.07);
        gl.glColor3d(0.5, 0.5, 0.5);
        glu.gluCylinder(q, BODY_RADIUS2, BODY_RADIUS2,BODY_LENGTH2, SLICES, STACKS);
        gl.glColor3d(0.8, 0.8, 0.8);
        glu.gluDisk(q, 0.0f, BODY_RADIUS2, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH2);
        glu.gluDisk(q, 0.0f, BODY_RADIUS2, SLICES, STACKS);

    }
    
    static void Preset(GL gl) {
        float BODY_LENGTH = 0.05f;
        float BODY_RADIUS = 0.2f;
        float BODY_LENGTH2 = 0.03f;
        float BODY_RADIUS2 = 0.05f;
        float BODY_LENGTH3 = 0.075f;
        float BODY_RADIUS3 = 0.15f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        gl.glColor3d(0, 0, 0);
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS,BODY_LENGTH, SLICES, STACKS);//besar
        gl.glColor3d(0.2, 0.2, 0.2);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        
        gl.glTranslated(0, 0, -0.055);
        gl.glColor3d(0.5, 0.5, 0.5);
        glu.gluCylinder(q, BODY_RADIUS2, BODY_RADIUS2,BODY_LENGTH2, SLICES, STACKS);//tengah
        gl.glColor3d(0, 0, 0);
        glu.gluDisk(q, 0.0f, BODY_RADIUS2, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH2);
        glu.gluDisk(q, 0.0f, BODY_RADIUS2, SLICES, STACKS);
        
        gl.glPushMatrix();
        gl.glTranslated(0.1, 0.3, -0.01);
        gl.glColor3d(1, 0, 0);
        glu.gluCylinder(q, BODY_RADIUS2, BODY_RADIUS2,BODY_LENGTH2, SLICES, STACKS);//atas kiri
        gl.glColor3d(0, 0, 0);
        glu.gluDisk(q, 0.0f, BODY_RADIUS2, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH2);
        glu.gluDisk(q, 0.0f, BODY_RADIUS2, SLICES, STACKS);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glTranslated(-0.1, 0.3, -0.01);
        gl.glColor3d(0.2, 0.2, 0.2);
        glu.gluCylinder(q, BODY_RADIUS2, BODY_RADIUS2,BODY_LENGTH2, SLICES, STACKS);//atas kanan
        gl.glColor3d(0, 0, 0);
        glu.gluDisk(q, 0.0f, BODY_RADIUS2, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH2);
        glu.gluDisk(q, 0.0f, BODY_RADIUS2, SLICES, STACKS);
        gl.glPopMatrix();
        
        gl.glPushMatrix();
        gl.glTranslated(0.1, -0.3, -0.01);
        gl.glColor3d(0.2 , 0.2, 0.2);
        glu.gluCylinder(q, BODY_RADIUS2, BODY_RADIUS2,BODY_LENGTH2, SLICES, STACKS);//bawah
        gl.glColor3d(0, 0, 0);
        glu.gluDisk(q, 0.0f, BODY_RADIUS2, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH2);
        glu.gluDisk(q, 0.0f, BODY_RADIUS2, SLICES, STACKS);
        gl.glPopMatrix();
        
        
        gl.glPushMatrix();
        gl.glTranslated(0, 0.5, 0.08);
        gl.glRotated(90, 1, 0, 0);
        gl.glColor3d(0, 1, 0);
        glu.gluCylinder(q, BODY_RADIUS3, BODY_RADIUS3,BODY_LENGTH3, SLICES, STACKS);//puter2
        gl.glColor3d(0.2, 0.2, 0.2);
        glu.gluDisk(q, 0.0f, BODY_RADIUS3, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH3);
        glu.gluDisk(q, 0.0f, BODY_RADIUS3, SLICES, STACKS);
        gl.glPopMatrix();

    }
    static void Lensa(GL gl) {
        float BODY_LENGTH = 0.05f;
        float BODY_RADIUS = 0.2f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        gl.glColor3d(0, 0, 0);
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        gl.glColor3d(0.5, 0.5, 0.5);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0);
        gl.glColor3d(0.8, 0.8, 0.8);
        glu.gluCylinder(q, 0.2, 0.3, 0.01, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0.01f);
        gl.glColor3d(0.5, 0.5, 0.5);
        glu.gluCylinder(q, 0.3, 0.35, 0.05, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0.05f);
        gl.glColor3d(0, 0, 0);
        glu.gluCylinder(q, 0.35, 0.35, 0.5, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0.5f);
        gl.glColor3d(0.5, 0.5, 0.5);
        glu.gluCylinder(q, 0.35, 0.4, 0.05, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0.05f);
        gl.glColor3d(0, 0, 0);
        glu.gluCylinder(q, 0.4, 0.4, 0.2, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0f);
        gl.glColor3d(0, 0, 0);
        glu.gluCylinder(q, 0.35, 0.35, 0.2, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0.2f);
        gl.glColor3d(0.5, 0.5, 0.5);
        glu.gluCylinder(q, 0.34, 0.4, 0, SLICES, STACKS);

    }

    static void Zoom(GL gl) {
        float BODY_LENGTH = 0.05f;
        float BODY_RADIUS = 0.2f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        gl.glTranslatef(0.0f, 0.0f, -0.5f);
        gl.glColor3d(0, 0, 0);
        glu.gluCylinder(q, 0.34, 0.34, 0.5, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0.5f);
        gl.glColor3d(0.5, 0.5, 0.5);
        glu.gluCylinder(q, 0.34, 0.4, 0.01, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0.01f);
        gl.glColor3d(0, 0, 0);
        glu.gluCylinder(q, 0.4, 0.4, 0.08, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0.07f);
        gl.glColor3d(0, 0, 0);
        glu.gluCylinder(q, 0.34, 0.4, 0.01, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0f);
        gl.glColor3d(0.5, 0.5, 0.5);
        glu.gluCylinder(q, 0.4, 0.45, 0.03, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0.03f);
        gl.glColor3d(0, 0, 0);
        glu.gluCylinder(q, 0.45, 0.5, 0.5, SLICES, STACKS);

    }

    static void Karetz(GL gl) {
        float BODY_LENGTH = 0.05f;
        float BODY_RADIUS = 0.2f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        gl.glTranslatef(0.0f, 0.0f, 0f);
        gl.glColor3d(0, 0, 0);
        glu.gluCylinder(q, 0.36, 0.36, 0.25, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, -0.01f);
        gl.glColor3d(0.3, 0.3, 0.3);
        glu.gluCylinder(q, 0.35, 0.36, 0.01, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0.26f);
        gl.glColor3d(0.3, 0.3, 0.3);
        glu.gluCylinder(q, 0.36, 0.35, 0.01, SLICES, STACKS);

        //
        gl.glTranslatef(0.0f, 0.36f, -0.25f);
        gl.glColor3d(0.3, 0.3, 0.3);
        glu.gluCylinder(q, 0.01, 0.01, 0.25, SLICES, STACKS);

        gl.glTranslatef(0.0f, -0.72f, 0);
        gl.glColor3d(0.3, 0.3, 0.3);
        glu.gluCylinder(q, 0.01, 0.01, 0.25, SLICES, STACKS);

        gl.glTranslatef(0.36f, 0.36f, 0);
        gl.glColor3d(0.3, 0.3, 0.3);
        glu.gluCylinder(q, 0.01, 0.01, 0.25, SLICES, STACKS);

        gl.glTranslatef(-0.72f, 0f, 0);
        gl.glColor3d(0.3, 0.3, 0.3);
        glu.gluCylinder(q, 0.01, 0.01, 0.25, SLICES, STACKS);

    }

    static void Karetf(GL gl) {
        float BODY_LENGTH = 0.05f;
        float BODY_RADIUS = 0.2f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        gl.glTranslatef(0.0f, 0.0f, 0f);
        gl.glColor3d(0, 0, 0);
        glu.gluCylinder(q, 0.405, 0.405, 0.1, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, -0.01f);
        gl.glColor3d(0.3, 0.3, 0.3);
        glu.gluCylinder(q, 0.4, 0.405, 0.01, SLICES, STACKS);

        gl.glTranslatef(0.0f, 0.0f, 0.11f);
        gl.glColor3d(0.3, 0.3, 0.3);
        glu.gluCylinder(q, 0.405, 0.4, 0.01, SLICES, STACKS);

    }
}
