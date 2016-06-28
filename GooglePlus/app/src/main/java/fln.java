import android.util.Log;

public class fln
{
  public efk<efn> a(efd paramefd, flo paramflo, int paramInt)
  {
    if (Log.isLoggable("PeopleClientCall", 3))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      efj.a("registerOnDataChangedListenerForAllOwners", arrayOfObject);
    }
    return a(paramefd, paramflo, null, null, paramInt);
  }
  
  public efk<efn> a(efd paramefd, flo paramflo, String paramString1, String paramString2, int paramInt)
  {
    return paramefd.a(new fbh(this, paramefd, paramefd, paramflo, null, null, paramInt));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fln
 * JD-Core Version:    0.7.0.1
 */