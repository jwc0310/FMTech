import android.opengl.GLES20;

final class ibd
  extends ibc
{
  public ibd(String paramString)
  {
    super(paramString);
  }
  
  public final void a(int paramInt)
  {
    this.a = GLES20.glGetUniformLocation(paramInt, this.b);
    iba.d();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ibd
 * JD-Core Version:    0.7.0.1
 */