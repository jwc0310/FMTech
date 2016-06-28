import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;

final class amh
  extends anc
{
  amh(ame paramame)
  {
    super(paramame);
  }
  
  public final boolean a(Integer paramInteger)
  {
    this.b.a.a = paramInteger.intValue();
    this.b.a(this.b.a, true);
    int i = this.b.N().getParameterInteger(3);
    if (paramInteger.intValue() != i)
    {
      this.b.a(3, paramInteger, true);
      return true;
    }
    efj.Cv.a(this.b.N(), 2);
    this.b.O();
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     amh
 * JD-Core Version:    0.7.0.1
 */