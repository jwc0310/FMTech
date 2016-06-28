import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.photos.phone.PhotosHomeActivity;
import com.google.android.apps.photos.viewer.pager.HostPhotoPagerActivity;
import com.google.android.apps.plus.phone.HostStreamPhotosHomeTileActivity;
import com.google.android.apps.plus.service.EsService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class dkk
{
  private static int a = -1;
  
  private static int a(int paramInt)
  {
    if (paramInt == aaw.gu) {
      return efj.qd;
    }
    return efj.sc;
  }
  
  private static int a(Context paramContext, Cursor paramCursor, int paramInt)
  {
    if (!((hyi)mbb.a(paramContext, hyi.class)).b(bwb.x, paramInt)) {}
    int i;
    do
    {
      do
      {
        return 0;
      } while (!paramCursor.moveToFirst());
      i = 0;
      do
      {
        i = Math.max(i, paramCursor.getInt(10));
      } while (paramCursor.moveToNext());
      paramCursor.moveToFirst();
    } while (i != 3);
    return 1;
  }
  
  @TargetApi(16)
  private static Notification a(Context paramContext, int paramInt1, int paramInt2)
  {
    Resources localResources = paramContext.getResources();
    if (paramInt2 > 1) {}
    for (int i = b(paramInt1);; i = a(paramInt1))
    {
      dk localdk = new dk(paramContext);
      localdk.b = dk.a(localResources.getString(aau.cf));
      int j = efj.xE;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt2);
      localdk.c = dk.a(localResources.getQuantityString(j, paramInt2, arrayOfObject));
      localdk.x.icon = i;
      localdk.u = localResources.getColor(efj.jY);
      return localdk.b();
    }
  }
  
  private static PendingIntent a(Context paramContext, int paramInt, Cursor paramCursor, String paramString)
  {
    if (paramCursor == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    long[] arrayOfLong = new long[paramCursor.getCount()];
    boolean bool = paramCursor.moveToFirst();
    int i = 0;
    if (bool) {}
    for (;;)
    {
      localArrayList.add(paramCursor.getString(9));
      int j = i + 1;
      arrayOfLong[i] = paramCursor.getLong(20);
      if (!paramCursor.moveToNext()) {
        return EsService.a(paramContext, paramInt, localArrayList, arrayOfLong, paramString);
      }
      i = j;
    }
  }
  
  public static Intent a(Context paramContext, int paramInt, Cursor paramCursor, fe paramfe, boolean paramBoolean)
  {
    int i = paramCursor.getInt(13);
    String str1 = paramCursor.getString(9);
    int j = paramCursor.getInt(12);
    long l = paramCursor.getLong(20);
    boolean bool1;
    String str2;
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    List localList;
    label92:
    boolean bool2;
    label108:
    Object localObject;
    boolean bool4;
    if (paramCursor.getInt(11) != 0)
    {
      bool1 = true;
      str2 = paramCursor.getString(16);
      arrayOfByte1 = paramCursor.getBlob(27);
      arrayOfByte2 = paramCursor.getBlob(15);
      if (arrayOfByte2 != null) {
        break label301;
      }
      localList = null;
      if ((i != 3) || (duj.a(paramContext))) {
        break label311;
      }
      bool2 = true;
      switch (i)
      {
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 9: 
      case 12: 
      default: 
        if ((j == 63) && (!TextUtils.isEmpty(str2)))
        {
          localObject = efj.a(paramContext, paramInt, str2, str1, i, j, l, true, false);
          bool4 = false;
        }
        break;
      }
    }
    for (;;)
    {
      if (localObject == null)
      {
        String str4 = paramCursor.getString(2);
        if (!TextUtils.isEmpty(str4)) {
          localObject = efj.f(paramContext, paramInt, str4);
        }
      }
      ArrayList localArrayList1 = new ArrayList(1);
      localArrayList1.add(str1);
      ArrayList localArrayList2 = a(paramCursor);
      dmr.a(paramContext, paramInt, (Intent)localObject, paramfe, j, l, bool1, bool2, bool4, paramBoolean, localArrayList1, localArrayList2);
      return localObject;
      bool1 = false;
      break;
      label301:
      localList = bpw.a(arrayOfByte2);
      break label92;
      label311:
      bool2 = false;
      break label108;
      boolean bool9 = TextUtils.isEmpty(str2);
      localObject = null;
      if (!bool9)
      {
        localObject = efj.a(paramContext, paramInt, str2, str1, i, j, l, true, false);
        bool4 = false;
        continue;
        String str7 = paramCursor.getString(17);
        boolean bool8 = TextUtils.isEmpty(str7);
        localObject = null;
        if (!bool8)
        {
          localObject = null;
          if (j != 76)
          {
            localObject = efj.a(paramContext, paramInt, str7, j, null, null, str1, -2147483648, null, true);
            bool4 = false;
            continue;
            localObject = a(paramContext, paramInt, localList, str1);
            bool4 = false;
            continue;
            if (j == 18)
            {
              if (duj.a(paramContext))
              {
                localObject = efj.b(paramContext, paramInt);
                bool4 = false;
                continue;
              }
              localObject = new Intent(paramContext, PhotosHomeActivity.class);
              ((Intent)localObject).setAction("android.intent.action.VIEW");
              if (paramInt != -1) {
                ((Intent)localObject).putExtra("account_id", paramInt);
              }
              ((Intent)localObject).putExtra("tabs", 6);
              ((Intent)localObject).addFlags(335544320);
              ((Intent)localObject).putExtra("starting_tab_index", 1);
              bool4 = false;
              continue;
            }
            boolean bool6 = paramCursor.isNull(23);
            localObject = null;
            if (!bool6)
            {
              String str6 = jrf.a(6, new String[] { str1 });
              bdo localbdo = new bdo(paramContext, paramInt);
              localbdo.a.setClass(paramContext, HostPhotoPagerActivity.class);
              localbdo.e = str6;
              if ((j == 97) || (j == 111)) {
                localbdo.t = Boolean.valueOf(true);
              }
              Intent localIntent = localbdo.a();
              if (!duj.a(paramContext)) {}
              for (boolean bool7 = true;; bool7 = false)
              {
                bool4 = bool7;
                localObject = localIntent;
                break;
              }
              String str5 = paramCursor.getString(19);
              if ((j == 49) && (!TextUtils.isEmpty(str2)))
              {
                localObject = efj.a(paramContext, paramInt, str2, str1, i, j, l, true, false);
                bool4 = false;
                continue;
              }
              boolean bool5 = TextUtils.isEmpty(str5);
              localObject = null;
              if (!bool5)
              {
                if (j == 52)
                {
                  localObject = ((kyh)mbb.a(paramContext, kyh.class)).a(paramInt, str5, -1, -1, Integer.valueOf(3));
                  bool4 = false;
                  continue;
                }
                if (j == 48)
                {
                  localObject = ((dsr)mbb.a(paramContext, dsr.class)).a(paramInt, str5, null, str1, l);
                  bool4 = false;
                  continue;
                }
                localObject = ((dsr)mbb.a(paramContext, dsr.class)).a(paramInt, str5, null, str1, l);
                bool4 = false;
                continue;
                localObject = null;
                if (j == 33) {
                  localObject = efj.h(paramContext, paramInt, paramCursor.getString(2));
                }
                if (localObject == null)
                {
                  return efj.a();
                  String str3 = paramCursor.getString(2);
                  boolean bool3 = TextUtils.isEmpty(str3);
                  localObject = null;
                  if (!bool3)
                  {
                    String[] arrayOfString = efj.a(str3);
                    localObject = efj.c(paramContext, paramInt);
                    ((Intent)localObject).putExtra("circle_info", new cyf(paramContext, paramContext.getString(aau.tY), "v.all.circles", 0, 0L));
                    if ((arrayOfString != null) && (arrayOfString.length != 0)) {
                      ((Intent)localObject).putExtra("pinned_activity_ids", arrayOfString);
                    }
                    bool4 = false;
                    continue;
                    if (j != 105)
                    {
                      localObject = null;
                      if (j != 108) {}
                    }
                    else
                    {
                      localObject = null;
                      if (localList != null)
                      {
                        boolean bool10 = localList.isEmpty();
                        localObject = null;
                        if (!bool10)
                        {
                          localObject = efj.g(paramContext, paramInt, ((bpx)localList.get(0)).c);
                          ((Intent)localObject).putExtra("num_coalesced_notifs", localList.size());
                          ((Intent)localObject).putExtra("notification_payload", arrayOfByte1);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      bool4 = false;
    }
  }
  
  private static Intent a(Context paramContext, int paramInt, List<bpx> paramList, String paramString)
  {
    if (paramList != null)
    {
      String str = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
      ArrayList localArrayList = new ArrayList(paramList.size());
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        bpx localbpx = (bpx)localIterator.next();
        if (!str.equals(localbpx.c)) {
          localArrayList.add(localbpx);
        }
      }
      try
      {
        if (!localArrayList.isEmpty())
        {
          int i = localArrayList.size();
          if (i == 1) {
            return efj.a(paramContext, paramInt, ((bpx)localArrayList.get(0)).c, paramString, true);
          }
          if (i > 1)
          {
            Intent localIntent = efj.a(paramContext, paramInt, bpw.a(localArrayList), paramString);
            return localIntent;
          }
        }
      }
      catch (IOException localIOException) {}
    }
    return null;
  }
  
  private static dkl a(Context paramContext, int paramInt1, int paramInt2, Cursor paramCursor, int paramInt3)
  {
    Resources localResources = paramContext.getResources();
    String str1 = localResources.getQuantityString(efj.xG, paramInt2);
    String str2 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt1).b("account_name");
    int i = efj.xF;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = str2;
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    String str3 = localResources.getQuantityString(i, paramInt2, arrayOfObject);
    Intent localIntent1 = b(paramContext, paramInt1, paramCursor);
    localIntent1.addFlags(335544320);
    localIntent1.putExtra("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION", true);
    Intent localIntent2 = dmr.a(paramContext, paramInt1, localIntent1);
    PendingIntent localPendingIntent1 = PendingIntent.getActivity(paramContext, dmr.a(), localIntent2, 0);
    PendingIntent localPendingIntent2 = a(paramContext, paramInt1, paramCursor, "AST");
    Notification localNotification = new Notification.Builder(paramContext).setSmallIcon(a(paramInt3)).setContentTitle(str1).setContentText(str3).setTicker(str1).setWhen(System.currentTimeMillis()).setContentIntent(localPendingIntent1).setDeleteIntent(localPendingIntent2).getNotification();
    if (Build.VERSION.SDK_INT >= 21) {}
    for (int j = 1;; j = 0)
    {
      if (j != 0) {
        localNotification.color = localResources.getColor(efj.jY);
      }
      return new dkl(localNotification, false);
    }
  }
  
  private static dkl a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2)
  {
    int i = 1 + a;
    a = i;
    if (i >= paramCursor.getCount()) {
      a = 0;
    }
    String str = dun.e.a();
    if (Log.isLoggable("AndroidNotification", 3))
    {
      int j = a;
      int k = paramCursor.getCount();
      new StringBuilder(59 + String.valueOf(str).length()).append("Debug mode=").append(str).append(" Showing notification ").append(j).append(" of ").append(k);
    }
    if ("rich".equals(str))
    {
      paramCursor.moveToPosition(a);
      return e(paramContext, paramInt1, paramCursor, paramInt2);
    }
    if ("single".equals(str))
    {
      paramCursor.moveToPosition(a);
      return c(paramContext, paramInt1, paramCursor, paramInt2);
    }
    if ("digest".equals(str)) {
      return d(paramContext, paramInt1, paramCursor, paramInt2);
    }
    if ("coalesced".equals(str)) {
      return a(paramContext, paramInt1, paramCursor.getCount(), paramCursor, paramInt2);
    }
    return null;
  }
  
  private static fe a(Context paramContext, int paramInt, Cursor paramCursor)
  {
    fe localfe1 = new fe(paramContext);
    if (a(paramContext, paramInt, paramCursor, localfe1, true) == null) {
      localfe1 = null;
    }
    if (localfe1 != null)
    {
      int i = -1 + localfe1.a.size();
      if (((Intent)localfe1.a.get(i)).resolveActivity(paramContext.getPackageManager()) != null) {
        return localfe1;
      }
    }
    Intent localIntent1 = b(paramContext, paramInt, paramCursor);
    localIntent1.putExtra("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION", true);
    fe localfe2 = new fe(paramContext);
    Intent localIntent2 = dmr.a(paramContext, paramInt, localIntent1);
    localfe2.a.add(localIntent2);
    return localfe2;
  }
  
  public static ArrayList<String> a(Cursor paramCursor)
  {
    byte[] arrayOfByte = paramCursor.getBlob(29);
    if (arrayOfByte != null) {
      try
      {
        mjc localmjc = (mjc)qat.b(new mjc(), arrayOfByte, 0, arrayOfByte.length);
        if (localmjc.a != null)
        {
          ArrayList localArrayList = new ArrayList(Arrays.asList(localmjc.a));
          return localArrayList;
        }
      }
      catch (qas localqas)
      {
        Log.e("AndroidNotification", "Unable to parse AnalyticsData proto", localqas);
      }
    }
    return new ArrayList(0);
  }
  
  private static List<Bitmap> a(Context paramContext, List<bpx> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    bpx localbpx;
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localbpx = (bpx)localIterator.next();
      } while ((localbpx == null) || (localbpx.d == null));
    }
    for (;;)
    {
      int i;
      int j;
      try
      {
        hdg localhdg = (hdg)mbb.a(paramContext, hdg.class);
        String str = hdo.b(localbpx.d);
        if (Build.VERSION.SDK_INT >= 21)
        {
          i = 1;
          break label170;
          Bitmap localBitmap = (Bitmap)localhdg.b(str, 2, j);
          if (localBitmap == null) {
            break;
          }
          localArrayList.add(localBitmap);
        }
      }
      catch (kbm localkbm)
      {
        Log.e("AndroidNotification", "Cannot download square avatar", localkbm);
        break;
        i = 0;
        break label170;
        j = 0;
        continue;
      }
      catch (kbc localkbc)
      {
        Log.e("AndroidNotification", "Canceled", localkbc);
      }
      break;
      return localArrayList;
      label170:
      if (i != 0) {
        j = 1;
      }
    }
  }
  
  private static List<Bitmap> a(Context paramContext, mjp parammjp, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    int i = (int)localResources.getDimension(efj.mu);
    int j = (int)localResources.getDimension(efj.mt);
    if (parammjp.a != null) {}
    for (mjr[] arrayOfmjr = parammjp.a.b;; arrayOfmjr = null)
    {
      Object localObject = null;
      if (arrayOfmjr != null)
      {
        int k = arrayOfmjr.length;
        localObject = null;
        if (k != 0)
        {
          ArrayList localArrayList = new ArrayList();
          int m = arrayOfmjr.length;
          ipf localipf;
          for (int n = 0;; n++)
          {
            if (n >= m) {
              break label295;
            }
            mjr localmjr = arrayOfmjr[n];
            if ((localmjr != null) && (localmjr.a != null)) {
              localipf = ipf.a(paramContext, localmjr.a.a, ipm.a);
            }
            try
            {
              Bitmap localBitmap = (Bitmap)new ipc((ipb)mbb.a(paramContext, ipb.class), null, localipf, 0, i, j, 0).a();
              if (localBitmap != null) {
                localArrayList.add(localBitmap);
              }
            }
            catch (kbm localkbm)
            {
              for (;;)
              {
                String str2 = String.valueOf(localipf);
                Log.e("AndroidNotification", 25 + String.valueOf(str2).length() + "Could not download image " + str2, localkbm);
              }
            }
            catch (kbc localkbc)
            {
              for (;;)
              {
                String str1 = String.valueOf(localipf);
                Log.e("AndroidNotification", 9 + String.valueOf(str1).length() + "Canceled " + str1, localkbc);
              }
            }
            if (localArrayList.size() >= 3) {
              break label295;
            }
          }
          label295:
          localObject = localArrayList;
        }
      }
      return localObject;
    }
  }
  
  /* Error */
  public static void a(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: iconst_2
    //   1: istore_2
    //   2: ldc 2
    //   4: monitorenter
    //   5: aload_0
    //   6: iload_1
    //   7: invokestatic 651	cux:a	(Landroid/content/Context;I)Z
    //   10: istore 4
    //   12: iload 4
    //   14: ifne +7 -> 21
    //   17: ldc 2
    //   19: monitorexit
    //   20: return
    //   21: aload_0
    //   22: iload_1
    //   23: invokestatic 653	dkk:b	(Landroid/content/Context;I)Z
    //   26: ifeq +5 -> 31
    //   29: iconst_3
    //   30: istore_2
    //   31: iload_2
    //   32: anewarray 461	dkl
    //   35: astore 5
    //   37: invokestatic 655	dkk:a	()Z
    //   40: ifeq +300 -> 340
    //   43: aload_0
    //   44: iload_1
    //   45: invokestatic 660	brg:c	(Landroid/content/Context;I)Landroid/database/Cursor;
    //   48: astore 23
    //   50: aload 23
    //   52: ifnull +34 -> 86
    //   55: aload 23
    //   57: invokeinterface 142 1 0
    //   62: ifle +17 -> 79
    //   65: aload 5
    //   67: iconst_0
    //   68: aload_0
    //   69: iload_1
    //   70: aload 23
    //   72: getstatic 663	aaw:gr	I
    //   75: invokestatic 665	dkk:a	(Landroid/content/Context;ILandroid/database/Cursor;I)Ldkl;
    //   78: aastore
    //   79: aload 23
    //   81: invokeinterface 668 1 0
    //   86: aload_0
    //   87: iload_1
    //   88: iconst_1
    //   89: invokestatic 671	brg:b	(Landroid/content/Context;IZ)Landroid/database/Cursor;
    //   92: astore 24
    //   94: aload 24
    //   96: ifnull +621 -> 717
    //   99: aload_0
    //   100: iload_1
    //   101: invokestatic 653	dkk:b	(Landroid/content/Context;I)Z
    //   104: ifeq +190 -> 294
    //   107: aload 24
    //   109: invokestatic 674	dkk:b	(Landroid/database/Cursor;)Ljava/util/List;
    //   112: astore 26
    //   114: aload 24
    //   116: invokeinterface 668 1 0
    //   121: aload_0
    //   122: iload_1
    //   123: iconst_1
    //   124: aload 26
    //   126: iconst_0
    //   127: invokestatic 677	brg:a	(Landroid/content/Context;IZLjava/util/List;Z)Landroid/database/Cursor;
    //   130: astore 27
    //   132: aload 27
    //   134: ifnull +34 -> 168
    //   137: aload 27
    //   139: invokeinterface 142 1 0
    //   144: ifle +17 -> 161
    //   147: aload 5
    //   149: iconst_2
    //   150: aload_0
    //   151: iload_1
    //   152: aload 27
    //   154: getstatic 680	aaw:gv	I
    //   157: invokestatic 665	dkk:a	(Landroid/content/Context;ILandroid/database/Cursor;I)Ldkl;
    //   160: aastore
    //   161: aload 27
    //   163: invokeinterface 668 1 0
    //   168: aload_0
    //   169: iload_1
    //   170: iconst_1
    //   171: aload 26
    //   173: iconst_1
    //   174: invokestatic 677	brg:a	(Landroid/content/Context;IZLjava/util/List;Z)Landroid/database/Cursor;
    //   177: astore 28
    //   179: aload 28
    //   181: ifnull +536 -> 717
    //   184: aload 28
    //   186: invokeinterface 142 1 0
    //   191: ifle +17 -> 208
    //   194: aload 5
    //   196: iconst_1
    //   197: aload_0
    //   198: iload_1
    //   199: aload 28
    //   201: getstatic 16	aaw:gu	I
    //   204: invokestatic 665	dkk:a	(Landroid/content/Context;ILandroid/database/Cursor;I)Ldkl;
    //   207: aastore
    //   208: aload 28
    //   210: invokeinterface 668 1 0
    //   215: goto +502 -> 717
    //   218: iload 9
    //   220: iload_2
    //   221: if_icmpge -204 -> 17
    //   224: iload 9
    //   226: ifne +443 -> 669
    //   229: getstatic 663	aaw:gr	I
    //   232: istore 10
    //   234: aload 5
    //   236: iload 9
    //   238: aaload
    //   239: ifnonnull +452 -> 691
    //   242: aload_0
    //   243: iload_1
    //   244: iload 10
    //   246: invokestatic 683	dmr:a	(Landroid/content/Context;II)V
    //   249: goto +474 -> 723
    //   252: astore 31
    //   254: aload 23
    //   256: invokeinterface 668 1 0
    //   261: aload 31
    //   263: athrow
    //   264: astore_3
    //   265: ldc 2
    //   267: monitorexit
    //   268: aload_3
    //   269: athrow
    //   270: astore 30
    //   272: aload 27
    //   274: invokeinterface 668 1 0
    //   279: aload 30
    //   281: athrow
    //   282: astore 29
    //   284: aload 28
    //   286: invokeinterface 668 1 0
    //   291: aload 29
    //   293: athrow
    //   294: aload 24
    //   296: invokeinterface 142 1 0
    //   301: ifle +17 -> 318
    //   304: aload 5
    //   306: iconst_1
    //   307: aload_0
    //   308: iload_1
    //   309: aload 24
    //   311: getstatic 16	aaw:gu	I
    //   314: invokestatic 665	dkk:a	(Landroid/content/Context;ILandroid/database/Cursor;I)Ldkl;
    //   317: aastore
    //   318: aload 24
    //   320: invokeinterface 668 1 0
    //   325: goto +392 -> 717
    //   328: astore 25
    //   330: aload 24
    //   332: invokeinterface 668 1 0
    //   337: aload 25
    //   339: athrow
    //   340: aload_0
    //   341: iload_1
    //   342: invokestatic 660	brg:c	(Landroid/content/Context;I)Landroid/database/Cursor;
    //   345: astore 6
    //   347: aload 6
    //   349: ifnull +24 -> 373
    //   352: aload 5
    //   354: iconst_0
    //   355: aload_0
    //   356: iload_1
    //   357: aload 6
    //   359: getstatic 663	aaw:gr	I
    //   362: invokestatic 685	dkk:b	(Landroid/content/Context;ILandroid/database/Cursor;I)Ldkl;
    //   365: aastore
    //   366: aload 6
    //   368: invokeinterface 668 1 0
    //   373: aload_0
    //   374: iload_1
    //   375: iconst_0
    //   376: invokestatic 671	brg:b	(Landroid/content/Context;IZ)Landroid/database/Cursor;
    //   379: astore 7
    //   381: aload 7
    //   383: ifnull +334 -> 717
    //   386: aload_0
    //   387: iload_1
    //   388: invokestatic 653	dkk:b	(Landroid/content/Context;I)Z
    //   391: ifeq +242 -> 633
    //   394: aload 7
    //   396: invokestatic 674	dkk:b	(Landroid/database/Cursor;)Ljava/util/List;
    //   399: astore 11
    //   401: aload 7
    //   403: invokeinterface 668 1 0
    //   408: aload_0
    //   409: iload_1
    //   410: iconst_0
    //   411: aload 11
    //   413: iconst_0
    //   414: invokestatic 677	brg:a	(Landroid/content/Context;IZLjava/util/List;Z)Landroid/database/Cursor;
    //   417: astore 12
    //   419: aload 12
    //   421: ifnull +66 -> 487
    //   424: ldc_w 475
    //   427: iconst_3
    //   428: invokestatic 481	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   431: ifeq +35 -> 466
    //   434: aload 12
    //   436: invokeinterface 142 1 0
    //   441: invokestatic 687	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   444: invokestatic 486	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   447: astore 19
    //   449: aload 19
    //   451: invokevirtual 489	java/lang/String:length	()I
    //   454: ifeq +127 -> 581
    //   457: ldc_w 689
    //   460: aload 19
    //   462: invokevirtual 692	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   465: pop
    //   466: aload 5
    //   468: iconst_2
    //   469: aload_0
    //   470: iload_1
    //   471: aload 12
    //   473: getstatic 680	aaw:gv	I
    //   476: invokestatic 685	dkk:b	(Landroid/content/Context;ILandroid/database/Cursor;I)Ldkl;
    //   479: aastore
    //   480: aload 12
    //   482: invokeinterface 668 1 0
    //   487: aload_0
    //   488: iload_1
    //   489: iconst_0
    //   490: aload 11
    //   492: iconst_1
    //   493: invokestatic 677	brg:a	(Landroid/content/Context;IZLjava/util/List;Z)Landroid/database/Cursor;
    //   496: astore 14
    //   498: aload 14
    //   500: ifnull +217 -> 717
    //   503: ldc_w 475
    //   506: iconst_3
    //   507: invokestatic 481	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   510: ifeq +35 -> 545
    //   513: aload 14
    //   515: invokeinterface 142 1 0
    //   520: invokestatic 687	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   523: invokestatic 486	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   526: astore 16
    //   528: aload 16
    //   530: invokevirtual 489	java/lang/String:length	()I
    //   533: ifeq +74 -> 607
    //   536: ldc_w 694
    //   539: aload 16
    //   541: invokevirtual 692	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   544: pop
    //   545: aload 5
    //   547: iconst_1
    //   548: aload_0
    //   549: iload_1
    //   550: aload 14
    //   552: getstatic 16	aaw:gu	I
    //   555: invokestatic 685	dkk:b	(Landroid/content/Context;ILandroid/database/Cursor;I)Ldkl;
    //   558: aastore
    //   559: aload 14
    //   561: invokeinterface 668 1 0
    //   566: goto +151 -> 717
    //   569: astore 22
    //   571: aload 6
    //   573: invokeinterface 668 1 0
    //   578: aload 22
    //   580: athrow
    //   581: new 239	java/lang/String
    //   584: dup
    //   585: ldc_w 689
    //   588: invokespecial 697	java/lang/String:<init>	(Ljava/lang/String;)V
    //   591: pop
    //   592: goto -126 -> 466
    //   595: astore 13
    //   597: aload 12
    //   599: invokeinterface 668 1 0
    //   604: aload 13
    //   606: athrow
    //   607: new 239	java/lang/String
    //   610: dup
    //   611: ldc_w 694
    //   614: invokespecial 697	java/lang/String:<init>	(Ljava/lang/String;)V
    //   617: pop
    //   618: goto -73 -> 545
    //   621: astore 15
    //   623: aload 14
    //   625: invokeinterface 668 1 0
    //   630: aload 15
    //   632: athrow
    //   633: aload 5
    //   635: iconst_1
    //   636: aload_0
    //   637: iload_1
    //   638: aload 7
    //   640: getstatic 16	aaw:gu	I
    //   643: invokestatic 685	dkk:b	(Landroid/content/Context;ILandroid/database/Cursor;I)Ldkl;
    //   646: aastore
    //   647: aload 7
    //   649: invokeinterface 668 1 0
    //   654: goto +63 -> 717
    //   657: astore 8
    //   659: aload 7
    //   661: invokeinterface 668 1 0
    //   666: aload 8
    //   668: athrow
    //   669: iload 9
    //   671: iconst_1
    //   672: if_icmpne +11 -> 683
    //   675: getstatic 16	aaw:gu	I
    //   678: istore 10
    //   680: goto -446 -> 234
    //   683: getstatic 680	aaw:gv	I
    //   686: istore 10
    //   688: goto -454 -> 234
    //   691: aload_0
    //   692: iload_1
    //   693: aload 5
    //   695: iload 9
    //   697: aaload
    //   698: getfield 699	dkl:a	Landroid/app/Notification;
    //   701: iload 10
    //   703: aload 5
    //   705: iload 9
    //   707: aaload
    //   708: getfield 702	dkl:b	Z
    //   711: invokestatic 705	dmr:a	(Landroid/content/Context;ILandroid/app/Notification;IZ)V
    //   714: goto +9 -> 723
    //   717: iconst_0
    //   718: istore 9
    //   720: goto -502 -> 218
    //   723: iinc 9 1
    //   726: goto -508 -> 218
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	729	0	paramContext	Context
    //   0	729	1	paramInt	int
    //   1	221	2	i	int
    //   264	5	3	localObject1	Object
    //   10	3	4	bool	boolean
    //   35	669	5	arrayOfdkl	dkl[]
    //   345	227	6	localCursor1	Cursor
    //   379	281	7	localCursor2	Cursor
    //   657	10	8	localObject2	Object
    //   218	506	9	j	int
    //   232	470	10	k	int
    //   399	92	11	localList1	List
    //   417	181	12	localCursor3	Cursor
    //   595	10	13	localObject3	Object
    //   496	128	14	localCursor4	Cursor
    //   621	10	15	localObject4	Object
    //   526	14	16	str1	String
    //   447	14	19	str2	String
    //   569	10	22	localObject5	Object
    //   48	207	23	localCursor5	Cursor
    //   92	239	24	localCursor6	Cursor
    //   328	10	25	localObject6	Object
    //   112	60	26	localList2	List
    //   130	143	27	localCursor7	Cursor
    //   177	108	28	localCursor8	Cursor
    //   282	10	29	localObject7	Object
    //   270	10	30	localObject8	Object
    //   252	10	31	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   55	79	252	finally
    //   5	12	264	finally
    //   21	29	264	finally
    //   31	50	264	finally
    //   79	86	264	finally
    //   86	94	264	finally
    //   99	132	264	finally
    //   161	168	264	finally
    //   168	179	264	finally
    //   208	215	264	finally
    //   229	234	264	finally
    //   234	249	264	finally
    //   254	264	264	finally
    //   272	282	264	finally
    //   284	294	264	finally
    //   318	325	264	finally
    //   330	340	264	finally
    //   340	347	264	finally
    //   366	373	264	finally
    //   373	381	264	finally
    //   386	419	264	finally
    //   424	466	264	finally
    //   480	487	264	finally
    //   487	498	264	finally
    //   503	545	264	finally
    //   559	566	264	finally
    //   571	581	264	finally
    //   581	592	264	finally
    //   597	607	264	finally
    //   607	618	264	finally
    //   623	633	264	finally
    //   647	654	264	finally
    //   659	669	264	finally
    //   675	680	264	finally
    //   683	688	264	finally
    //   691	714	264	finally
    //   137	161	270	finally
    //   184	208	282	finally
    //   294	318	328	finally
    //   352	366	569	finally
    //   466	480	595	finally
    //   545	559	621	finally
    //   633	647	657	finally
  }
  
  private static void a(Context paramContext, dk paramdk, int paramInt, List<bpx> paramList)
  {
    if (paramList == null) {}
    for (;;)
    {
      return;
      try
      {
        String str1 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name");
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          bpx localbpx = (bpx)localIterator.next();
          Uri localUri = ((fyj)mbb.a(paramContext, fyj.class)).a(str1, localbpx.c);
          if (localUri != null)
          {
            String str2 = localUri.toString();
            paramdk.y.add(str2);
          }
        }
        if (!Log.isLoggable("AndroidNotification", 6)) {}
      }
      catch (SecurityException localSecurityException) {}
    }
    Log.e("AndroidNotification", "Insufficient permissions to get a contact", localSecurityException);
  }
  
  public static boolean a()
  {
    return !TextUtils.isEmpty(dun.e.a());
  }
  
  private static boolean a(Context paramContext)
  {
    return ((giz)mbb.a(paramContext, giz.class)).a(new String[] { "logged_in" }).size() > 1;
  }
  
  private static boolean a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      try
      {
        mmb localmmb = (mmb)((mke)qat.b(new mke(), paramArrayOfByte, 0, paramArrayOfByte.length)).b(mmb.a);
        if (localmmb != null)
        {
          if (localmmb.b == null) {
            break label91;
          }
          i = localmmb.b.a;
          if ((i == 5) || (i == 6)) {
            return true;
          }
        }
      }
      catch (qas localqas)
      {
        if (Log.isLoggable("AndroidNotification", 6)) {
          Log.e("AndroidNotification", "Unable to parse AppPayload proto", localqas);
        }
      }
      return false;
      label91:
      int i = 0;
    }
  }
  
  private static int b(int paramInt)
  {
    if (paramInt == aaw.gu) {
      return efj.qd;
    }
    return efj.sb;
  }
  
  private static Intent b(Context paramContext, int paramInt, Cursor paramCursor)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    if ((paramCursor != null) && (paramCursor.moveToFirst())) {
      do
      {
        localArrayList1.add(Integer.valueOf(paramCursor.getInt(12)));
        ArrayList localArrayList4 = a(paramCursor);
        localArrayList3.addAll(localArrayList4.subList(0, Math.min(localArrayList4.size(), 5)));
        localArrayList2.add(paramCursor.getString(9));
      } while (paramCursor.moveToNext());
    }
    dbh localdbh = new dbh(paramContext);
    localdbh.a.putExtra("account_id", paramInt);
    localdbh.a.putExtra("show_notifications", true);
    Intent localIntent = localdbh.a;
    if (!localArrayList1.isEmpty()) {
      localIntent.putIntegerArrayListExtra("com.google.android.libraries.social.notifications.notif_types", localArrayList1);
    }
    if (!localArrayList2.isEmpty()) {
      localIntent.putStringArrayListExtra("com.google.android.libraries.social.notifications.coalescing_codes", localArrayList2);
    }
    if (!localArrayList3.isEmpty()) {
      localIntent.putStringArrayListExtra("com.google.android.libraries.social.notifications.ext_ids", localArrayList3);
    }
    return localIntent;
  }
  
  private static dkl b(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2)
  {
    int i = 1;
    int j = paramCursor.getCount();
    if ((j > 0) && (paramCursor.moveToFirst()))
    {
      if (j == i)
      {
        if (Build.VERSION.SDK_INT >= 16) {}
        while (i != 0)
        {
          return e(paramContext, paramInt1, paramCursor, paramInt2);
          i = 0;
        }
        return c(paramContext, paramInt1, paramCursor, paramInt2);
      }
      if (j > i)
      {
        if (Build.VERSION.SDK_INT >= 16) {}
        while (i != 0)
        {
          return d(paramContext, paramInt1, paramCursor, paramInt2);
          i = 0;
        }
        return a(paramContext, paramInt1, j, paramCursor, paramInt2);
      }
    }
    return null;
  }
  
  private static List<String> b(Cursor paramCursor)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramCursor.getCount() > 0) && (paramCursor.moveToFirst())) {
      do
      {
        if (a(paramCursor.getBlob(28))) {
          localArrayList.add(paramCursor.getString(9));
        }
      } while (paramCursor.moveToNext());
    }
    return localArrayList;
  }
  
  private static boolean b(Context paramContext, int paramInt)
  {
    return ((hyi)mbb.a(paramContext, hyi.class)).b(bwb.y, paramInt);
  }
  
  private static boolean b(Context paramContext, int paramInt1, int paramInt2)
  {
    return (((hyi)mbb.a(paramContext, hyi.class)).b(bwb.v, paramInt1)) && (paramInt2 == 18);
  }
  
  private static dkl c(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2)
  {
    int i = paramCursor.getInt(13);
    int j = paramCursor.getInt(12);
    String str1 = paramCursor.getString(3);
    String str2 = paramCursor.getString(1);
    String str3 = String.valueOf(str1);
    String str4 = String.valueOf(str2);
    String str5 = 1 + String.valueOf(str3).length() + String.valueOf(str4).length() + str3 + "\n" + str4;
    byte[] arrayOfByte = paramCursor.getBlob(28);
    Resources localResources = paramContext.getResources();
    fe localfe = a(paramContext, paramInt1, paramCursor);
    if (i == 8) {
      return null;
    }
    int k;
    String str6;
    label198:
    Notification localNotification;
    if ((j == 6) || (j == 39))
    {
      k = efj.qa;
      PendingIntent localPendingIntent1 = localfe.a(dmr.a(), 134217728, null);
      str6 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt1).b("account_name");
      if (!a(paramContext)) {
        break label365;
      }
      localNotification = new Notification.Builder(paramContext).setSmallIcon(k).setContentTitle(str1).setContentText(str6).setTicker(str5).setWhen(System.currentTimeMillis()).setContentIntent(localPendingIntent1).getNotification();
      PendingIntent localPendingIntent2 = a(paramContext, paramInt1, paramCursor, "AST");
      if (localPendingIntent2 != null) {
        localNotification.deleteIntent = localPendingIntent2;
      }
      if (Build.VERSION.SDK_INT < 21) {
        break label372;
      }
    }
    label365:
    label372:
    for (int m = 1;; m = 0)
    {
      if (m != 0) {
        localNotification.color = localResources.getColor(efj.jY);
      }
      return new dkl(localNotification, b(paramContext, paramInt1, j));
      if (j == 18)
      {
        k = efj.qb;
        break;
      }
      if ((j == 97) || (j == 111) || (a(arrayOfByte)))
      {
        k = efj.rJ;
        break;
      }
      k = a(paramInt2);
      break;
      str6 = str2;
      break label198;
    }
  }
  
  @TargetApi(16)
  private static dkl d(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2)
  {
    do
    {
      if (!paramCursor.moveToNext()) {
        break;
      }
    } while (paramCursor.getInt(13) == 8);
    for (int i = 0; i != 0; i = 1) {
      return null;
    }
    if (!paramCursor.moveToFirst()) {
      return null;
    }
    long l = 9223372036854775807L;
    int j = 0;
    dn localdn = new dn();
    Object localObject1 = null;
    boolean bool1 = true;
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      Object localObject2;
      int i3;
      boolean bool2;
      if (paramCursor.getInt(13) != 8)
      {
        String str2 = paramCursor.getString(3);
        String str3 = paramCursor.getString(1);
        String str4 = String.valueOf(str2);
        String str5 = String.valueOf(str3);
        localObject2 = 2 + String.valueOf(str4).length() + String.valueOf(str5).length() + str4 + ": " + str5;
        localdn.a.add(dk.a((CharSequence)localObject2));
        if (localObject1 == null)
        {
          l = Math.min(l, paramCursor.getLong(6) / 1000L);
          i3 = j + 1;
          bool2 = bool1 & b(paramContext, paramInt1, paramCursor.getInt(12));
          byte[] arrayOfByte = paramCursor.getBlob(15);
          if (arrayOfByte != null) {
            localArrayList.addAll(bpw.a(arrayOfByte));
          }
        }
      }
      for (int k = i3;; k = j)
      {
        if (paramCursor.moveToNext()) {
          break label686;
        }
        if (k == 0) {
          return null;
        }
        Resources localResources = paramContext.getResources();
        String str1 = localResources.getQuantityString(efj.xG, k);
        Intent localIntent = b(paramContext, paramInt1, paramCursor);
        localIntent.addFlags(335544320);
        localIntent.putExtra("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION", true);
        dk localdk = new dk(paramContext);
        PendingIntent localPendingIntent1 = PendingIntent.getActivity(paramContext, dmr.a(), dmr.a(paramContext, paramInt1, localIntent), 0);
        localdn.d = dk.a(str1);
        localdk.x.tickerText = dk.a(str1);
        localdk.b = dk.a(str1);
        localdk.x.when = l;
        localdk.h = a(paramContext, paramCursor, paramInt1);
        localdk.g = k;
        localdk.d = localPendingIntent1;
        PendingIntent localPendingIntent2 = a(paramContext, paramInt1, paramCursor, "AST");
        localdk.x.deleteIntent = localPendingIntent2;
        localdk.a(localdn);
        int m;
        if (Build.VERSION.SDK_INT >= 21)
        {
          m = 1;
          if (m == 0) {
            break label625;
          }
          int i2 = b(paramInt2);
          localdk.x.icon = i2;
          label483:
          if (!TextUtils.isEmpty((CharSequence)localObject2)) {
            localdk.c = dk.a((CharSequence)localObject2);
          }
          if (a(paramContext)) {
            localdk.k = dk.a(((giz)mbb.a(paramContext, giz.class)).a(paramInt1).b("account_name"));
          }
          if (Build.VERSION.SDK_INT < 21) {
            break label658;
          }
        }
        label658:
        for (int i1 = 1;; i1 = 0)
        {
          if (i1 != 0)
          {
            localdk.v = 0;
            localdk.w = a(paramContext, paramInt2, k);
            localdk.s = "social";
            localdk.u = localResources.getColor(efj.jY);
            a(paramContext, localdk, paramInt1, localArrayList);
          }
          return new dkl(localdk.b(), bool2);
          m = 0;
          break;
          label625:
          int n = a(paramInt2);
          localdk.x.icon = n;
          localdk.e = BitmapFactory.decodeResource(localResources, b(paramInt2));
          break label483;
        }
        localObject2 = localObject1;
        break;
        localObject2 = localObject1;
        bool2 = bool1;
      }
      label686:
      j = k;
      bool1 = bool2;
      localObject1 = localObject2;
    }
  }
  
  @TargetApi(16)
  private static dkl e(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2)
  {
    i = paramCursor.getInt(13);
    if (i == 8) {
      return null;
    }
    localResources = paramContext.getResources();
    j = paramCursor.getInt(12);
    str1 = paramCursor.getString(9);
    l1 = paramCursor.getLong(20);
    str2 = paramCursor.getString(3);
    str3 = paramCursor.getString(1);
    str4 = paramCursor.getString(4);
    String str5 = 1 + String.valueOf(str2).length() + String.valueOf(str3).length() + str2 + "\n" + str3;
    long l2 = paramCursor.getLong(6) / 1000L;
    str6 = paramCursor.getString(16);
    k = 0;
    localObject1 = null;
    localObject2 = null;
    m = a(paramInt2);
    byte[] arrayOfByte1 = paramCursor.getBlob(15);
    if (arrayOfByte1 != null) {}
    for (localList1 = bpw.a(arrayOfByte1);; localList1 = null)
    {
      localBitmap1 = efj.a(a(paramContext, localList1), efj.k(paramContext));
      byte[] arrayOfByte2 = paramCursor.getBlob(22);
      try
      {
        mjp localmjp2 = (mjp)qat.b(new mjp(), arrayOfByte2, 0, arrayOfByte2.length);
        localmjp1 = localmjp2;
      }
      catch (qas localqas)
      {
        for (;;)
        {
          boolean bool1;
          Object localObject7;
          label388:
          dk localdk;
          label560:
          int i4;
          label766:
          int i5;
          label816:
          Log.e("AndroidNotification", "Unable to parse ExpandedInfo proto", localqas);
          mjp localmjp1 = null;
          continue;
          int i3 = efj.ry;
          int i1 = -1;
          Object localObject5 = null;
          Object localObject6 = null;
          Object localObject3 = null;
          Object localObject4 = null;
          int i2 = 0;
          continue;
          List localList2 = a(paramContext, localmjp1, 3);
          Bitmap localBitmap4 = efj.a(paramContext, localList2, (int)localResources.getDimension(efj.mu), (int)localResources.getDimension(efj.mt));
          int i23 = efj.qd;
          localBitmap1 = BitmapFactory.decodeResource(localResources, efj.qd);
          localObject6 = localBitmap4;
          i1 = -1;
          localObject5 = localList2;
          i3 = i23;
          localObject3 = null;
          localObject4 = null;
          i2 = 0;
          continue;
          if (!bool1)
          {
            int n = efj.sf;
            String str7 = localResources.getString(aau.lW);
            Intent localIntent1 = efj.a(paramContext, paramInt1, str6, str1, i, j, l1, true, true);
            if (localIntent1.resolveActivity(paramContext.getPackageManager()) != null) {
              localIntent1.putExtra("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION", true);
            }
            for (PendingIntent localPendingIntent1 = PendingIntent.getActivity(paramContext, dmr.a(), localIntent1, 0);; localPendingIntent1 = null)
            {
              i1 = 1;
              localObject3 = localPendingIntent1;
              localObject4 = str7;
              i2 = n;
              i3 = m;
              localObject5 = null;
              localObject6 = null;
              break;
            }
            int i17 = efj.se;
            if ((localList1 != null) && (!localList1.isEmpty()))
            {
              int i18;
              bpx localbpx;
              int i20;
              int i21;
              int i22;
              gnb localgnb;
              PendingIntent localPendingIntent4;
              String str20;
              if (j == 39)
              {
                i18 = 1;
                if ((i18 == 0) || (localList1.size() != 1)) {
                  break label2467;
                }
                localbpx = (bpx)localList1.get(0);
                if (localbpx == null) {
                  break label1258;
                }
                i20 = 1;
                if (localbpx.c == null) {
                  break label1264;
                }
                i21 = 1;
                if ((i20 & i21) == 0) {
                  break label2467;
                }
                i22 = efj.sf;
                String str21 = localResources.getString(aau.lY);
                if (localbpx != null) {
                  break label1270;
                }
                localgnb = null;
                Intent localIntent5 = efj.a(paramContext, paramInt1, null, localgnb);
                localPendingIntent4 = PendingIntent.getActivity(paramContext, dmr.a(), localIntent5, 0);
                str20 = str21;
              }
              for (int i19 = i22;; i19 = 0)
              {
                localObject2 = localPendingIntent4;
                localObject1 = str20;
                k = i19;
                localObject7 = localBitmap1;
                i3 = i17;
                break label388;
                i18 = 0;
                break label1120;
                i20 = 0;
                break label1157;
                i21 = 0;
                break label1168;
                localgnb = new gnb(new jjd(localbpx.c, localbpx.b, null));
                break label1199;
                if (a(paramCursor.getBlob(28))) {}
                for (int i14 = efj.rJ;; i14 = i3)
                {
                  Bitmap localBitmap3;
                  int i15;
                  String str18;
                  Intent localIntent4;
                  ArrayList localArrayList2;
                  if ((localObject5 != null) && (!localObject5.isEmpty()))
                  {
                    int i16 = (int)localResources.getDimension(efj.my);
                    localBitmap3 = efj.a((Bitmap)localObject5.get(0), i16, i16);
                    i15 = efj.sh;
                    str18 = localResources.getString(aau.pr);
                    if (brg.a(paramCursor) != 1) {
                      break label1535;
                    }
                    String str19 = jrf.a(6, new String[] { str1 });
                    bdo localbdo = new bdo(paramContext, paramInt1);
                    localbdo.e = str19;
                    localIntent4 = localbdo.a();
                    localArrayList2 = new ArrayList(1);
                    localArrayList2.add(str1);
                    if (duj.a(paramContext)) {
                      break label1618;
                    }
                  }
                  for (boolean bool4 = true;; bool4 = false)
                  {
                    ArrayList localArrayList3 = a(paramCursor);
                    dmr.a(paramContext, paramInt1, localIntent4, null, j, l1, false, bool4, false, true, localArrayList2, localArrayList3);
                    localObject2 = PendingIntent.getActivity(paramContext, dmr.a(), dmr.a(paramContext, paramInt1, localIntent4), 0);
                    localObject7 = localBitmap3;
                    localObject1 = str18;
                    k = i15;
                    i3 = i14;
                    break;
                    localBitmap3 = BitmapFactory.decodeResource(localResources, efj.qd);
                    break label1367;
                    if (duj.a(paramContext))
                    {
                      localIntent4 = efj.b(paramContext, paramInt1);
                      break label1431;
                    }
                    Intent localIntent3 = new Intent(paramContext, PhotosHomeActivity.class);
                    localIntent3.setAction("android.intent.action.VIEW");
                    if (paramInt1 != -1) {
                      localIntent3.putExtra("account_id", paramInt1);
                    }
                    localIntent3.putExtra("tabs", 6);
                    localIntent3.addFlags(335544320);
                    localIntent4 = localIntent3.putExtra("destination", 3);
                    break label1431;
                  }
                  int i11 = efj.qc;
                  BitmapFactory.decodeResource(localResources, efj.qc);
                  Bitmap localBitmap2;
                  int i12;
                  String str17;
                  Intent localIntent2;
                  ArrayList localArrayList1;
                  if ((localObject5 != null) && (!localObject5.isEmpty()))
                  {
                    int i13 = (int)localResources.getDimension(efj.my);
                    localBitmap2 = efj.a((Bitmap)localObject5.get(0), i13, i13);
                    i12 = efj.sh;
                    str17 = localResources.getString(aau.pr);
                    dbt localdbt = new dbt(paramContext, HostStreamPhotosHomeTileActivity.class, paramInt1);
                    localdbt.a = Integer.valueOf(2);
                    localdbt.e = Integer.valueOf(30);
                    localIntent2 = localdbt.a();
                    localArrayList1 = new ArrayList();
                    localArrayList1.add(str1);
                    if (duj.a(paramContext)) {
                      break label1840;
                    }
                  }
                  for (boolean bool3 = true;; bool3 = false)
                  {
                    dmr.a(paramContext, paramInt1, localIntent2, null, 18, l1, false, bool3, false, true, localArrayList1, a(paramCursor));
                    localObject2 = PendingIntent.getActivity(paramContext, dmr.a(), dmr.a(paramContext, paramInt1, localIntent2), 0);
                    localObject1 = str17;
                    k = i12;
                    localObject7 = localBitmap2;
                    i3 = i11;
                    break;
                    localBitmap2 = BitmapFactory.decodeResource(localResources, efj.qc);
                    break label1686;
                  }
                  boolean bool2 = lmp.c(paramContext, paramInt1, str6);
                  if (bool1)
                  {
                    int i10 = efj.pp;
                    llu localllu = lmp.f(paramContext, paramInt1, str6);
                    String str16 = localllu.d;
                    localObject2 = EsService.a(paramContext, paramInt1, str6, localllu, j, l1, str1, a(paramCursor));
                    localObject1 = str16;
                    k = i10;
                    localObject7 = localBitmap1;
                    break label388;
                  }
                  if (bool2) {
                    break;
                  }
                  int i9 = efj.sg;
                  String str15 = localResources.getString(aau.lX);
                  localObject2 = EsService.a(paramContext, paramInt1, str6, str1, l1);
                  localObject1 = str15;
                  k = i9;
                  localObject7 = localBitmap1;
                  break label388;
                  i3 = efj.rQ;
                  localObject7 = localBitmap1;
                  localObject2 = null;
                  localObject1 = null;
                  k = 0;
                  break label388;
                  if ((localmjp1 == null) || (localmjp1.b == null) || (localmjp1.b.length == 0)) {
                    break label560;
                  }
                  mjm[] arrayOfmjm = localmjp1.b;
                  if (arrayOfmjm.length == 1)
                  {
                    if (TextUtils.isEmpty(str4)) {
                      break label560;
                    }
                    if (str4.length() < 180) {}
                    String str11;
                    for (String str12 = str4;; str12 = 1 + String.valueOf(str11).length() + str11 + "…")
                    {
                      String str13 = String.valueOf(str12);
                      String str14 = 2 + String.valueOf(str3).length() + String.valueOf(str13).length() + str3 + "\n\n" + str13;
                      dj localdj = new dj();
                      localdj.a = dk.a(str14);
                      localdk.a(localdj);
                      break;
                      str11 = String.valueOf(str4.substring(0, 180));
                    }
                  }
                  switch (j)
                  {
                  }
                  dn localdn;
                  for (int i6 = 1; i6 != 0; i6 = 0)
                  {
                    localdn = new dn(localdk);
                    localdn.d = dk.a(str2);
                    if ((k == 0) && (i2 == 0))
                    {
                      localdn.e = dk.a(localResources.getString(aau.cf));
                      localdn.f = true;
                    }
                    int i7 = arrayOfmjm.length;
                    for (int i8 = 0; i8 < i7; i8++)
                    {
                      mjm localmjm = arrayOfmjm[i8];
                      String str8 = localmjm.a.c;
                      if (!TextUtils.isEmpty(localmjm.a.d))
                      {
                        String str9 = String.valueOf(str8);
                        String str10 = String.valueOf(localmjm.a.d);
                        str8 = 1 + String.valueOf(str9).length() + String.valueOf(str10).length() + str9 + " " + str10;
                      }
                      localdn.a.add(dk.a(str8));
                    }
                  }
                  if (TextUtils.isEmpty(str4)) {
                    break label560;
                  }
                  localdn.a.add(dk.a(" "));
                  localdn.a.add(dk.a(str4));
                  break label560;
                  i4 = 0;
                  break label766;
                  i5 = 0;
                  break label816;
                }
                localPendingIntent4 = null;
                str20 = null;
              }
            }
            i3 = i17;
            localObject7 = localBitmap1;
            localObject2 = null;
            localObject1 = null;
            k = 0;
          }
        }
      }
      bool1 = lmp.d(paramContext, paramInt1, str6);
      switch (i)
      {
      default: 
        localObject5 = null;
        i3 = m;
        localObject6 = null;
        i1 = -1;
        localObject3 = null;
        localObject4 = null;
        i2 = 0;
        switch (j)
        {
        default: 
          localObject7 = localBitmap1;
          PendingIntent localPendingIntent2 = a(paramContext, paramInt1, paramCursor).a(dmr.a(), 134217728, null);
          localdk = new dk(paramContext);
          localdk.x.tickerText = dk.a(str5);
          localdk.b = dk.a(str2);
          localdk.c = dk.a(str3);
          localdk.x.when = l2;
          localdk.h = a(paramContext, paramCursor, paramInt1);
          localdk.x.icon = i3;
          localdk.d = localPendingIntent2;
          PendingIntent localPendingIntent3 = a(paramContext, paramInt1, paramCursor, "AST");
          localdk.x.deleteIntent = localPendingIntent3;
          if (localObject6 == null) {
            break label1986;
          }
          di localdi = new di();
          localdi.a = localObject6;
          if (!a(paramContext))
          {
            localdi.e = dk.a(str3);
            localdi.f = true;
          }
          localdk.a(localdi);
          if (localObject7 != null) {
            localdk.e = ((Bitmap)localObject7);
          }
          if (!bgp.a(paramContext, paramInt1))
          {
            if (k != 0)
            {
              dg localdg2 = new dh(k, (CharSequence)localObject1, (PendingIntent)localObject2).a();
              dx localdx2 = new dx();
              localdx2.a.add(localdg2);
              localdx2.a(localdk);
              localdk.a(k, (CharSequence)localObject1, (PendingIntent)localObject2);
            }
            if (i2 != 0)
            {
              if (i1 != 1)
              {
                dg localdg1 = new dh(i2, (CharSequence)localObject4, (PendingIntent)localObject3).a();
                dx localdx1 = new dx();
                localdx1.a.add(localdg1);
                localdx1.a(localdk);
              }
              localdk.a(i2, (CharSequence)localObject4, (PendingIntent)localObject3);
            }
          }
          if (a(paramContext)) {
            localdk.k = dk.a(((giz)mbb.a(paramContext, giz.class)).a(paramInt1).b("account_name"));
          }
          if (Build.VERSION.SDK_INT < 21) {
            break label2448;
          }
          i4 = 1;
          if (i4 != 0)
          {
            localdk.v = 0;
            localdk.w = a(paramContext, paramInt2, 1);
            localdk.s = "social";
            a(paramContext, localdk, paramInt1, localList1);
          }
          if (Build.VERSION.SDK_INT < 21) {
            break label2454;
          }
          i5 = 1;
          if (i5 != 0) {
            localdk.u = localResources.getColor(efj.jY);
          }
          return new dkl(localdk.b(), b(paramContext, paramInt1, j));
        }
        break;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dkk
 * JD-Core Version:    0.7.0.1
 */