import android.os.Bundle;

final class axv
  extends Enum<axv>
{
  static
  {
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = a;
    arrayOfInt[1] = b;
    arrayOfInt[2] = c;
    d = arrayOfInt;
  }
  
  public static int a(Bundle paramBundle)
  {
    if (paramBundle.containsKey("all_photos_row_id")) {
      return c;
    }
    ipf localipf = (ipf)paramBundle.getParcelable("photo_ref");
    if (localipf != null)
    {
      if (localipf.d != null) {}
      for (int j = 1; j != 0; j = 0) {
        return b;
      }
    }
    if (localipf != null)
    {
      if (localipf.c != null) {}
      for (int i = 1; i != 0; i = 0) {
        return a;
      }
    }
    throw new IllegalArgumentException("Unknown PhotoOrigin");
  }
  
  public static int[] a()
  {
    return (int[])d.clone();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     axv
 * JD-Core Version:    0.7.0.1
 */