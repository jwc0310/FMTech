import android.util.Log;

public class flu
{
  public efk<efn> a(efd paramefd, String paramString1, String paramString2)
  {
    if (Log.isLoggable("PeopleClientCall", 3)) {
      efj.a("requestSyncByUserAction", new Object[] { paramString1, paramString2 });
    }
    return a(paramefd, paramString1, paramString2, 0L, true, false);
  }
  
  public efk<efn> a(efd paramefd, String paramString1, String paramString2, long paramLong, boolean paramBoolean)
  {
    if (Log.isLoggable("PeopleClientCall", 3))
    {
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = paramString1;
      arrayOfObject[1] = paramString2;
      arrayOfObject[2] = Long.valueOf(paramLong);
      arrayOfObject[3] = Boolean.valueOf(paramBoolean);
      efj.a("requestSync", arrayOfObject);
    }
    return a(paramefd, paramString1, paramString2, paramLong, false, paramBoolean);
  }
  
  public efk<efn> a(efd paramefd, String paramString1, String paramString2, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    return paramefd.a(new fbi(this, paramefd, paramString1, paramString2, paramLong, paramBoolean1, paramBoolean2));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     flu
 * JD-Core Version:    0.7.0.1
 */