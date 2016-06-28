import android.view.View;

final class bl
  extends bt
{
  bl(bk parambk) {}
  
  public final View a(int paramInt)
  {
    if (this.a.N == null) {
      throw new IllegalStateException("Fragment does not have a view");
    }
    return this.a.N.findViewById(paramInt);
  }
  
  public final boolean a()
  {
    return this.a.N != null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bl
 * JD-Core Version:    0.7.0.1
 */