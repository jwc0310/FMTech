import android.graphics.Bitmap;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;

public final class iba
  implements iaz
{
  private static final String g = iba.class.getSimpleName();
  private static final float[] h = { 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F };
  private static final ibe z = new ibe();
  public float[] a = new float[''];
  public int b = 0;
  public int c;
  public int d;
  public float[] e = new float[16];
  public ArrayList<ibf> f;
  private float[] i = new float[8];
  private ibj j = new ibj();
  private int k = 0;
  private int l;
  private int m;
  private int n;
  private ibc[] o;
  private ibc[] p;
  private ibc[] q;
  private ibc[] r;
  private final ibj s;
  private int t;
  private final float[] u;
  private final RectF v;
  private final RectF w;
  private final float[] x;
  private final int[] y;
  
  public iba()
  {
    ibc[] arrayOfibc1 = new ibc[3];
    arrayOfibc1[0] = new ibb("aPosition");
    arrayOfibc1[1] = new ibd("uMatrix");
    arrayOfibc1[2] = new ibd("uColor");
    this.o = arrayOfibc1;
    ibc[] arrayOfibc2 = new ibc[5];
    arrayOfibc2[0] = new ibb("aPosition");
    arrayOfibc2[1] = new ibd("uMatrix");
    arrayOfibc2[2] = new ibd("uTextureMatrix");
    arrayOfibc2[3] = new ibd("uTextureSampler");
    arrayOfibc2[4] = new ibd("uAlpha");
    this.p = arrayOfibc2;
    ibc[] arrayOfibc3 = new ibc[5];
    arrayOfibc3[0] = new ibb("aPosition");
    arrayOfibc3[1] = new ibd("uMatrix");
    arrayOfibc3[2] = new ibd("uTextureMatrix");
    arrayOfibc3[3] = new ibd("uTextureSampler");
    arrayOfibc3[4] = new ibd("uAlpha");
    this.q = arrayOfibc3;
    ibc[] arrayOfibc4 = new ibc[5];
    arrayOfibc4[0] = new ibb("aPosition");
    arrayOfibc4[1] = new ibd("uMatrix");
    arrayOfibc4[2] = new ibb("aTextureCoordinate");
    arrayOfibc4[3] = new ibd("uTextureSampler");
    arrayOfibc4[4] = new ibd("uAlpha");
    this.r = arrayOfibc4;
    this.s = new ibj();
    new ibj();
    this.t = 0;
    this.f = new ArrayList();
    this.u = new float[32];
    this.v = new RectF();
    this.w = new RectF();
    this.x = new float[16];
    this.y = new int[1];
    Matrix.setIdentityM(this.x, 0);
    Matrix.setIdentityM(this.a, this.b);
    this.i[this.k] = 1.0F;
    this.f.add(null);
    float[] arrayOfFloat = h;
    FloatBuffer localFloatBuffer = ByteBuffer.allocateDirect(arrayOfFloat.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    localFloatBuffer.put(arrayOfFloat, 0, arrayOfFloat.length).position(0);
    z.a(1, this.y, 0);
    d();
    int i1 = this.y[0];
    GLES20.glBindBuffer(34962, i1);
    d();
    GLES20.glBufferData(34962, localFloatBuffer.capacity() << 2, localFloatBuffer, 35044);
    d();
    this.n = i1;
    int i2 = a(35633, "uniform mat4 uMatrix;\nattribute vec2 aPosition;\nvoid main() {\n  vec4 pos = vec4(aPosition, 0.0, 1.0);\n  gl_Position = uMatrix * pos;\n}\n");
    int i3 = a(35633, "uniform mat4 uMatrix;\nuniform mat4 uTextureMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec4 pos = vec4(aPosition, 0.0, 1.0);\n  gl_Position = uMatrix * pos;\n  vTextureCoord = (uTextureMatrix * pos).xy;\n}\n");
    int i4 = a(35633, "uniform mat4 uMatrix;\nattribute vec2 aPosition;\nattribute vec2 aTextureCoordinate;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec4 pos = vec4(aPosition, 0.0, 1.0);\n  gl_Position = uMatrix * pos;\n  vTextureCoord = aTextureCoordinate;\n}\n");
    int i5 = a(35632, "precision mediump float;\nuniform vec4 uColor;\nvoid main() {\n  gl_FragColor = uColor;\n}\n");
    int i6 = a(35632, "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nuniform sampler2D uTextureSampler;\nvoid main() {\n  gl_FragColor = texture2D(uTextureSampler, vTextureCoord);\n  gl_FragColor *= uAlpha;\n}\n");
    int i7 = a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nuniform samplerExternalOES uTextureSampler;\nvoid main() {\n  gl_FragColor = texture2D(uTextureSampler, vTextureCoord);\n  gl_FragColor *= uAlpha;\n}\n");
    a(i2, i5, this.o);
    this.l = a(i3, i6, this.p);
    this.m = a(i3, i7, this.q);
    a(i4, i6, this.r);
    GLES20.glBlendFunc(1, 771);
    d();
  }
  
  private final int a(int paramInt1, int paramInt2, ibc[] paramArrayOfibc)
  {
    int i1 = GLES20.glCreateProgram();
    d();
    if (i1 == 0)
    {
      int i4 = GLES20.glGetError();
      throw new RuntimeException(37 + "Cannot create GL program: " + i4);
    }
    GLES20.glAttachShader(i1, paramInt1);
    d();
    GLES20.glAttachShader(i1, paramInt2);
    d();
    GLES20.glLinkProgram(i1);
    d();
    int[] arrayOfInt = this.y;
    GLES20.glGetProgramiv(i1, 35714, arrayOfInt, 0);
    int i2 = arrayOfInt[0];
    int i3 = 0;
    if (i2 != 1)
    {
      Log.e(g, "Could not link program: ");
      Log.e(g, GLES20.glGetProgramInfoLog(i1));
      GLES20.glDeleteProgram(i1);
      i1 = 0;
    }
    while (i3 < paramArrayOfibc.length)
    {
      paramArrayOfibc[i3].a(i1);
      i3++;
    }
    return i1;
  }
  
  private static int a(int paramInt, String paramString)
  {
    int i1 = GLES20.glCreateShader(paramInt);
    GLES20.glShaderSource(i1, paramString);
    d();
    GLES20.glCompileShader(i1);
    d();
    return i1;
  }
  
  private static void a(RectF paramRectF1, RectF paramRectF2, iax paramiax)
  {
    int i1 = paramiax.b();
    int i2 = paramiax.c();
    int i3 = paramiax.d();
    int i4 = paramiax.e();
    paramRectF1.left /= i3;
    paramRectF1.right /= i3;
    paramRectF1.top /= i4;
    paramRectF1.bottom /= i4;
    float f1 = i1 / i3;
    if (paramRectF1.right > f1)
    {
      paramRectF2.right = (paramRectF2.left + paramRectF2.width() * (f1 - paramRectF1.left) / paramRectF1.width());
      paramRectF1.right = f1;
    }
    float f2 = i2 / i4;
    if (paramRectF1.bottom > f2)
    {
      paramRectF2.bottom = (paramRectF2.top + paramRectF2.height() * (f2 - paramRectF1.top) / paramRectF1.height());
      paramRectF1.bottom = f2;
    }
  }
  
  public static void c()
  {
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    d();
    GLES20.glClear(16384);
    d();
  }
  
  public static void d()
  {
    int i1 = GLES20.glGetError();
    if (i1 != 0)
    {
      Throwable localThrowable = new Throwable();
      Log.e(g, 21 + "GL error: " + i1, localThrowable);
    }
  }
  
  public final ibe a()
  {
    return z;
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    int i1 = this.b;
    float[] arrayOfFloat = this.a;
    int i2 = i1 + 12;
    arrayOfFloat[i2] += paramFloat1 * arrayOfFloat[i1] + paramFloat2 * arrayOfFloat[(i1 + 4)];
    int i3 = i1 + 13;
    arrayOfFloat[i3] += paramFloat1 * arrayOfFloat[(i1 + 1)] + paramFloat2 * arrayOfFloat[(i1 + 5)];
    int i4 = i1 + 14;
    arrayOfFloat[i4] += paramFloat1 * arrayOfFloat[(i1 + 2)] + paramFloat2 * arrayOfFloat[(i1 + 6)];
    int i5 = i1 + 15;
    arrayOfFloat[i5] += paramFloat1 * arrayOfFloat[(i1 + 3)] + paramFloat2 * arrayOfFloat[(i1 + 7)];
  }
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if (paramFloat1 == 0.0F) {
      return;
    }
    float[] arrayOfFloat1 = this.u;
    Matrix.setRotateM(arrayOfFloat1, 0, paramFloat1, 0.0F, 0.0F, 1.0F);
    float[] arrayOfFloat2 = this.a;
    int i1 = this.b;
    Matrix.multiplyMM(arrayOfFloat1, 16, arrayOfFloat2, i1, arrayOfFloat1, 0);
    System.arraycopy(arrayOfFloat1, 16, arrayOfFloat2, i1, 16);
  }
  
  public final void a(int paramInt)
  {
    int i1 = this.b;
    this.b = (16 + this.b);
    if (this.a.length <= this.b) {
      this.a = Arrays.copyOf(this.a, this.a.length << 1);
    }
    System.arraycopy(this.a, i1, this.a, this.b, 16);
    this.j.a(2);
  }
  
  public final void a(iax paramiax, int paramInt1, int paramInt2)
  {
    paramiax.f();
    GLES20.glBindTexture(3553, paramiax.a);
    d();
    GLES20.glTexImage2D(3553, 0, paramInt1, paramiax.d(), paramiax.e(), 0, paramInt1, paramInt2, null);
  }
  
  public final void a(iax paramiax, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt3 <= 0) || (paramInt4 <= 0)) {
      return;
    }
    RectF localRectF1 = this.v;
    int i1 = paramiax.b();
    int i2 = paramiax.c();
    boolean bool = paramiax.e;
    int i3 = 0;
    int i4 = 0;
    if (bool)
    {
      i4 = 1;
      i3 = 1;
      i1--;
      i2--;
    }
    localRectF1.set(i4, i3, i1, i2);
    this.w.set(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
    a(this.v, this.w, paramiax);
    RectF localRectF2 = this.v;
    RectF localRectF3 = this.w;
    this.x[0] = localRectF2.width();
    this.x[5] = localRectF2.height();
    this.x[12] = localRectF2.left;
    this.x[13] = localRectF2.top;
    float[] arrayOfFloat = this.x;
    paramiax.f();
    ibc[] arrayOfibc = this.p;
    GLES20.glUseProgram(this.l);
    d();
    int i5;
    if ((!paramiax.h()) || (this.i[this.k] < 0.95F))
    {
      i5 = 1;
      if (i5 == 0) {
        break label571;
      }
      GLES20.glEnable(3042);
      d();
    }
    for (;;)
    {
      GLES20.glActiveTexture(33984);
      d();
      paramiax.a(this);
      GLES20.glBindTexture(paramiax.f(), paramiax.a);
      d();
      GLES20.glUniform1i(arrayOfibc[3].a, 0);
      d();
      GLES20.glUniform1f(arrayOfibc[4].a, this.i[this.k]);
      d();
      GLES20.glBindBuffer(34962, this.n);
      d();
      GLES20.glVertexAttribPointer(arrayOfibc[0].a, 2, 5126, false, 8, 0);
      d();
      GLES20.glBindBuffer(34962, 0);
      d();
      GLES20.glUniformMatrix4fv(arrayOfibc[2].a, 1, false, arrayOfFloat, 0);
      d();
      if (paramiax.a())
      {
        a(2);
        a(0.0F, localRectF3.centerY());
        Matrix.scaleM(this.a, this.b, 1.0F, -1.0F, 1.0F);
        a(0.0F, -localRectF3.centerY());
      }
      float f1 = localRectF3.left;
      float f2 = localRectF3.top;
      float f3 = localRectF3.width();
      float f4 = localRectF3.height();
      Matrix.translateM(this.u, 0, this.a, this.b, f1, f2, 0.0F);
      Matrix.scaleM(this.u, 0, f3, f4, 1.0F);
      Matrix.multiplyMM(this.u, 16, this.e, 0, this.u, 0);
      GLES20.glUniformMatrix4fv(arrayOfibc[1].a, 1, false, this.u, 16);
      d();
      int i6 = arrayOfibc[0].a;
      GLES20.glEnableVertexAttribArray(i6);
      d();
      GLES20.glDrawArrays(5, 0, 4);
      d();
      GLES20.glDisableVertexAttribArray(i6);
      d();
      if (paramiax.a()) {
        b();
      }
      this.t = (1 + this.t);
      return;
      i5 = 0;
      break;
      label571:
      GLES20.glDisable(3042);
      d();
    }
  }
  
  public final void a(iax paramiax, int paramInt1, int paramInt2, Bitmap paramBitmap, int paramInt3, int paramInt4)
  {
    paramiax.f();
    GLES20.glBindTexture(3553, paramiax.a);
    d();
    GLUtils.texSubImage2D(3553, 0, paramInt1, paramInt2, paramBitmap, paramInt3, paramInt4);
  }
  
  public final void a(iax paramiax, Bitmap paramBitmap)
  {
    paramiax.f();
    GLES20.glBindTexture(3553, paramiax.a);
    d();
    GLUtils.texImage2D(3553, 0, paramBitmap, 0);
  }
  
  public final void a(iax paramiax, RectF paramRectF1, RectF paramRectF2)
  {
    if ((paramRectF2.width() <= 0.0F) || (paramRectF2.height() <= 0.0F)) {
      return;
    }
    this.v.set(paramRectF1);
    this.w.set(paramRectF2);
    a(this.v, this.w, paramiax);
    RectF localRectF1 = this.v;
    RectF localRectF2 = this.w;
    this.x[0] = localRectF1.width();
    this.x[5] = localRectF1.height();
    this.x[12] = localRectF1.left;
    this.x[13] = localRectF1.top;
    float[] arrayOfFloat = this.x;
    paramiax.f();
    ibc[] arrayOfibc = this.p;
    GLES20.glUseProgram(this.l);
    d();
    int i1;
    if ((!paramiax.h()) || (this.i[this.k] < 0.95F))
    {
      i1 = 1;
      if (i1 == 0) {
        break label510;
      }
      GLES20.glEnable(3042);
      d();
    }
    for (;;)
    {
      GLES20.glActiveTexture(33984);
      d();
      paramiax.a(this);
      GLES20.glBindTexture(paramiax.f(), paramiax.a);
      d();
      GLES20.glUniform1i(arrayOfibc[3].a, 0);
      d();
      GLES20.glUniform1f(arrayOfibc[4].a, this.i[this.k]);
      d();
      GLES20.glBindBuffer(34962, this.n);
      d();
      GLES20.glVertexAttribPointer(arrayOfibc[0].a, 2, 5126, false, 8, 0);
      d();
      GLES20.glBindBuffer(34962, 0);
      d();
      GLES20.glUniformMatrix4fv(arrayOfibc[2].a, 1, false, arrayOfFloat, 0);
      d();
      if (paramiax.a())
      {
        a(2);
        a(0.0F, localRectF2.centerY());
        Matrix.scaleM(this.a, this.b, 1.0F, -1.0F, 1.0F);
        a(0.0F, -localRectF2.centerY());
      }
      float f1 = localRectF2.left;
      float f2 = localRectF2.top;
      float f3 = localRectF2.width();
      float f4 = localRectF2.height();
      Matrix.translateM(this.u, 0, this.a, this.b, f1, f2, 0.0F);
      Matrix.scaleM(this.u, 0, f3, f4, 1.0F);
      Matrix.multiplyMM(this.u, 16, this.e, 0, this.u, 0);
      GLES20.glUniformMatrix4fv(arrayOfibc[1].a, 1, false, this.u, 16);
      d();
      int i2 = arrayOfibc[0].a;
      GLES20.glEnableVertexAttribArray(i2);
      d();
      GLES20.glDrawArrays(5, 0, 4);
      d();
      GLES20.glDisableVertexAttribArray(i2);
      d();
      if (paramiax.a()) {
        b();
      }
      this.t = (1 + this.t);
      return;
      i1 = 0;
      break;
      label510:
      GLES20.glDisable(3042);
      d();
    }
  }
  
  public final boolean a(iax paramiax)
  {
    int i1 = 1;
    if (paramiax.b == i1) {}
    for (;;)
    {
      if (i1 != 0) {
        synchronized (this.s)
        {
          this.s.a(paramiax.a);
          return i1;
        }
      }
      return i1;
      int i2 = 0;
    }
  }
  
  public final void b()
  {
    int i1 = 1;
    ibj localibj = this.j;
    localibj.b = (-1 + localibj.b);
    int i2 = localibj.a[localibj.b];
    int i3;
    if ((i2 & 0x1) == i1)
    {
      i3 = i1;
      if (i3 != 0) {
        this.k = (-1 + this.k);
      }
      if ((i2 & 0x2) != 2) {
        break label81;
      }
    }
    for (;;)
    {
      if (i1 != 0) {
        this.b = (-16 + this.b);
      }
      return;
      i3 = 0;
      break;
      label81:
      i1 = 0;
    }
  }
  
  public final void b(iax paramiax)
  {
    paramiax.f();
    GLES20.glBindTexture(3553, paramiax.a);
    d();
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    GLES20.glTexParameterf(3553, 10241, 9729.0F);
    GLES20.glTexParameterf(3553, 10240, 9729.0F);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iba
 * JD-Core Version:    0.7.0.1
 */