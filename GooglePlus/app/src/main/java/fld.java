public final class fld
{
  public static final fld a = new fld();
  public int b = -999;
  public String c;
  public String d;
  public boolean e;
  
  public final String toString()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = "mFilterCircleType";
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = "mFilterCircleId";
    arrayOfObject[3] = this.c;
    arrayOfObject[4] = "mFilterCircleNamePrefix";
    arrayOfObject[5] = this.d;
    arrayOfObject[6] = "mGetVisibility";
    arrayOfObject[7] = Boolean.valueOf(this.e);
    return efj.a(arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fld
 * JD-Core Version:    0.7.0.1
 */