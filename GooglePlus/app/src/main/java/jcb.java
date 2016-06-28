import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.libraries.social.notifications.service.GunsService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class jcb
{
  private static final String a = jdr.a("SystemNotManager");
  private static final mcq b = new mcq("debug.nots.guns_media", false);
  private final jdi c = new jdi();
  
  private static int a(Context paramContext, int paramInt, jah paramjah)
  {
    int i = jaw.b;
    int j;
    if (paramInt != -1)
    {
      Iterator localIterator = mbb.c(paramContext, jav.class).iterator();
      j = i;
      if (!localIterator.hasNext()) {
        break label71;
      }
      if (((jav)localIterator.next()).a() == jaw.b) {
        break label74;
      }
    }
    label71:
    label74:
    for (int k = jaw.a;; k = j)
    {
      j = k;
      break;
      j = i;
      return j;
    }
  }
  
  private static Notification a(Context paramContext, int paramInt1, jar paramjar, mkd parammkd, int paramInt2)
  {
    String str1 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt1).b("account_name");
    String str2;
    String str3;
    if ((parammkd != null) && (!TextUtils.isEmpty(parammkd.a)))
    {
      str2 = parammkd.a;
      if ((parammkd == null) || (TextUtils.isEmpty(parammkd.b))) {
        break label171;
      }
      str3 = parammkd.b;
    }
    for (;;)
    {
      dk localdk = new dk(paramContext);
      localdk.b = dk.a(str2);
      localdk.c = dk.a(str3);
      localdk.k = dk.a(str1);
      int j = paramjar.a().intValue();
      localdk.x.icon = j;
      if (paramjar.c() != null) {
        localdk.u = paramContext.getResources().getColor(paramjar.c().intValue());
      }
      return localdk.b();
      str2 = paramContext.getString(paramjar.b().intValue());
      break;
      label171:
      if (paramInt2 == 1)
      {
        int k = efj.QE;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(paramInt2);
        str3 = paramContext.getString(k, arrayOfObject2);
      }
      else
      {
        int i = efj.QC;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(paramInt2);
        str3 = paramContext.getString(i, arrayOfObject1);
      }
    }
  }
  
  private static PendingIntent a(Context paramContext, int paramInt, boolean paramBoolean, String paramString, String... paramVarArgs)
  {
    Intent localIntent;
    String str1;
    String str2;
    if (paramBoolean)
    {
      localIntent = new Intent(paramContext, GunsService.class);
      str1 = String.valueOf("http://notifications.google.com/");
      str2 = String.valueOf(paramString);
      if (str2.length() == 0) {
        break label122;
      }
    }
    label122:
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      localIntent.setData(Uri.parse(str3));
      localIntent.setAction("com.google.android.libraries.social.notifications.impl.NOTIFICATION_SELECTED");
      localIntent.putExtra("notification_event_type", jae.b);
      localIntent.putExtra("notification_keys", paramVarArgs);
      localIntent.putExtra("account_id", paramInt);
      localIntent.putExtra("from_system_tray", true);
      return PendingIntent.getService(paramContext, paramInt, localIntent, 268435456);
      paramString = paramVarArgs[0];
      break;
    }
  }
  
  private static Bitmap a(Context paramContext, int paramInt, String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      String str1;
      if (paramString.startsWith("//"))
      {
        str1 = String.valueOf(paramString);
        if (str1.length() == 0) {
          break label70;
        }
      }
      for (String str2 = "https:".concat(str1);; str2 = new String("https:"))
      {
        paramString = str2;
        try
        {
          Bitmap localBitmap = (Bitmap)((hdg)mbb.a(paramContext, hdg.class)).b(paramString, 2, 0);
          return localBitmap;
        }
        catch (kbm localkbm)
        {
          jdr.b(a, "Avatar Download Failed", localkbm);
          return null;
        }
        catch (kbc localkbc)
        {
          for (;;)
          {
            jdr.b(a, "Avatar Download Canceled", localkbc);
          }
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          for (;;)
          {
            label70:
            jdr.b(a, "Avatar Download OutOfMemoryError", localOutOfMemoryError);
          }
        }
      }
    }
  }
  
  private final Bitmap a(Context paramContext, int paramInt, mkt parammkt, boolean paramBoolean)
  {
    if (parammkt == null) {}
    ArrayList localArrayList;
    do
    {
      return null;
      localArrayList = new ArrayList();
      if (parammkt.b.length > 0)
      {
        mkr[] arrayOfmkr = parammkt.b;
        int j = arrayOfmkr.length;
        for (int k = 0; k < j; k++)
        {
          Bitmap localBitmap2 = a(paramContext, paramInt, arrayOfmkr[k].a);
          if (localBitmap2 != null) {
            localArrayList.add(localBitmap2);
          }
        }
      }
      if ((localArrayList.isEmpty()) && (parammkt.a != null))
      {
        Bitmap localBitmap1 = a(paramContext, paramInt, parammkt.a.a);
        if (localBitmap1 != null) {
          localArrayList.add(localBitmap1);
        }
      }
    } while (localArrayList.isEmpty());
    int i = efj.k(paramContext);
    if (paramBoolean) {
      return efj.a(localArrayList, i, null);
    }
    return efj.a(localArrayList, i);
  }
  
  private final dk a(Context paramContext, int paramInt, jdb paramjdb, jar paramjar, dw paramdw, boolean paramBoolean, Bitmap paramBitmap)
  {
    String str1 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name");
    mkf localmkf = paramjdb.k();
    if (localmkf != null) {}
    for (mkt localmkt = localmkf.a; (localmkt == null) || ((TextUtils.isEmpty(localmkt.c)) && (TextUtils.isEmpty(localmkt.d))); localmkt = null) {
      return null;
    }
    dk localdk = new dk(paramContext);
    localdk.b = dk.a(localmkt.c);
    localdk.c = dk.a(localmkt.d);
    localdk.k = dk.a(str1);
    int i = paramjar.a().intValue();
    localdk.x.icon = i;
    String str2 = localmkt.c;
    localdk.x.tickerText = dk.a(str2);
    localdk.h = paramjdb.e();
    if (paramjar.c() != null) {
      localdk.u = paramContext.getResources().getColor(paramjar.c().intValue());
    }
    if (paramjdb.f().longValue() > 0L)
    {
      long l = paramjdb.f().longValue();
      localdk.x.when = l;
    }
    if (paramBitmap != null) {
      localdk.e = paramBitmap;
    }
    if (paramdw != null) {
      localdk.a(paramdw);
    }
    int j;
    if (Build.VERSION.SDK_INT >= 21)
    {
      j = 1;
      if (j != 0)
      {
        String str3 = paramjdb.j();
        if (str3 != null) {
          localdk.s = str3;
        }
        a(paramContext, str1, localdk, Arrays.asList(localmkt.b));
      }
      if (paramBoolean) {
        if (paramjdb.b() != 0L) {
          break label342;
        }
      }
    }
    label342:
    for (boolean bool = true;; bool = false)
    {
      a(localdk, paramjar, bool);
      return localdk;
      j = 0;
      break;
    }
  }
  
  private final dw a(Context paramContext, int paramInt, String paramString, mkl parammkl)
  {
    if ((parammkl != null) && (parammkl.a != null))
    {
      mkq[] arrayOfmkq = parammkl.a.b;
      if ((arrayOfmkq.length > 0) && (arrayOfmkq[0].a != null))
      {
        Bitmap localBitmap = b(paramContext, paramInt, arrayOfmkq[0].a.a);
        if (localBitmap != null)
        {
          di localdi = new di();
          localdi.a = localBitmap;
          localdi.d = dk.a(paramString);
          return localdi;
        }
      }
    }
    return null;
  }
  
  private static jah a(jdb paramjdb)
  {
    jai localjai = new jai();
    localjai.a = paramjdb.getString(paramjdb.getColumnIndex("key"));
    localjai.b = paramjdb.i();
    localjai.c = paramjdb.g();
    localjai.d = paramjdb.h();
    return localjai.a();
  }
  
  private final HashMap<String, dk> a(Context paramContext, int paramInt, jdb paramjdb, jar paramjar, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    if (paramjdb.moveToFirst()) {}
    label150:
    label175:
    label181:
    label197:
    for (;;)
    {
      String str = paramjdb.getString(paramjdb.getColumnIndex("key"));
      mkt localmkt;
      dk localdk;
      if ((paramjdb.b() != paramjdb.a()) || (paramBoolean))
      {
        jah localjah = a(paramjdb);
        if (jaw.b == a(paramContext, paramInt, localjah))
        {
          mkf localmkf = paramjdb.k();
          if (localmkf == null) {
            break label175;
          }
          localmkt = localmkf.a;
          mkl localmkl = paramjdb.c();
          if (localmkt == null) {
            break label181;
          }
          localdk = a(paramContext, paramInt, paramjdb, paramjar, a(paramContext, paramInt, localmkt.c, localmkl), false, null);
          int i = jax.b;
          jah[] arrayOfjah = new jah[1];
          arrayOfjah[0] = a(paramjdb);
          a(paramContext, paramInt, localdk, i, arrayOfjah);
          if (localdk != null) {
            localHashMap.put(str, localdk);
          }
        }
      }
      for (;;)
      {
        if (paramjdb.moveToNext()) {
          break label197;
        }
        return localHashMap;
        localmkt = null;
        break;
        localdk = null;
        break label150;
        localHashMap.put(str, null);
      }
    }
  }
  
  private final Set<String> a(Context paramContext, int paramInt, String paramString, jdb paramjdb1, jdb paramjdb2, HashMap<String, dk> paramHashMap, jar paramjar)
  {
    eg localeg;
    mkt localmkt1;
    Object localObject3;
    dw localdw;
    int i2;
    label177:
    int i3;
    label194:
    String str4;
    label328:
    Object localObject4;
    Object localObject5;
    label358:
    int j;
    label443:
    int n;
    label538:
    label671:
    label766:
    mkd localmkd;
    label834:
    label840:
    label859:
    label877:
    label891:
    HashMap localHashMap1;
    ArrayList localArrayList;
    dn localdn;
    long l1;
    int i5;
    int i6;
    Object localObject6;
    boolean bool2;
    int i7;
    label948:
    mkt localmkt3;
    label990:
    long l3;
    label1090:
    boolean bool4;
    label1103:
    int i20;
    label1121:
    int i10;
    label1137:
    String str9;
    int i21;
    label1176:
    label1215:
    Object localObject7;
    boolean bool3;
    int i9;
    int i8;
    for (;;)
    {
      Set localSet2;
      dk localdk3;
      try
      {
        localeg = new eg(paramContext);
        if (paramHashMap.isEmpty()) {
          break label1714;
        }
        localSet2 = paramHashMap.keySet();
        paramjdb1.moveToFirst();
        if (localSet2.size() != 1) {
          break label891;
        }
        if (!localSet2.contains(paramjdb1.getString(paramjdb1.getColumnIndex("key")))) {
          break label877;
        }
        mkf localmkf1 = paramjdb1.k();
        if (localmkf1 == null) {
          break label1847;
        }
        localmkt1 = localmkf1.a;
        mkl localmkl = paramjdb1.c();
        localObject3 = null;
        mkt localmkt2;
        if (localmkl != null)
        {
          if (localmkl.b.length > 1) {
            continue;
          }
          localdw = a(paramContext, paramInt, localmkt1.c, localmkl);
          if (localdw != null) {
            break label1807;
          }
          if ((localmkl == null) || (localmkl.b.length != 1)) {
            continue;
          }
          localmkt2 = localmkl.b[0].a;
          if (localmkt2 == null) {
            continue;
          }
          if (TextUtils.isEmpty(localmkt2.c)) {
            break label1853;
          }
          i2 = 1;
          if (TextUtils.isEmpty(localmkt2.d)) {
            break label1859;
          }
          i3 = 1;
          break label1814;
          if ((i2 != 0) && (i3 != 0))
          {
            int i4 = efj.QA;
            Object[] arrayOfObject1 = new Object[2];
            arrayOfObject1[0] = localmkt2.c;
            arrayOfObject1[1] = localmkt2.d;
            str4 = paramContext.getString(i4, arrayOfObject1);
            if ((localmkl.a == null) || (TextUtils.isEmpty(localmkl.a.a))) {
              break label1827;
            }
            String str5 = String.valueOf(localmkl.a.a);
            str4 = 2 + String.valueOf(str4).length() + String.valueOf(str5).length() + str4 + "\n\n" + str5;
            break label1827;
            if (TextUtils.isEmpty((CharSequence)localObject4)) {
              break label1800;
            }
            localObject5 = new dj();
            ((dj)localObject5).a = dk.a((CharSequence)localObject4);
            break label1834;
          }
        }
        else
        {
          if (Build.VERSION.SDK_INT < 21) {
            break label834;
          }
          bool1 = true;
          localdk3 = a(paramContext, paramInt, paramjdb1, paramjar, (dw)localObject3, true, a(paramContext, paramInt, localmkt1, bool1));
          if (!paramjdb1.l()) {
            break label840;
          }
          localdk3.v = 1;
          int i1 = jax.a;
          jah[] arrayOfjah1 = new jah[1];
          arrayOfjah1[0] = a(paramjdb1);
          a(paramContext, paramInt, localdk3, i1, arrayOfjah1);
          localdk1 = localdk3;
          if (localdk1 == null) {
            break label1714;
          }
          String[] arrayOfString = (String[])paramHashMap.keySet().toArray(new String[paramHashMap.size()]);
          localdk1.d = a(paramContext, paramInt, true, paramString, arrayOfString);
          PendingIntent localPendingIntent1 = b(paramContext, paramInt, true, paramString, arrayOfString);
          localdk1.x.deleteIntent = localPendingIntent1;
          localdk1.o = paramString;
          localdk1.p = true;
          localeg.a(paramString, paramInt, localdk1.b());
          int i = arrayOfString.length;
          j = 0;
          if (j >= i) {
            break label1644;
          }
          String str1 = arrayOfString[j];
          dk localdk2 = (dk)paramHashMap.get(str1);
          if (localdk2 == null) {
            break label1841;
          }
          localdk2.d = a(paramContext, paramInt, false, paramString, new String[] { str1 });
          PendingIntent localPendingIntent2 = b(paramContext, paramInt, false, paramString, new String[] { str1 });
          localdk2.x.deleteIntent = localPendingIntent2;
          localdk2.o = paramString;
          localdk2.p = false;
          localeg.a(str1, paramInt, localdk2.b());
          break label1841;
        }
        if (i3 != 0)
        {
          str4 = localmkt2.d;
          continue;
        }
        str4 = localmkt2.c;
        continue;
        if (TextUtils.isEmpty(localmkt1.d)) {
          break label1865;
        }
        localObject4 = localmkt1.d;
        continue;
        localObject3 = new dn();
        if (!TextUtils.isEmpty(localmkt1.d))
        {
          String str3 = localmkt1.d;
          ((dn)localObject3).a.add(dk.a(str3));
          ((dn)localObject3).a.add(dk.a(" "));
        }
        mkf[] arrayOfmkf = localmkl.b;
        int k = arrayOfmkf.length;
        int m = 0;
        n = 0;
        if (n < k)
        {
          if (!a(paramContext, arrayOfmkf[n].a, (dn)localObject3)) {
            break label1871;
          }
          m++;
          break label1871;
        }
        if (m > 1) {
          continue;
        }
        localObject3 = new dj();
        ((dj)localObject3).a = dk.a(localmkt1.d);
        continue;
        boolean bool1 = false;
      }
      finally {}
      continue;
      mkc localmkc = paramjdb1.m();
      if (localmkc == null) {
        break label1877;
      }
      localmkd = localmkc.d;
      localdk3.w = a(paramContext, paramInt, paramjar, localmkd, 1);
      continue;
      if (!paramjdb1.moveToNext())
      {
        localdk1 = null;
        continue;
        localHashMap1 = new HashMap();
        HashMap localHashMap2 = new HashMap();
        localArrayList = new ArrayList();
        localdn = new dn();
        l1 = System.currentTimeMillis();
        i5 = 0;
        i6 = 1;
        localObject6 = null;
        bool2 = false;
        i7 = -2;
        if (!localSet2.contains(paramjdb1.getString(paramjdb1.getColumnIndex("key")))) {
          break label1754;
        }
        mkf localmkf2 = paramjdb1.k();
        if (localmkf2 == null) {
          break label1883;
        }
        localmkt3 = localmkf2.a;
        if (localmkt3 != null)
        {
          if (a(paramContext, localmkt3, localdn)) {
            i5++;
          }
          for (mkr localmkr : localmkt3.b) {
            localHashMap1.put(localmkr.b, localmkr);
          }
        }
        int i18 = i5;
        long l2 = paramjdb1.f().longValue();
        if ((l2 == 0L) || (l2 >= l1)) {
          break label1747;
        }
        l3 = l2;
        if (paramjdb1.b() != 0L) {
          break label1740;
        }
        bool4 = true;
        int i19 = paramjdb1.e();
        if (i19 <= i7) {
          break label1733;
        }
        i20 = i19;
        if ((i6 == 0) || (!paramjdb1.l())) {
          break label1896;
        }
        i10 = 1;
        str9 = paramjdb1.j();
        if (str9 != null)
        {
          if (!localHashMap2.containsKey(str9)) {
            break label1902;
          }
          i21 = 1 + ((Integer)localHashMap2.get(str9)).intValue();
          localHashMap2.put(str9, Integer.valueOf(i21));
          if ((localObject6 == null) || (i21 > ((Integer)localHashMap2.get(localObject6)).intValue())) {
            break label1889;
          }
        }
        localArrayList.add(a(paramjdb1));
        localObject7 = localObject6;
        long l4 = l3;
        bool3 = bool4;
        i9 = i20;
        l1 = l4;
        i8 = i18;
        label1250:
        if (paramjdb1.moveToNext()) {
          break label1777;
        }
        if (i8 != 0) {
          break;
        }
        localdk1 = null;
      }
    }
    String str6 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name");
    dk localdk1 = new dk(paramContext);
    String str7 = paramContext.getString(paramjar.b().intValue());
    localdk1.b = dk.a(str7);
    int i11 = efj.QC;
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(i8);
    localdk1.c = dk.a(paramContext.getString(i11, arrayOfObject2));
    localdk1.k = dk.a(str6);
    int i12 = efj.QD;
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = Integer.valueOf(i8);
    localdk1.f = dk.a(paramContext.getString(i12, arrayOfObject3));
    int i13 = paramjar.a().intValue();
    localdk1.x.icon = i13;
    localdk1.a(localdn);
    int i14 = efj.QB;
    Object[] arrayOfObject4 = new Object[2];
    arrayOfObject4[0] = Integer.valueOf(i8);
    arrayOfObject4[1] = str7;
    String str8 = paramContext.getString(i14, arrayOfObject4);
    localdk1.x.tickerText = dk.a(str8);
    localdk1.x.when = l1;
    localdk1.h = i9;
    if (i10 != 0)
    {
      localdk1.v = 1;
      label1514:
      if (paramjar.c() != null) {
        localdk1.u = paramContext.getResources().getColor(paramjar.c().intValue());
      }
      if (Build.VERSION.SDK_INT < 21) {
        break label1908;
      }
    }
    label1644:
    label1777:
    label1908:
    for (int i15 = 1;; i15 = 0)
    {
      if (i15 != 0)
      {
        if (localObject7 != null) {
          localdk1.s = localObject7;
        }
        a(paramContext, str6, localdk1, localHashMap1.values());
      }
      a(localdk1, paramjar, bool3);
      jah[] arrayOfjah2 = (jah[])localArrayList.toArray(new jah[localArrayList.size()]);
      a(paramContext, paramInt, localdk1, jax.a, arrayOfjah2);
      break label443;
      localdk1.w = a(paramContext, paramInt, paramjar, null, i8);
      break label1514;
      if ((paramjdb2 != null) && (paramjdb2.moveToFirst())) {
        do
        {
          String str2 = paramjdb2.getString(paramjdb2.getColumnIndex("key"));
          if (!paramHashMap.containsKey(str2)) {
            localeg.a(str2, paramInt);
          }
        } while (paramjdb2.moveToNext());
      }
      Set localSet3 = paramHashMap.keySet();
      Set localSet1;
      for (Object localObject2 = localSet3;; localObject2 = localSet1)
      {
        return localObject2;
        localeg.a(paramString, paramInt);
        localSet1 = Collections.emptySet();
      }
      i20 = i7;
      break label1121;
      bool4 = bool2;
      break label1103;
      l3 = l1;
      break label1090;
      i8 = i5;
      bool3 = bool2;
      i9 = i7;
      localObject7 = localObject6;
      i10 = i6;
      break label1250;
      i6 = i10;
      bool2 = bool3;
      i7 = i9;
      localObject6 = localObject7;
      i5 = i8;
      break label948;
      localObject5 = localdw;
      break label1834;
      localObject3 = localdw;
      break label358;
      for (;;)
      {
        if (i2 != 0) {
          break label1863;
        }
        if (i3 == 0) {
          break label671;
        }
        break label194;
        localObject4 = str4;
        break label328;
        localObject3 = localObject5;
        break label358;
        j++;
        break label538;
        localmkt1 = null;
        break;
        i2 = 0;
        break label177;
        i3 = 0;
      }
      break label194;
      localObject4 = null;
      break label328;
      n++;
      break label766;
      localmkd = null;
      break label859;
      localmkt3 = null;
      break label990;
      localObject6 = str9;
      break label1215;
      i10 = 0;
      break label1137;
      i21 = 1;
      break label1176;
    }
  }
  
  private static void a(Context paramContext, int paramInt1, dk paramdk, int paramInt2, jah... paramVarArgs)
  {
    if (paramInt1 != -1)
    {
      Iterator localIterator = mbb.c(paramContext, jav.class).iterator();
      while (localIterator.hasNext()) {
        ((jav)localIterator.next()).a(paramInt1, paramdk, paramVarArgs);
      }
    }
  }
  
  private final void a(Context paramContext, int paramInt, Map<String, jdb> paramMap)
  {
    try
    {
      localeg = new eg(paramContext);
      Iterator localIterator = paramMap.keySet().iterator();
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localeg.a(str, paramInt);
        localjdb = (jdb)paramMap.get(str);
      }
    }
    finally
    {
      try
      {
        for (;;)
        {
          eg localeg;
          if (localjdb.moveToFirst())
          {
            boolean bool;
            do
            {
              localeg.a(localjdb.getString(localjdb.getColumnIndex("key")), paramInt);
              bool = localjdb.moveToNext();
            } while (bool);
          }
          localjdb.close();
        }
      }
      finally
      {
        jdb localjdb;
        localjdb.close();
      }
      localObject1 = finally;
    }
  }
  
  @TargetApi(21)
  private final void a(Context paramContext, String paramString, dk paramdk, Collection<mkr> paramCollection)
  {
    if (paramContext.getPackageManager().checkPermission("android.permission.READ_CONTACTS", paramContext.getPackageName()) == 0) {}
    for (int i = 1; i != 0; i = 0)
    {
      fyj localfyj = (fyj)mbb.b(paramContext, fyj.class);
      if (localfyj == null) {
        break;
      }
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        mkr localmkr = (mkr)localIterator.next();
        if (!TextUtils.isEmpty(localmkr.b))
        {
          Uri localUri = localfyj.a(paramString, localmkr.b);
          if (localUri != null)
          {
            String str = localUri.toString();
            paramdk.y.add(str);
          }
        }
      }
    }
  }
  
  private static void a(dk paramdk, jar paramjar, boolean paramBoolean)
  {
    int i = 1;
    int j;
    if (paramBoolean) {
      if (paramjar.e()) {
        if (paramjar.d() != null)
        {
          Uri localUri = paramjar.d();
          paramdk.x.sound = localUri;
          paramdk.x.audioStreamType = -1;
          j = 0;
          if (paramjar.f()) {
            j |= 0x2;
          }
        }
      }
    }
    for (;;)
    {
      int m;
      if (paramjar.g() != null)
      {
        int k = paramjar.g().intValue();
        paramdk.x.ledARGB = k;
        paramdk.x.ledOnMS = 1000;
        paramdk.x.ledOffMS = 9000;
        if ((paramdk.x.ledOnMS != 0) && (paramdk.x.ledOffMS != 0))
        {
          m = i;
          label127:
          Notification localNotification = paramdk.x;
          int n = 0xFFFFFFFE & paramdk.x.flags;
          if (m == 0) {
            break label179;
          }
          label150:
          localNotification.flags = (n | i);
        }
      }
      for (;;)
      {
        paramdk.a(j);
        return;
        j = i;
        break;
        m = 0;
        break label127;
        label179:
        i = 0;
        break label150;
        j |= 0x4;
      }
      j = 0;
      break;
      j = 0;
    }
  }
  
  private static boolean a(Context paramContext, mkt parammkt, dn paramdn)
  {
    if (parammkt == null) {}
    int i;
    label106:
    label110:
    for (;;)
    {
      return false;
      if (!TextUtils.isEmpty(parammkt.c))
      {
        i = 1;
        if (TextUtils.isEmpty(parammkt.d)) {
          break label106;
        }
      }
      for (int j = 1;; j = 0)
      {
        if ((i == 0) && (j == 0)) {
          break label110;
        }
        if ((i == 0) || (j == 0)) {
          break label112;
        }
        int k = efj.QA;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = parammkt.c;
        arrayOfObject[1] = parammkt.d;
        String str2 = paramContext.getString(k, arrayOfObject);
        paramdn.a.add(dk.a(str2));
        return true;
        i = 0;
        break;
      }
    }
    label112:
    if (i != 0) {}
    for (String str1 = parammkt.c;; str1 = parammkt.d)
    {
      paramdn.a.add(dk.a(str1));
      break;
    }
  }
  
  private static PendingIntent b(Context paramContext, int paramInt, boolean paramBoolean, String paramString, String... paramVarArgs)
  {
    Intent localIntent;
    String str1;
    String str2;
    if (paramBoolean)
    {
      localIntent = new Intent(paramContext, GunsService.class);
      str1 = String.valueOf("http://notifications.google.com/");
      str2 = String.valueOf(paramString);
      if (str2.length() == 0) {
        break label126;
      }
    }
    label126:
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      localIntent.setData(Uri.parse(str3));
      localIntent.setAction("com.google.android.libraries.social.notifications.impl.SYSTEM_NOTIFICATION_DISMISSED");
      localIntent.putExtra("notification_event_type", jae.c);
      localIntent.putExtra("view_id", "AST");
      localIntent.putExtra("notification_keys", paramVarArgs);
      localIntent.putExtra("account_id", paramInt);
      return PendingIntent.getService(paramContext, paramInt, localIntent, 268435456);
      paramString = paramVarArgs[0];
      break;
    }
  }
  
  private static Bitmap b(Context paramContext, int paramInt, String paramString)
  {
    int i;
    int j;
    if (!TextUtils.isEmpty(paramString))
    {
      Resources localResources = paramContext.getResources();
      i = (int)localResources.getDimension(efj.Qz);
      j = (int)localResources.getDimension(efj.Qy);
    }
    try
    {
      ipf localipf = ipf.a(paramContext, paramString, ipm.a);
      Bitmap localBitmap = (Bitmap)((ipb)mbb.a(paramContext, ipb.class)).a(localipf, 0, i, j, 0);
      return localBitmap;
    }
    catch (kbm localkbm)
    {
      jdr.b(a, "Bitmap Download Failed", localkbm);
      return null;
    }
    catch (kbc localkbc)
    {
      for (;;)
      {
        jdr.b(a, "Bitmap Download Canceled", localkbc);
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      for (;;)
      {
        jdr.b(a, "Bitmap Download OutOfMemoryError", localOutOfMemoryError);
      }
    }
  }
  
  public final void a(Context paramContext, int paramInt)
  {
    try
    {
      a(paramContext, paramInt, this.c.b(paramContext, paramInt));
      jdi.a(paramContext, paramInt, new String[0]);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    if (paramInt == -1) {}
    jar localjar;
    for (;;)
    {
      return;
      try
      {
        localjar = ((jaq)mbb.a(paramContext, jaq.class)).a(paramInt);
        if (!localjar.h()) {
          a(paramContext, paramInt);
        }
      }
      finally {}
    }
    jak localjak = ((jaa)mbb.a(paramContext, jaa.class)).b(paramInt);
    Map localMap1 = this.c.a(paramContext, paramInt);
    Map localMap2 = this.c.b(paramContext, paramInt);
    String str1 = a;
    int i = localMap1.size();
    jdr.c(str1, 48 + "Got " + i + " groups of notifications to show.");
    if (!localMap1.isEmpty()) {
      switch (jcc.a[localjak.ordinal()])
      {
      }
    }
    for (;;)
    {
      if (j != 0)
      {
        HashSet localHashSet = new HashSet();
        Iterator localIterator = localMap1.keySet().iterator();
        for (;;)
        {
          String str2;
          jdb localjdb1;
          jdb localjdb2;
          if (localIterator.hasNext())
          {
            str2 = (String)localIterator.next();
            localjdb1 = (jdb)localMap1.get(str2);
            localjdb2 = (jdb)localMap2.remove(str2);
          }
          try
          {
            localHashSet.addAll(a(paramContext, paramInt, str2, localjdb1, localjdb2, a(paramContext, paramInt, localjdb1, localjar, paramBoolean), localjar));
            localjdb1.close();
            if (localjdb2 != null) {
              localjdb2.close();
            }
          }
          finally
          {
            localjdb1.close();
            if (localjdb2 != null) {
              localjdb2.close();
            }
          }
        }
      }
      a(paramContext, paramInt);
      break;
      int j = 0;
      continue;
      j = 1;
      continue;
      j = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jcb
 * JD-Core Version:    0.7.0.1
 */