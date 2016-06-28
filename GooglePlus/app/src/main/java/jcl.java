import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Pair;
import com.google.android.libraries.social.notifications.impl.gcm.receiver.GcmReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class jcl
  implements jdu
{
  private static final String a = jdr.a(jcl.class);
  
  private static int a(Context paramContext, String paramString)
  {
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    Iterator localIterator = localgiz.a(new String[] { "logged_in" }).iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      if (paramString.equals(localgiz.a(localInteger.intValue()).b("gaia_id"))) {
        return localInteger.intValue();
      }
    }
    jdr.c(a, "Invalid recipientOid");
    return -1;
  }
  
  private static mld a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      mld localmld = (mld)qat.b(new mld(), paramArrayOfByte, 0, paramArrayOfByte.length);
      return localmld;
    }
    catch (qas localqas)
    {
      jdr.b(a, "Failed to parse payload to it's proto form.", localqas);
    }
    return null;
  }
  
  private final void a(Context paramContext, int paramInt, mjd[] paramArrayOfmjd)
  {
    String str1 = a;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramArrayOfmjd.length);
    jdr.a(str1, String.format("Processing %d notifications.", arrayOfObject1));
    jcg.a(paramContext, paramInt, paramArrayOfmjd, jan.c);
    mjd[] arrayOfmjd1 = jcg.a(paramArrayOfmjd);
    String str2 = a;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(arrayOfmjd1.length);
    jdr.a(str2, String.format("Have %d notifications after filtering ack notifications.", arrayOfObject2));
    ArrayList localArrayList = new ArrayList();
    int i = arrayOfmjd1.length;
    for (int j = 0; j < i; j++)
    {
      mjd localmjd = arrayOfmjd1[j];
      if (a(paramContext, paramInt, localmjd)) {
        localArrayList.add(localmjd);
      }
    }
    String str3 = a;
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = Integer.valueOf(localArrayList.size());
    jdr.a(str3, String.format("Have %d notifications after filtering by processors.", arrayOfObject3));
    if (!localArrayList.isEmpty())
    {
      mjd[] arrayOfmjd2 = (mjd[])localArrayList.toArray(new mjd[localArrayList.size()]);
      jdj.a(paramContext, paramInt, arrayOfmjd2, true);
      jah[] arrayOfjah = jdj.b(paramContext, paramInt, efj.a(arrayOfmjd2, new int[] { 1 }));
      if (arrayOfjah.length > 0)
      {
        List localList = mbb.c(paramContext, jaf.class);
        int k = localList.size();
        new jad(jae.a);
        Arrays.asList(arrayOfjah);
        for (int m = 0; m < k; m++) {
          localList.get(m);
        }
      }
    }
  }
  
  private static boolean a(Context paramContext, int paramInt, mjd parammjd)
  {
    Iterator localIterator = mbb.c(paramContext, jav.class).iterator();
    boolean bool1 = true;
    if (localIterator.hasNext())
    {
      if ((((jav)localIterator.next()).a(paramInt, parammjd) == jaw.b) && (bool1)) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        bool1 = bool2;
        break;
      }
    }
    return bool1;
  }
  
  private static byte[] a(String paramString)
  {
    try
    {
      byte[] arrayOfByte = Base64.decode(paramString, 1);
      return arrayOfByte;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      jdr.b(a, "Failed to parse payload string into bytes.", localIllegalArgumentException);
    }
    return null;
  }
  
  public final void a(Intent paramIntent, Context paramContext)
  {
    int i = 1;
    if (paramIntent != null) {}
    for (;;)
    {
      int j;
      try
      {
        if (!paramIntent.hasExtra("ht")) {
          jdr.c(a, "Intent did not contain the payload key.");
        }
      }
      finally
      {
        String str1;
        String str2;
        giz localgiz;
        GcmReceiver.a(paramIntent);
      }
      try
      {
        GcmReceiver.a(paramIntent);
        return;
      }
      finally
      {
        gk.a(paramIntent);
      }
      mld localmld = a(a(paramIntent.getStringExtra("ht")));
      str1 = a;
      str2 = String.valueOf(localmld);
      jdr.b(str1, 18 + String.valueOf(str2).length() + "Received payload: " + str2);
      izy localizy;
      if ((localmld != null) && (localmld.a != null))
      {
        if (i == 0)
        {
          jdr.c(a, "Intent did not contain a valid payload.");
          localmld = null;
        }
        if (localmld == null) {
          continue;
        }
        j = a(paramContext, localmld.a);
        if (j == -1) {
          continue;
        }
        localgiz = (giz)mbb.a(paramContext, giz.class);
        if (localgiz.a(j).c("GCM_ENABLED")) {
          localgiz.b(j).b("GCM_ENABLED", true).d();
        }
        if (localmld.c != null) {
          localizy = (izy)mbb.a(paramContext, izy.class);
        }
      }
      else
      {
        switch (localmld.c.a)
        {
        default: 
          jdr.c(a, "Got UNKNOWN instruction in heavy tickle.");
          continue;
          i = 0;
          break;
        case 1: 
          jdr.a(a, "Got SYNC instruction in heavy tickle.");
          localizy.a(j, izx.a, jan.c);
          break;
        case 2: 
          jdr.a(a, "Got COMPLTE_SYNC instruction in heavy tickle.");
          localizy.c(j);
          localizy.a(j, izx.a, jan.c);
          break;
        case 3: 
          jdr.a(a, "Got FETCH_BY_KEY instruction in heavy tickle.");
          jcs localjcs = (jcs)mbb.a(paramContext, jcs.class);
          String[] arrayOfString = localmld.c.b;
          efj.l();
          if (j == -1) {}
          jdl localjdl;
          for (Pair localPair = Pair.create(new jal(jam.c, new IllegalArgumentException("Invalid account ID")), null);; localPair = jcs.a(j, arrayOfString, (jdl)jdm.a(localjdl, localjcs.a)))
          {
            if ((((jal)localPair.first).a != jam.a) || (localPair.second == null)) {
              break label532;
            }
            a(paramContext, j, ((qre)localPair.second).a);
            break;
            qrd localqrd = jcs.a(localjcs.a, arrayOfString);
            localjdl = new jdl(localjcs.a, j, localqrd);
            mbb.a(localjcs.a, jdm.class);
          }
          label532:
          break;
        }
      }
      a(paramContext, j, localmld.b);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jcl
 * JD-Core Version:    0.7.0.1
 */