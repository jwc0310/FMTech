import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.util.List;

public class kmf
  implements gjg, ilt, inj
{
  final giz a;
  private final Context b;
  
  public kmf(Context paramContext)
  {
    this.b = paramContext;
    this.a = ((giz)mbb.a(paramContext, giz.class));
  }
  
  public final void a(int paramInt)
  {
    gjb localgjb = this.a.a(paramInt);
    String str;
    if ((!efj.z(this.b, paramInt)) && (localgjb.c("logged_in")))
    {
      str = this.a.a(paramInt).b("sharebox_default_acl_base64");
      if (str != null) {}
    }
    else
    {
      return;
    }
    this.a.b(paramInt).e("sharebox_default_acl_base64");
    try
    {
      byte[] arrayOfByte = Base64.decode(str, 0);
      ome localome = new ome();
      qat.b(localome, arrayOfByte, 0, arrayOfByte.length);
      a(paramInt, localome);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      Log.e("SharekitAccountSettings", "Invalid acl base64", localIllegalArgumentException);
      return;
    }
    catch (qas localqas)
    {
      Log.e("SharekitAccountSettings", "Invalid acl protobuf", localqas);
    }
  }
  
  public final void a(int paramInt, ome paramome)
  {
    gnb localgnb;
    if (paramome != null)
    {
      localgnb = efj.a(this.b, paramInt, paramome, false);
      if (localgnb == null) {}
    }
    try
    {
      Context localContext = this.b;
      byte[] arrayOfByte = gnl.a(localgnb);
      SQLiteDatabase localSQLiteDatabase = ((hrz)mbb.a(localContext, hrz.class)).b(localContext, paramInt).getWritableDatabase();
      ContentValues localContentValues = new ContentValues(2);
      localContentValues.put("audience_data", arrayOfByte);
      localSQLiteDatabase.update("account_status", localContentValues, null, null);
      return;
    }
    catch (IOException localIOException)
    {
      Log.e("SharekitAccountSettings", "Error saving default audience", localIOException);
    }
  }
  
  public final void a(Context paramContext, gje paramgje) {}
  
  public final void a(gje paramgje, mtu parammtu)
  {
    if ((parammtu != null) && (parammtu.a != null) && (parammtu.a.c != null) && (parammtu.a.c.a != null)) {
      efj.a(paramgje, parammtu.a.c.a);
    }
  }
  
  public final void a(List<gji> paramList)
  {
    paramList.add(new kmg());
    paramList.add(new kmh());
  }
  
  public final boolean a(gjb paramgjb, mtt parammtt)
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kmf
 * JD-Core Version:    0.7.0.1
 */