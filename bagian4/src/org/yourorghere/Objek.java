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
 * @author rama
 */
public class Objek {

    static void Balok(GL gl) {
        gl.glBegin(GL.GL_POLYGON);/* f1: Surface bagian depan */
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 4.5f);
        gl.glVertex3f(2.0f, 0.0f, 4.5f);
        gl.glVertex3f(2.0f, 0.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f2: Surface bagian bawah (ABFE) */
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(2.0f, 0.0f, 0.0f);
        gl.glVertex3f(2.0f, 2.0f, 0.0f);
        gl.glVertex3f(0.0f, 2.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f3:Surface bagian belakang (CDHG)*/
        gl.glVertex3f(2.0f, 2.0f, 0.0f);
        gl.glVertex3f(2.0f, 2.0f, 4.5f);
        gl.glVertex3f(0.0f, 2.0f, 4.5f);
        gl.glVertex3f(0.0f, 2.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f4: Surface bagian atas (EFGH)*/
        gl.glVertex3f(2.0f, 2.0f, 4.5f);
        gl.glVertex3f(2.0f, 0.0f, 4.5f);
        gl.glVertex3f(0.0f, 0.0f, 4.5f);
        gl.glVertex3f(0.0f, 2.0f, 4.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f5: Surface bagian kiri
(ADEH)*/
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 2.0f, 0.0f);
        gl.glVertex3f(0.0f, 2.0f, 4.5f);
        gl.glVertex3f(0.0f, 0.0f, 4.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f6: Surface bagian kanan (BCFG)*/
        gl.glVertex3f(2.0f, 0.0f, 0.0f);
        gl.glVertex3f(2.0f, 0.0f, 4.5f);
        gl.glVertex3f(2.0f, 2.0f, 4.5f);
        gl.glVertex3f(2.0f, 2.0f, 0.0f);
        gl.glEnd();
    }

    static void kotak(GL gl) {
        gl.glBegin(GL.GL_POLYGON);/* f1: Surface bagian depan */
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 2.5f);
        gl.glVertex3f(1.5f, 0.0f, 2.5f);
        gl.glVertex3f(1.5f, 0.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f2: Surface bagian bawah (ABFE) */
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(1.5f, 0.0f, 0.0f);
        gl.glVertex3f(1.5f, 0.25f, 0.0f);
        gl.glVertex3f(0.0f, 0.25f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f3:Surface bagian belakang (CDHG)*/
        gl.glVertex3f(1.5f, 0.25f, 0.0f);
        gl.glVertex3f(1.5f, 0.25f, 2.5f);
        gl.glVertex3f(0.0f, 0.25f, 2.5f);
        gl.glVertex3f(0.0f, 0.25f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f4: Surface bagian atas (EFGH)*/
        gl.glVertex3f(1.5f, 0.25f, 2.5f);
        gl.glVertex3f(1.5f, 0.0f, 2.5f);
        gl.glVertex3f(0.0f, 0.0f, 2.5f);
        gl.glVertex3f(0.0f, 0.25f, 2.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f5: Surface bagian kiri
(ADEH)*/
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.25f, 0.0f);
        gl.glVertex3f(0.0f, 0.25f, 2.5f);
        gl.glVertex3f(0.0f, 0.0f, 2.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/* f6: Surface bagian kanan (BCFG)*/
        gl.glVertex3f(1.5f, 0.0f, 0.0f);
        gl.glVertex3f(1.5f, 0.0f, 2.5f);
        gl.glVertex3f(1.5f, 0.25f, 2.5f);
        gl.glVertex3f(1.5f, 0.25f, 0.0f);
        gl.glEnd();
    }

    static void Bola(GL gl) {
        float BODY_RADIUS = 0.5f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
    }

    static void Tabung(GL gl) {
        //tinggi
        float BODY_LENGTH = 2.0f;
//diameter
        float BODY_RADIUS = 1.0f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS,
                BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
//lingkaran untuk tutup atas
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
//lingkaran untuk tutup bawah
    }

    static void Tabung2(GL gl) {
        float BODY_LENGTH = 0.25f;
        float BODY_RADIUS = 0.5f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS,
                BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
//lingkaran untuk tutup atas
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
//lingkaran untuk tutup bawah
    }}
