import android.util.Log;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import java.util.List;

public class fli
{
  public efk<efn> a(efd paramefd, String paramString1, String paramString2, String paramString3)
  {
    if (Log.isLoggable("PeopleClientCall", 3)) {
      efj.a("removeCircle", new Object[] { paramString1, paramString2, paramString3 });
    }
    return paramefd.b(new fbd(this, paramefd, paramString1, paramString2, paramString3));
  }
  
  public efk<flj> a(efd paramefd, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return a(paramefd, paramString1, paramString2, paramString3, paramString4, true);
  }
  
  public efk<efn> a(efd paramefd, String paramString1, String paramString2, String paramString3, String paramString4, Boolean paramBoolean, String paramString5)
  {
    if (Log.isLoggable("PeopleClientCall", 3)) {
      efj.a("updateCircle", new Object[] { paramString1, paramString2, paramString3, paramString4, paramBoolean, paramString5 });
    }
    return paramefd.b(new fbe(this, paramefd, paramString1, paramString2, paramString3, paramString4, paramBoolean, paramString5));
  }
  
  public efk<flj> a(efd paramefd, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    if (Log.isLoggable("PeopleClientCall", 3))
    {
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = paramString1;
      arrayOfObject[1] = paramString2;
      arrayOfObject[2] = paramString3;
      arrayOfObject[3] = paramString4;
      arrayOfObject[4] = Boolean.valueOf(true);
      efj.a("addCircle", arrayOfObject);
    }
    return paramefd.b(new fbb(this, paramefd, paramString1, paramString2, paramString3, paramString4, true));
  }
  
  public efk<aip> a(efd paramefd, String paramString1, String paramString2, String paramString3, List<String> paramList1, List<String> paramList2)
  {
    return a(paramefd, paramString1, paramString2, paramString3, paramList1, paramList2, null);
  }
  
  public efk<aip> a(efd paramefd, String paramString1, String paramString2, String paramString3, List<String> paramList1, List<String> paramList2, FavaDiagnosticsEntity paramFavaDiagnosticsEntity)
  {
    if (Log.isLoggable("PeopleClientCall", 3)) {
      efj.a("updatePersonCircles", new Object[] { paramString1, paramString2, paramString3, paramList1, paramList2, null });
    }
    return paramefd.b(new fbf(this, paramefd, paramString1, paramString2, paramString3, paramList1, paramList2, null));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fli
 * JD-Core Version:    0.7.0.1
 */