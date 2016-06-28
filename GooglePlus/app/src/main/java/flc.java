import android.util.Log;

public class flc
{
  public efk<flf> a(efd paramefd, fle paramfle)
  {
    if (Log.isLoggable("PeopleClientCall", 3)) {
      efj.a("loadOwners", new Object[] { paramfle });
    }
    if (paramfle != null) {}
    for (;;)
    {
      return paramefd.a(new fav(this, paramefd, paramfle));
      paramfle = fle.a;
    }
  }
  
  public efk<fla> a(efd paramefd, String paramString1, String paramString2, fld paramfld)
  {
    if (Log.isLoggable("PeopleClientCall", 3)) {
      efj.a("loadCircles", new Object[] { paramString1, paramString2, paramfld });
    }
    if (paramfld != null) {}
    for (fld localfld = paramfld;; localfld = fld.a) {
      return paramefd.a(new fax(this, paramefd, paramString1, paramString2, localfld));
    }
  }
  
  public efk<flh> a(efd paramefd, String paramString1, String paramString2, flg paramflg)
  {
    if (Log.isLoggable("PeopleClientCall", 3)) {
      efj.a("loadPeople", new Object[] { paramString1, paramString2, paramflg });
    }
    return paramefd.a(new faz(this, paramefd, paramString1, paramString2, paramflg));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     flc
 * JD-Core Version:    0.7.0.1
 */