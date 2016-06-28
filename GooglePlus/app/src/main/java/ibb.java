import android.opengl.GLES20;

final class ibb
  extends ibc
{
  public ibb(String paramString)
  {
    super(paramString);
  }
  
  public final void a(int paramInt)
  {
    this.a = GLES20.glGetAttribLocation(paramInt, this.b);
    iba.d();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ibb
 * JD-Core Version:    0.7.0.1
 */