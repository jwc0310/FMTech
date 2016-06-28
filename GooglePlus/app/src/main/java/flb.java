import android.util.Log;

public class flb
{
  public efk<efn> a(efd paramefd, String paramString, boolean paramBoolean, String[] paramArrayOfString)
  {
    if (Log.isLoggable("PeopleClientCall", 3))
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = paramString;
      arrayOfObject[1] = Boolean.valueOf(paramBoolean);
      arrayOfObject[2] = paramArrayOfString;
      efj.a("setSyncToContactsSettings", arrayOfObject);
    }
    return paramefd.b(new fau(this, paramefd, paramString, paramBoolean, paramArrayOfString));
  }
  
  public efk<efn> a(efd paramefd, boolean paramBoolean)
  {
    if (Log.isLoggable("PeopleClientCall", 3))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Boolean.valueOf(paramBoolean);
      efj.a("setSyncToContactsEnabled", arrayOfObject);
    }
    return paramefd.b(new fat(this, paramefd, paramBoolean));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     flb
 * JD-Core Version:    0.7.0.1
 */