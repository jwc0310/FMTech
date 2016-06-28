import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

public final class bwi
  extends hqj
{
  private static final String[] v = { "lookup", "display_name", "data1" };
  private static final String[] w = { "lookup", "display_name", "data1", "data2", "data3" };
  private final String[] r;
  private final String s;
  private final int t;
  private boolean u;
  
  public bwi(Context paramContext, String[] paramArrayOfString, String paramString, int paramInt, boolean paramBoolean)
  {
    super(paramContext);
    this.r = paramArrayOfString;
    this.s = paramString;
    this.t = 2;
    this.u = paramBoolean;
  }
  
  private final void a(hqr paramhqr, HashMap<String, ArrayList<bwj>> paramHashMap, String paramString)
  {
    ArrayList localArrayList = (ArrayList)paramHashMap.get(paramString);
    if (localArrayList == null) {
      return;
    }
    for (int i = 0; i < localArrayList.size(); i++)
    {
      bwj localbwj = (bwj)localArrayList.get(i);
      Object[] arrayOfObject = new Object[this.r.length];
      int j = 0;
      if (j < this.r.length)
      {
        String str1 = this.r[j];
        String str3;
        if ("person_id".equals(str1))
        {
          String str2 = String.valueOf(localbwj.c);
          if (str2.length() != 0)
          {
            str3 = "p:".concat(str2);
            label110:
            arrayOfObject[j] = str3;
          }
        }
        for (;;)
        {
          j++;
          break;
          str3 = new String("p:");
          break label110;
          if ("lookup_key".equals(str1)) {
            arrayOfObject[j] = localbwj.a;
          } else if ("name".equals(str1)) {
            arrayOfObject[j] = localbwj.b;
          } else if ("phone".equals(str1)) {
            arrayOfObject[j] = localbwj.c;
          } else if ("phone_type".equals(str1)) {
            arrayOfObject[j] = localbwj.d;
          }
        }
      }
      paramhqr.a(arrayOfObject);
    }
    paramHashMap.remove(paramString);
  }
  
  private final Object[] b(Cursor paramCursor)
  {
    String str1 = paramCursor.getString(2);
    Object[] arrayOfObject = new Object[this.r.length];
    int i = 0;
    if (i < this.r.length)
    {
      String str2 = this.r[i];
      String str4;
      if ("person_id".equals(str2))
      {
        String str3 = String.valueOf(str1);
        if (str3.length() != 0)
        {
          str4 = "e:".concat(str3);
          label72:
          arrayOfObject[i] = str4;
        }
      }
      for (;;)
      {
        i++;
        break;
        str4 = new String("e:");
        break label72;
        if ("lookup_key".equals(str2)) {
          arrayOfObject[i] = paramCursor.getString(0);
        } else if ("name".equals(str2)) {
          arrayOfObject[i] = paramCursor.getString(1);
        } else if ("email".equals(str2)) {
          arrayOfObject[i] = str1;
        }
      }
    }
    return arrayOfObject;
  }
  
  private final Cursor p()
  {
    localhqr = new hqr(this.r);
    Uri localUri = Uri.withAppendedPath(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI, Uri.encode(this.s));
    Cursor localCursor = this.l.getContentResolver().query(localUri, v, null, null, null);
    if (localCursor == null) {
      return localhqr;
    }
    try
    {
      while (localCursor.moveToNext()) {
        if (!TextUtils.isEmpty(localCursor.getString(2))) {
          localhqr.a(b(localCursor));
        }
      }
      return localhqr;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private final Cursor q()
  {
    Object localObject1 = null;
    hqr localhqr = new hqr(this.r);
    ContentResolver localContentResolver = this.l.getContentResolver();
    Resources localResources = this.l.getResources();
    ArrayList localArrayList1 = new ArrayList();
    HashMap localHashMap = new HashMap();
    Cursor localCursor1 = localContentResolver.query(Uri.withAppendedPath(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI, Uri.encode(this.s)), w, null, null, null);
    try
    {
      while (localCursor1.moveToNext())
      {
        String str2 = localCursor1.getString(2);
        if (!TextUtils.isEmpty(str2))
        {
          String str3 = localCursor1.getString(0);
          bwj localbwj = new bwj();
          localbwj.a = str3;
          localbwj.b = localCursor1.getString(1);
          localbwj.c = str2;
          CharSequence localCharSequence = ContactsContract.CommonDataKinds.Phone.getTypeLabel(localResources, localCursor1.getInt(3), localCursor1.getString(4));
          if (localCharSequence != null) {
            localbwj.d = localCharSequence.toString();
          }
          ArrayList localArrayList2 = (ArrayList)localHashMap.get(str3);
          if (localArrayList2 == null)
          {
            localArrayList2 = new ArrayList();
            localHashMap.put(str3, localArrayList2);
            localArrayList1.add(str3);
          }
          localArrayList2.add(localbwj);
        }
      }
    }
    finally
    {
      localCursor1.close();
    }
    Cursor localCursor2 = localContentResolver.query(Uri.withAppendedPath(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI, Uri.encode(this.s)), v, null, null, null);
    try
    {
      while (localCursor2.moveToNext())
      {
        String str1 = localCursor2.getString(0);
        if (!str1.equals(localObject1))
        {
          a(localhqr, localHashMap, localObject1);
          localObject1 = str1;
        }
        if (!TextUtils.isEmpty(localCursor2.getString(2))) {
          localhqr.a(b(localCursor2));
        }
      }
      if (localObject1 == null) {
        break label378;
      }
    }
    finally
    {
      localCursor2.close();
    }
    a(localhqr, localHashMap, localObject1);
    label378:
    localCursor2.close();
    for (int i = 0; i < localArrayList1.size(); i++) {
      a(localhqr, localHashMap, (String)localArrayList1.get(i));
    }
    return localhqr;
  }
  
  public final Cursor o()
  {
    if ((TextUtils.isEmpty(this.s)) || (this.s.length() < this.t)) {
      return new hqr(this.r);
    }
    try
    {
      if (this.u) {
        return q();
      }
      Cursor localCursor = p();
      return localCursor;
    }
    catch (SecurityException localSecurityException) {}
    return new hqr(this.r);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bwi
 * JD-Core Version:    0.7.0.1
 */