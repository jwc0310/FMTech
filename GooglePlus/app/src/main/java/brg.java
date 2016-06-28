import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.plus.content.EsProvider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class brg
{
  public static final byte[] a = new byte[0];
  private static kl<String, Integer> b;
  private static final Object c;
  private static final String d;
  private static final String e;
  private static final String f;
  private static final String g;
  private static final String h;
  
  static
  {
    kl localkl = new kl();
    b = localkl;
    localkl.put("ASPEN_INVITE", Integer.valueOf(74));
    b.put("BIRTHDAY_WISH", Integer.valueOf(63));
    b.put("CIRCLE_CONTACT_JOINED", Integer.valueOf(69));
    b.put("CIRCLE_DIGESTED_ADD", Integer.valueOf(40));
    b.put("CIRCLE_EXPLICIT_INVITE", Integer.valueOf(32));
    b.put("CIRCLE_INVITE_REQUEST", Integer.valueOf(8));
    b.put("CIRCLE_INVITEE_JOINED_ES", Integer.valueOf(38));
    b.put("CIRCLE_MEMBER_JOINED_ES", Integer.valueOf(9));
    b.put("CIRCLE_PERSONAL_ADD", Integer.valueOf(6));
    b.put("CIRCLE_RECIPROCATING_ADD", Integer.valueOf(39));
    b.put("CIRCLE_RECOMMEND_PEOPLE", Integer.valueOf(66));
    b.put("CIRCLE_STATUS_CHANGE", Integer.valueOf(7));
    b.put("DIGEST_SWEEP", Integer.valueOf(70));
    b.put("ENTITYPROFILE_ADD_ADMIN", Integer.valueOf(34));
    b.put("ENTITYPROFILE_REMOVE_ADMIN", Integer.valueOf(35));
    b.put("ENTITYPROFILE_TRANSFER_OWNERSHIP", Integer.valueOf(36));
    b.put("EVENTS_BEFORE_REMINDER", Integer.valueOf(59));
    b.put("EVENTS_CHANGE", Integer.valueOf(53));
    b.put("EVENTS_CHECKIN", Integer.valueOf(58));
    b.put("EVENTS_INVITE", Integer.valueOf(47));
    b.put("EVENTS_INVITEE_CHANGE", Integer.valueOf(57));
    b.put("EVENTS_PHOTOS_ADDED", Integer.valueOf(62));
    b.put("EVENTS_PHOTOS_COLLECTION", Integer.valueOf(56));
    b.put("EVENTS_PHOTOS_REMINDER", Integer.valueOf(55));
    b.put("EVENTS_RSVP_CONFIRMATION", Integer.valueOf(67));
    b.put("EVENTS_STARTING", Integer.valueOf(54));
    b.put("EVENTS_SEND_MESSAGE", Integer.valueOf(76));
    b.put("GAMES_APPLICATION_MESSAGE", Integer.valueOf(12));
    b.put("GAMES_INVITE_REQUEST", Integer.valueOf(11));
    b.put("GAMES_ONEUP_NOTIFICATION", Integer.valueOf(73));
    b.put("GAMES_PERSONAL_MESSAGE", Integer.valueOf(17));
    b.put("HANGOUT_INVITE", Integer.valueOf(33));
    b.put("MOBILE_NEW_CONVERSATION", Integer.valueOf(29));
    b.put("PHOTOS_CAMERASYNC_UPLOADED", Integer.valueOf(18));
    b.put("PHOTOS_FACE_SUGGESTED", Integer.valueOf(41));
    b.put("PHOTOS_PROFILE_PHOTO_SUGGESTED", Integer.valueOf(68));
    b.put("PHOTOS_PROFILE_PHOTO_SUGGESTION_ACCEPTED", Integer.valueOf(71));
    b.put("PHOTOS_TAG_ADDED_ON_PHOTO", Integer.valueOf(13));
    b.put("PHOTOS_TAGGED_IN_PHOTO", Integer.valueOf(10));
    b.put("QUESTIONS_ANSWERER_FOLLOWUP", Integer.valueOf(30));
    b.put("QUESTIONS_ASKER_FOLLOWUP", Integer.valueOf(31));
    b.put("QUESTIONS_DASHER_WELCOME", Integer.valueOf(27));
    b.put("QUESTIONS_REFERRAL", Integer.valueOf(19));
    b.put("QUESTIONS_REPLY", Integer.valueOf(22));
    b.put("QUESTIONS_UNANSWERED_QUESTION", Integer.valueOf(28));
    b.put("SQUARE_ABUSE", Integer.valueOf(79));
    b.put("SQUARE_INVITE", Integer.valueOf(48));
    b.put("SQUARE_MEMBERSHIP_APPROVED", Integer.valueOf(51));
    b.put("SQUARE_MEMBERSHIP_REQUEST", Integer.valueOf(52));
    b.put("SQUARE_NAME_CHANGE", Integer.valueOf(72));
    b.put("SQUARE_NEW_MODERATOR", Integer.valueOf(65));
    b.put("SQUARE_SUBSCRIPTION", Integer.valueOf(49));
    b.put("STREAM_COMMENT_AT_REPLY", Integer.valueOf(15));
    b.put("STREAM_COMMENT_FOLLOWUP", Integer.valueOf(3));
    b.put("STREAM_COMMENT_FOR_PHOTO_TAGGED", Integer.valueOf(25));
    b.put("STREAM_COMMENT_FOR_PHOTO_TAGGER", Integer.valueOf(26));
    b.put("STREAM_COMMENT_NEW", Integer.valueOf(2));
    b.put("STREAM_COMMENT_ON_MENTION", Integer.valueOf(14));
    b.put("STREAM_LIKE", Integer.valueOf(4));
    b.put("STREAM_PLUSONE_COMMENT", Integer.valueOf(21));
    b.put("STREAM_PLUSONE_POST", Integer.valueOf(20));
    b.put("STREAM_POST_AT_REPLY", Integer.valueOf(16));
    b.put("STREAM_POST_FROM_UNCIRCLED", Integer.valueOf(61));
    b.put("STREAM_POST_SHARED", Integer.valueOf(24));
    b.put("STREAM_POST", Integer.valueOf(1));
    b.put("STREAM_POST_SUBSCRIBED", Integer.valueOf(64));
    b.put("STREAM_RESHARE", Integer.valueOf(5));
    b.put("SYSTEM_CELEBRITY_SUGGESTIONS", Integer.valueOf(45));
    b.put("SYSTEM_CONNECTED_SITES", Integer.valueOf(46));
    b.put("SYSTEM_DO_NOT_USE", Integer.valueOf(50));
    b.put("SYSTEM_FRIEND_SUGGESTIONS", Integer.valueOf(44));
    b.put("SYSTEM_INVITE", Integer.valueOf(37));
    b.put("SYSTEM_TOOLTIP", Integer.valueOf(43));
    b.put("SYSTEM_WELCOME", Integer.valueOf(42));
    b.put("TARGET_SHARED", Integer.valueOf(60));
    b.put("UNKNOWN_NOTIFICATION_TYPE", Integer.valueOf(0));
    b.put("PHOTOS_NEW_PHOTO_ADDED", Integer.valueOf(97));
    b.put("SYSTEM_SOCEND_ANNOUNCEMENT", Integer.valueOf(101));
    b.put("USER_LOCATION_SHARE", Integer.valueOf(105));
    b.put("USER_LOCATION_SILENT_SHARE", Integer.valueOf(108));
    b.put("ENGAGE_POSTS_FROM_CLOSE_TIES", Integer.valueOf(106));
    b.put("PHOTOS_PHOTO_EDIT_COMPLETE", Integer.valueOf(111));
    c = new Object();
    Object[] arrayOfObject1 = { "guns", "read_state=0" };
    d = String.format(Locale.US, "SELECT COUNT(*) FROM %s WHERE %s", arrayOfObject1);
    Object[] arrayOfObject2 = { "guns", "read_state=1" };
    e = String.format(Locale.US, "SELECT COUNT(*) FROM %s WHERE %s", arrayOfObject2);
    Object[] arrayOfObject3 = { "guns", "read_state=0 AND pending_read=0" };
    f = String.format(Locale.US, "SELECT COUNT(*) FROM %s WHERE %s", arrayOfObject3);
    Object[] arrayOfObject4 = { "guns", "pending_read!=0" };
    g = String.format(Locale.US, "SELECT COUNT(*) FROM %s WHERE %s", arrayOfObject4);
    Object[] arrayOfObject5 = { "guns", "priority!=3", "pending_read!=0" };
    h = String.format(Locale.US, "SELECT COUNT(*) FROM %s WHERE %s AND %s", arrayOfObject5);
  }
  
  /* Error */
  public static int a(Context paramContext, int paramInt1, byte[] paramArrayOfByte, brm parambrm, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: new 246	kck
    //   3: dup
    //   4: invokespecial 247	kck:<init>	()V
    //   7: astore 6
    //   9: aload_3
    //   10: getstatic 252	brm:c	Lbrm;
    //   13: if_acmpne +9 -> 22
    //   16: aload 6
    //   18: iconst_1
    //   19: putfield 256	kck:n	Z
    //   22: aload 6
    //   24: ldc_w 258
    //   27: invokevirtual 261	kck:b	(Ljava/lang/String;)V
    //   30: new 263	bis
    //   33: dup
    //   34: aload_0
    //   35: new 265	kcg
    //   38: dup
    //   39: aload_0
    //   40: iload_1
    //   41: aload 6
    //   43: invokespecial 268	kcg:<init>	(Landroid/content/Context;ILkck;)V
    //   46: iload_1
    //   47: aload_2
    //   48: aload_3
    //   49: iload 4
    //   51: iload 5
    //   53: invokespecial 271	bis:<init>	(Landroid/content/Context;Lkcg;I[BLbrm;II)V
    //   56: astore 7
    //   58: aload 7
    //   60: invokevirtual 274	bis:i	()V
    //   63: aload 7
    //   65: getfield 277	bis:a	[Lmjk;
    //   68: astore 9
    //   70: aload 7
    //   72: ldc_w 279
    //   75: invokevirtual 281	bis:d	(Ljava/lang/String;)V
    //   78: aload 7
    //   80: getfield 283	bis:b	[B
    //   83: astore 10
    //   85: new 285	java/util/HashSet
    //   88: dup
    //   89: invokespecial 286	java/util/HashSet:<init>	()V
    //   92: astore 11
    //   94: aload_0
    //   95: iload_1
    //   96: aload 9
    //   98: aload 11
    //   100: aload 10
    //   102: iload 4
    //   104: iload 5
    //   106: invokestatic 289	brg:a	(Landroid/content/Context;I[Lmjk;Ljava/util/Set;[BII)V
    //   109: aload_0
    //   110: iload_1
    //   111: aload 11
    //   113: aload 6
    //   115: invokestatic 292	brg:a	(Landroid/content/Context;ILjava/util/Set;Lkck;)V
    //   118: aload_0
    //   119: invokevirtual 298	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   122: aload_0
    //   123: invokestatic 303	com/google/android/apps/plus/content/EsProvider:d	(Landroid/content/Context;)Landroid/net/Uri;
    //   126: iload_1
    //   127: invokestatic 306	com/google/android/apps/plus/content/EsProvider:a	(Landroid/net/Uri;I)Landroid/net/Uri;
    //   130: aconst_null
    //   131: invokevirtual 312	android/content/ContentResolver:notifyChange	(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    //   134: aload 9
    //   136: ifnonnull +14 -> 150
    //   139: iconst_0
    //   140: istore 12
    //   142: aload 6
    //   144: invokevirtual 314	kck:d	()V
    //   147: iload 12
    //   149: ireturn
    //   150: aload 9
    //   152: arraylength
    //   153: istore 12
    //   155: goto -13 -> 142
    //   158: astore 8
    //   160: aload 6
    //   162: invokevirtual 314	kck:d	()V
    //   165: aload 8
    //   167: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	paramContext	Context
    //   0	168	1	paramInt1	int
    //   0	168	2	paramArrayOfByte	byte[]
    //   0	168	3	parambrm	brm
    //   0	168	4	paramInt2	int
    //   0	168	5	paramInt3	int
    //   7	154	6	localkck	kck
    //   56	23	7	localbis	bis
    //   158	8	8	localObject	Object
    //   68	83	9	arrayOfmjk	mjk[]
    //   83	18	10	arrayOfByte	byte[]
    //   92	20	11	localHashSet	HashSet
    //   140	14	12	i	int
    // Exception table:
    //   from	to	target	type
    //   30	134	158	finally
    //   150	155	158	finally
  }
  
  private static int a(Context paramContext, int paramInt1, mjk[] paramArrayOfmjk, brm parambrm, Set<String> paramSet, boolean paramBoolean, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    if ((paramArrayOfmjk == null) || (paramArrayOfmjk.length == 0)) {
      return 0;
    }
    if (!bgp.a(paramContext, paramInt1)) {
      brn.d(paramContext, paramInt1);
    }
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt1).getWritableDatabase();
    int i = 0;
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      int k;
      try
      {
        ContentValues localContentValues1 = new ContentValues();
        long l1 = a(localSQLiteDatabase, false);
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        ArrayList localArrayList3 = new ArrayList();
        int j = paramArrayOfmjk.length;
        k = 0;
        if (k < j)
        {
          mjk localmjk = paramArrayOfmjk[k];
          a(localmjk, localContentValues1, k);
          String str1 = localContentValues1.getAsString("key");
          if (localSQLiteDatabase.insertWithOnConflict("guns", "key", localContentValues1, 4) == -1L)
          {
            localContentValues1.remove("pending_read");
            long l2 = localContentValues1.getAsLong("updated_version").longValue();
            if ((2 != paramInt2) || (4 != paramInt3)) {
              break label1030;
            }
            n = 1;
            if (n != 0) {
              localContentValues1.remove("updated_version");
            }
            Cursor localCursor = localSQLiteDatabase.query("guns", new String[] { "updated_version", "push_enabled" }, "key=?", new String[] { str1 }, null, null, null);
            if ((localCursor == null) || (!localCursor.moveToFirst())) {
              break label1036;
            }
            long l3 = localCursor.getLong(localCursor.getColumnIndex("updated_version"));
            int i1 = localCursor.getInt(localCursor.getColumnIndex("push_enabled"));
            if (l3 < l2)
            {
              if (localSQLiteDatabase.update("guns", localContentValues1, "key=?", new String[] { str1 }) <= 0) {
                break label1000;
              }
              if ((parambrm == brm.a) || (localContentValues1.getAsInteger("push_enabled").intValue() == i1)) {
                break label1007;
              }
              localArrayList3.add(localmjk);
              break label1007;
              localArrayList1.add(str1);
              localArrayList2.add(localContentValues1.getAsInteger("type"));
              byte[] arrayOfByte1 = localContentValues1.getAsByteArray("actors");
              if (arrayOfByte1 != null)
              {
                List localList = bpw.a(arrayOfByte1);
                if ((localList != null) && (!localList.isEmpty())) {
                  brn.a(localSQLiteDatabase, str1, localList);
                }
              }
              byte[] arrayOfByte2 = localContentValues1.getAsByteArray("PHOTOS");
              if (arrayOfByte2 != null)
              {
                llt localllt = llt.a(arrayOfByte2);
                mjt localmjt = localmjk.d;
                String str2 = null;
                if (localmjt != null)
                {
                  mjm localmjm = localmjk.d.a;
                  str2 = null;
                  if (localmjm != null)
                  {
                    mjn localmjn = localmjk.d.a.c;
                    str2 = null;
                    if (localmjn != null) {
                      str2 = localmjk.d.a.c.a;
                    }
                  }
                }
                okn[] arrayOfokn = efj.a(localSQLiteDatabase, efj.a(null, localllt), str2);
                String[] arrayOfString = new String[1];
                arrayOfString[0] = localmjk.a;
                String str3 = jrf.a(6, arrayOfString);
                if (a(jrf.d(paramContext, paramInt1, str3), localllt)) {
                  jrf.a(paramContext, paramInt1, str3, arrayOfokn, true, false, null, true);
                }
              }
              String str4 = localContentValues1.getAsString("activity_id");
              if ((paramSet == null) || (TextUtils.isEmpty(str4))) {
                break label1020;
              }
              paramSet.add(str4);
              break label1020;
            }
            if (l3 != l2) {
              break label1036;
            }
            ContentValues localContentValues2 = new ContentValues();
            localContentValues2.put("pending_delete", Integer.valueOf(0));
            localSQLiteDatabase.update("guns", localContentValues2, "key=?", new String[] { str1 });
            break label1036;
          }
          if (parambrm != brm.a)
          {
            if (localContentValues1.getAsInteger("push_enabled").intValue() != 1) {
              break label1043;
            }
            localArrayList3.add(localmjk);
            break label1043;
          }
        }
        else
        {
          if (!localArrayList3.isEmpty()) {
            a(localArrayList3);
          }
          if (paramBoolean) {
            a(paramContext, localSQLiteDatabase, paramArrayOfByte, paramInt2, paramInt3, false);
          }
          a(localSQLiteDatabase, 200L);
          localSQLiteDatabase.setTransactionSuccessful();
          long l4 = a(localSQLiteDatabase, false);
          Bundle localBundle = new Bundle();
          switch (brh.a[parambrm.ordinal()])
          {
          default: 
            gxz localgxz3 = gxz.bB;
            gya localgya3 = gya.w;
            localObject2 = localgxz3;
            localObject3 = localgya3;
            if (!localArrayList2.isEmpty()) {
              localBundle.putIntegerArrayList("extra_notification_types", localArrayList2);
            }
            if (!localArrayList1.isEmpty()) {
              localBundle.putStringArrayList("extra_notification_id_list", localArrayList1);
            }
            localBundle.putInt("extra_num_unread_notifi", (int)l4);
            localBundle.putInt("extra_prev_num_unread_noti", (int)l1);
            gxx localgxx = (gxx)mbb.a(paramContext, gxx.class);
            gxw localgxw = new gxw(paramContext, paramInt1);
            localgxw.c = ((gxz)localObject2);
            localgxw.d = ((gya)localObject3);
            if (localBundle != null) {
              localgxw.h.putAll(localBundle);
            }
            localgxx.a(localgxw);
            return i;
          case 1: 
            gxz localgxz2 = gxz.br;
            gya localgya2 = gya.w;
            localObject2 = localgxz2;
            localObject3 = localgya2;
            break;
          }
          gxz localgxz1 = gxz.bC;
          gya localgya1 = gya.u;
          Object localObject2 = localgxz1;
          Object localObject3 = localgya1;
          continue;
        }
        m = i;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      continue;
      label1000:
      int i2 = i;
      break label1013;
      label1007:
      i2 = i + 1;
      label1013:
      int m = i2;
      continue;
      label1020:
      k++;
      i = m;
      continue;
      label1030:
      int n = 0;
      continue;
      label1036:
      m = i;
      continue;
      label1043:
      m = i + 1;
    }
  }
  
  public static int a(Cursor paramCursor)
  {
    byte[] arrayOfByte = paramCursor.getBlob(23);
    llt localllt;
    if (arrayOfByte != null)
    {
      localllt = llt.a(arrayOfByte);
      if (localllt != null) {}
    }
    else
    {
      return 0;
    }
    return localllt.a;
  }
  
  private static int a(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    Cursor localCursor = paramSQLiteDatabase.query("guns", new String[] { "display_index" }, a(paramInt1, paramInt2), null, null, null, "display_index DESC LIMIT 1");
    for (;;)
    {
      try
      {
        if (localCursor.moveToNext())
        {
          long l2 = localCursor.getLong(0);
          l1 = l2;
          return (int)l1;
        }
      }
      finally
      {
        localCursor.close();
      }
      long l1 = -1L;
    }
  }
  
  private static long a(SQLiteDatabase paramSQLiteDatabase, boolean paramBoolean)
  {
    String str1 = d;
    String str2 = String.valueOf("pending_delete");
    return DatabaseUtils.longForQuery(paramSQLiteDatabase, 7 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + " AND " + str2 + "=0", null);
  }
  
  public static Cursor a(Context paramContext, int paramInt, boolean paramBoolean1, List<String> paramList, boolean paramBoolean2)
  {
    Cursor localCursor;
    if (paramList.size() == 0) {
      if (paramBoolean2) {
        localCursor = b(paramContext, paramInt, paramBoolean1);
      }
    }
    String str1;
    String str2;
    String str3;
    label156:
    String str5;
    String str8;
    label218:
    do
    {
      return localCursor;
      return null;
      long l1 = h(paramContext, paramInt);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l1);
      str1 = String.format(Locale.US, "read_state=0 AND pending_read=0 AND updated_version>%d", arrayOfObject);
      if (!paramBoolean2) {
        break;
      }
      str2 = 7 + String.valueOf("key").length() + "( " + "key" + " != '";
      if (!paramBoolean2) {
        break label496;
      }
      str3 = 11 + String.valueOf("key").length() + "' AND " + "key" + " != '";
      String str4 = TextUtils.join(str3, paramList);
      str5 = 3 + String.valueOf(str2).length() + String.valueOf(str4).length() + str2 + str4 + "' )";
      if (!paramBoolean1) {
        break label541;
      }
      str8 = null;
      localCursor = bqj.a(paramContext, paramInt).getReadableDatabase().query("guns", bri.a, str8, null, null, null, "creation_time DESC");
    } while ((localCursor == null) || (!Log.isLoggable("EsNotificationData", 4)));
    label259:
    if (localCursor.moveToNext())
    {
      String str9 = String.valueOf("getPhotosNotificationsToDisplayWithRestriction:query: ");
      String str10 = String.valueOf(str8);
      if (str10.length() != 0) {
        str9.concat(str10);
      }
      for (;;)
      {
        String str11 = String.valueOf("getPhotosNotificationsToDisplayWithRestriction: unread notification key: ");
        String str12 = String.valueOf(localCursor.getString(9));
        String str13 = String.valueOf(localCursor.getString(3));
        String str14 = String.valueOf(localCursor.getString(1));
        long l2 = localCursor.getLong(6);
        new StringBuilder(59 + String.valueOf(str11).length() + String.valueOf(str12).length() + String.valueOf(str13).length() + String.valueOf(str14).length()).append(str11).append(str12).append(", heading: ").append(str13).append(", description: ").append(str14).append(", timestamp: ").append(l2);
        break label259;
        str2 = 6 + String.valueOf("key").length() + "( " + "key" + " = '";
        break;
        label496:
        str3 = 9 + String.valueOf("key").length() + "' OR " + "key" + " = '";
        break label156;
        label541:
        String str6 = String.valueOf("read_state=0 AND seen=0 AND push_enabled!=0 AND ");
        String str7 = String.valueOf("(type=97 OR type=111 OR type=18 OR type=99)");
        str8 = 10 + String.valueOf(str6).length() + String.valueOf(str1).length() + String.valueOf(str5).length() + String.valueOf(str7).length() + str6 + str1 + " AND " + str5 + " AND " + str7;
        break label218;
        new String(str9);
      }
    }
    localCursor.moveToPosition(-1);
    return localCursor;
  }
  
  private static String a(int paramInt)
  {
    if (paramInt == 4) {
      return "priority=3";
    }
    if (paramInt == 2) {
      return "priority!=3";
    }
    return "priority=3";
  }
  
  private static String a(int paramInt1, int paramInt2)
  {
    String str1 = "";
    String str2;
    if (paramInt1 == 2)
    {
      str1 = "read_state=1";
      str2 = "";
      if (paramInt2 != 4) {
        break label78;
      }
      str2 = "priority=3";
    }
    for (;;)
    {
      return 5 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + " AND " + str2;
      if (paramInt1 != 1) {
        break;
      }
      str1 = "read_state=0";
      break;
      label78:
      if (paramInt2 == 2) {
        str2 = "priority!=3";
      }
    }
  }
  
  public static String a(Context paramContext)
  {
    String str = null;
    if (paramContext != null) {
      str = PreferenceManager.getDefaultSharedPreferences(paramContext).getString(paramContext.getString(aau.px), null);
    }
    return str;
  }
  
  private static ArrayList<String> a(mjp parammjp)
  {
    ArrayList localArrayList;
    mjr[] arrayOfmjr;
    int i;
    int j;
    if ((parammjp != null) && (parammjp.a != null) && (parammjp.a.b != null))
    {
      localArrayList = new ArrayList();
      arrayOfmjr = parammjp.a.b;
      i = arrayOfmjr.length;
      j = 0;
    }
    while (j < i)
    {
      mjr localmjr = arrayOfmjr[j];
      if ((localmjr.a != null) && (!TextUtils.isEmpty(localmjr.a.a))) {
        localArrayList.add(localmjr.a.a);
      }
      j++;
      continue;
      localArrayList = null;
    }
    return localArrayList;
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase1 = bqj.a(paramContext, paramInt).getWritableDatabase();
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("read_state", Integer.valueOf(1));
    localContentValues.put("pending_read", Integer.valueOf(0));
    localSQLiteDatabase1.update("guns", localContentValues, null, null);
    a(paramContext, paramInt, 1, null);
    SQLiteDatabase localSQLiteDatabase2 = bqj.a(paramContext, paramInt).getWritableDatabase();
    a(paramContext, localSQLiteDatabase2, null, 1, 4, false);
    a(paramContext, localSQLiteDatabase2, null, 1, 2, true);
    dmr.a(paramContext, paramInt, aaw.gr);
    paramContext.getContentResolver().notifyChange(EsProvider.a(EsProvider.d(paramContext), paramInt), null);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt1).getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put(b(paramInt2, paramInt3), Long.valueOf(System.currentTimeMillis()));
    localSQLiteDatabase.update("account_status", localContentValues, null, null);
    paramContext.getContentResolver().notifyChange(EsProvider.c(paramContext), null);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt1).getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    String str = "";
    if (paramInt2 == 2)
    {
      str = "read_low_notifications_summary";
      if ((str.length() <= 0) || (paramArrayOfByte == null) || (paramArrayOfByte.length <= 0)) {
        break label98;
      }
      localContentValues.put(str, paramArrayOfByte);
    }
    for (;;)
    {
      localSQLiteDatabase.update("account_status", localContentValues, null, null);
      paramContext.getContentResolver().notifyChange(EsProvider.c(paramContext), null);
      return;
      if (paramInt2 != 1) {
        break;
      }
      str = "unread_low_notifications_summary";
      break;
      label98:
      localContentValues.putNull(str);
    }
  }
  
  public static void a(Context paramContext, int paramInt, long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("last_viewed_notification_version", Long.valueOf(paramLong));
    localSQLiteDatabase.update("account_status", localContentValues, null, null);
    paramContext.getContentResolver().notifyChange(EsProvider.c(paramContext), null);
  }
  
  public static void a(Context paramContext, int paramInt, Long paramLong, Boolean paramBoolean, Integer paramInteger, boolean paramBoolean1)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    if (paramLong != null) {
      localContentValues.put("unviewed_notifications_count", paramLong);
    }
    if (paramBoolean != null) {
      if (!paramBoolean.booleanValue()) {
        break label115;
      }
    }
    label115:
    for (int i = 1;; i = 0)
    {
      localContentValues.put("has_unread_notifications", Integer.valueOf(i));
      if (paramInteger != null) {
        localContentValues.put("notification_poll_interval", Integer.valueOf(1000 * paramInteger.intValue()));
      }
      localSQLiteDatabase.update("account_status", localContentValues, null, null);
      if (paramBoolean1) {
        paramContext.getContentResolver().notifyChange(EsProvider.c(paramContext), null);
      }
      return;
    }
  }
  
  public static void a(Context paramContext, int paramInt, List<String> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return;
    }
    if (Log.isLoggable("EsNotificationData", 4))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      int i = paramList.size();
      for (int j = 0; j < i; j++) {
        localStringBuilder.append((String)paramList.get(j)).append(' ');
      }
      String str = String.valueOf(localStringBuilder.toString());
      if (str.length() == 0) {
        break label195;
      }
      "markNotificationAsPushDisabled: ".concat(str);
    }
    for (;;)
    {
      SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
      ContentValues localContentValues = new ContentValues(1);
      localContentValues.put("push_enabled", Integer.valueOf(0));
      int k = paramList.size();
      for (int m = 0; m < k; m++)
      {
        String[] arrayOfString = new String[1];
        arrayOfString[0] = ((String)paramList.get(m));
        localSQLiteDatabase.update("guns", localContentValues, "key = ?", arrayOfString);
      }
      break;
      label195:
      new String("markNotificationAsPushDisabled: ");
    }
  }
  
  public static void a(Context paramContext, int paramInt, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return;
    }
    SQLiteDatabase localSQLiteDatabase;
    int m;
    label127:
    String[] arrayOfString;
    if (Log.isLoggable("EsNotificationData", 4))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      int i = paramList.size();
      for (int j = 0; j < i; j++) {
        localStringBuilder.append((String)paramList.get(j)).append(' ');
      }
      String str1 = String.valueOf(localStringBuilder.toString());
      if (str1.length() != 0) {
        "markNotificationAsRead: ".concat(str1);
      }
    }
    else
    {
      localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
      int k = paramList.size();
      m = 0;
      if (m >= k) {
        break label202;
      }
      arrayOfString = new String[1];
      arrayOfString[0] = ((String)paramList.get(m));
      if (!paramBoolean1) {
        break label189;
      }
      localSQLiteDatabase.execSQL("UPDATE guns SET read_state = 1, pending_read = 0 WHERE key =?", arrayOfString);
    }
    for (;;)
    {
      m++;
      break label127;
      new String("markNotificationAsRead: ");
      break;
      label189:
      localSQLiteDatabase.execSQL("UPDATE guns SET pending_read = 1 WHERE pending_read = 0 AND read_state = 0 AND key =?", arrayOfString);
    }
    label202:
    if (a(localSQLiteDatabase, false) == 0L) {
      dmr.a(paramContext, paramInt, aaw.gr);
    }
    long l1 = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT last_viewed_notification_version  FROM account_status", null);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(l1);
    String str2 = String.format(Locale.US, "read_state=0 AND pending_read=0 AND updated_version>%d", arrayOfObject);
    String str3 = String.valueOf("SELECT COUNT(*) FROM guns WHERE ");
    String str4 = String.valueOf(str2);
    String str5;
    label292:
    int n;
    label319:
    ContentValues localContentValues;
    if (str4.length() != 0)
    {
      str5 = str3.concat(str4);
      long l2 = DatabaseUtils.longForQuery(localSQLiteDatabase, str5, null);
      if (DatabaseUtils.longForQuery(localSQLiteDatabase, f, null) <= 0L) {
        break label423;
      }
      n = 1;
      localContentValues = new ContentValues();
      localContentValues.put("unviewed_notifications_count", Long.valueOf(l2));
      if (n == 0) {
        break label429;
      }
    }
    label423:
    label429:
    for (int i1 = 1;; i1 = 0)
    {
      localContentValues.put("has_unread_notifications", Integer.valueOf(i1));
      localSQLiteDatabase.update("account_status", localContentValues, null, null);
      paramContext.getContentResolver().notifyChange(EsProvider.c(paramContext), null);
      if (!paramBoolean2) {
        break;
      }
      paramContext.getContentResolver().notifyChange(EsProvider.a(EsProvider.d(paramContext), paramInt), null);
      return;
      str5 = new String(str3);
      break label292;
      n = 0;
      break label319;
    }
  }
  
  private static void a(Context paramContext, int paramInt, Set<String> paramSet, kck paramkck)
  {
    if (((giz)mbb.a(paramContext, giz.class)).a(paramInt).c("is_google_plus")) {
      if ((paramSet != null) && (!paramSet.isEmpty())) {
        break label151;
      }
    }
    for (;;)
    {
      if (!paramSet.isEmpty())
      {
        if (Log.isLoggable("EsNotificationData", 4))
        {
          int i = paramSet.size();
          new StringBuilder(34).append("Prefetching ").append(i).append(" activities");
        }
        biu localbiu = new biu(paramContext, new kcg(paramContext, paramInt, paramkck), paramInt, (String[])paramSet.toArray(new String[paramSet.size()]), null, false, 8);
        localbiu.i();
        localbiu.c("EsNotificationData");
      }
      return;
      label151:
      SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
      String[] arrayOfString = new String[paramSet.size()];
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("activity_id IN (");
      Iterator localIterator = paramSet.iterator();
      int m;
      for (int j = 0; localIterator.hasNext(); j = m)
      {
        String str = (String)localIterator.next();
        localStringBuilder.append("?,");
        m = j + 1;
        arrayOfString[j] = str;
      }
      localStringBuilder.setLength(-1 + localStringBuilder.length());
      localStringBuilder.append(')');
      Cursor localCursor = localSQLiteDatabase.query("activities", new String[] { "activity_id" }, localStringBuilder.toString(), arrayOfString, null, null, null);
      int k = 0;
      try
      {
        while (localCursor.moveToNext())
        {
          paramSet.remove(localCursor.getString(0));
          k++;
        }
        localCursor.close();
        if (!Log.isLoggable("EsNotificationData", 3)) {
          continue;
        }
        new StringBuilder(37).append(k).append(" activities already cached");
      }
      finally
      {
        localCursor.close();
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt1, kck paramkck, lrh paramlrh, brm parambrm, int paramInt2, int paramInt3, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    kcp localkcp;
    int i;
    int j;
    bis localbis1;
    bis localbis3;
    for (;;)
    {
      kcg localkcg;
      synchronized (c)
      {
        if (paramkck.b()) {
          return;
        }
        if (dun.b())
        {
          jac localjac = (jac)mbb.a(paramContext, jac.class);
          if (parambrm == null)
          {
            localObject3 = "NULL";
            localjac.a(paramInt1, (String)localObject3);
          }
        }
        else
        {
          if (parambrm == brm.c) {
            paramkck.n = true;
          }
          paramkck.b("Notifications");
          if (parambrm == brm.c) {
            a(paramContext, paramInt1, false);
          }
          try
          {
            localkcg = new kcg(paramContext, paramInt1, paramkck);
            localkcp = kdg.a(paramContext, localkcg);
            if ((1 != paramInt2) || (4 != paramInt3)) {
              break label431;
            }
            i = 1;
            if ((i == 0) || (parambrm == brm.c)) {
              break label437;
            }
            j = 1;
            if (j == 0) {
              break label443;
            }
            l1 = g(paramContext, paramInt1);
            if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0)) {
              break label449;
            }
            localbis1 = new bis(paramContext, localkcg, paramInt1, paramArrayOfByte, parambrm, paramInt2, paramInt3);
            if (i != 0) {
              localkcp.a(new bir(paramContext, paramInt1, paramkck));
            }
            if (j == 0) {
              break label1139;
            }
            bis localbis2 = new bis(paramContext, localkcg, paramInt1, l1, parambrm, 2, 4);
            localkcp.a(localbis2);
            localbis3 = localbis2;
            localkcp.a(localbis1);
            localkcp.i();
            if (paramlrh != null) {
              paramlrh.a(localkcp);
            }
            if (!localkcp.n()) {
              break label547;
            }
            if (Log.isLoggable("EsNotificationData", 4))
            {
              int i9 = localkcp.o;
              new StringBuilder(52).append("fetchNotifications error with error code ").append(i9);
            }
            if ((!a(localkcp)) && (parambrm != brm.b)) {
              break;
            }
            int i7 = localkcp.o;
            String str1 = String.valueOf(localkcp.p);
            throw new brj(21 + String.valueOf(str1).length() + "Error: " + i7 + " [" + str1 + "]");
          }
          catch (brj localbrj)
          {
            paramkck.d();
          }
          label405:
          return;
        }
      }
      String str3 = parambrm.toString();
      Object localObject3 = str3;
      continue;
      label431:
      i = 0;
      continue;
      label437:
      j = 0;
      continue;
      label443:
      long l1 = 0L;
      continue;
      label449:
      localbis1 = new bis(paramContext, localkcg, paramInt1, l1, parambrm, paramInt2, paramInt3);
    }
    int i8 = localkcp.o;
    String str2 = String.valueOf(localkcp.p);
    throw new IOException(21 + String.valueOf(str2).length() + "Error: " + i8 + " [" + str2 + "]");
    label547:
    mjk[] arrayOfmjk1 = localbis1.a;
    long l2 = localbis1.e;
    if (l2 > h(paramContext, paramInt1)) {
      a(paramContext, paramInt1, l2);
    }
    byte[] arrayOfByte = localbis1.b;
    int k;
    label605:
    int m;
    int n;
    label641:
    label700:
    label876:
    boolean bool;
    if ((j != 0) && (arrayOfByte != null) && (arrayOfByte.length > 0))
    {
      k = 1;
      if (j != 0)
      {
        if (k == 0) {
          break label1196;
        }
        b(paramContext, paramInt1, paramInt2, paramInt3, false);
        if (Log.isLoggable("EsNotificationData", 3))
        {
          m = 0;
          n = 0;
          if (j == 0)
          {
            if (i != 0)
            {
              SQLiteDatabase localSQLiteDatabase3 = bqj.a(paramContext, paramInt1).getWritableDatabase();
              ContentValues localContentValues2 = new ContentValues();
              localContentValues2.put("pending_delete", Integer.valueOf(1));
              localSQLiteDatabase3.update("guns", localContentValues2, a(paramInt2, paramInt3), null);
            }
          }
          else
          {
            if (arrayOfmjk1 != null)
            {
              long l3 = g(paramContext, paramInt1);
              long l4 = localbis1.d;
              if (l4 > l3)
              {
                SQLiteDatabase localSQLiteDatabase1 = bqj.a(paramContext, paramInt1).getWritableDatabase();
                ContentValues localContentValues1 = new ContentValues();
                localContentValues1.put("last_notification_sync_version", Long.valueOf(l4));
                localSQLiteDatabase1.update("account_status", localContentValues1, null, null);
              }
              if (j != 0)
              {
                int i1 = arrayOfmjk1.length;
                SQLiteDatabase localSQLiteDatabase2 = bqj.a(paramContext, paramInt1).getReadableDatabase();
                Object[] arrayOfObject = new Object[5];
                arrayOfObject[0] = "guns";
                arrayOfObject[1] = "display_index";
                arrayOfObject[2] = "display_index";
                arrayOfObject[3] = Integer.valueOf(i1);
                arrayOfObject[4] = a(paramInt2, paramInt3);
                localSQLiteDatabase2.execSQL(String.format(Locale.US, "UPDATE %s SET %s = %s + %d WHERE %s", arrayOfObject));
              }
              HashSet localHashSet = new HashSet();
              if (j == 0) {
                break label1145;
              }
              if (k == 0) {
                break label1207;
              }
              break label1145;
              m = a(paramContext, paramInt1, arrayOfmjk1, parambrm, localHashSet, bool, arrayOfByte, paramInt2, paramInt3);
              a(paramContext, paramInt1, localHashSet, paramkck);
            }
            if (j == 0) {
              b(paramContext, paramInt1, paramInt2, paramInt3, true);
            }
            if (paramInt3 == 4) {
              a(paramContext, paramInt1, paramInt2, localbis1.c);
            }
            paramContext.getContentResolver().notifyChange(EsProvider.a(EsProvider.d(paramContext), paramInt1), null);
            paramContext.getContentResolver().notifyChange(EsProvider.c(paramContext), null);
            if (!paramBoolean) {
              break label1151;
            }
            if (m != 0) {
              break label1213;
            }
          }
        }
      }
    }
    label1050:
    label1184:
    label1196:
    label1207:
    label1213:
    for (int i6 = 9;; i6 = 8)
    {
      new kpu(i6).b(paramContext);
      break label1151;
      label996:
      int i4;
      int i3;
      label1015:
      int i5;
      if (i4 != 0)
      {
        if (i3 > 0) {
          break label1184;
        }
        if (dkk.a())
        {
          break label1184;
          if (i5 != 0) {
            dkk.a(paramContext, paramInt1);
          }
          paramkck.b(i3);
          if (i4 == 0) {
            break label405;
          }
          bgp.a(paramContext, paramInt1, dnn.a, System.currentTimeMillis());
          break label405;
        }
      }
      for (;;)
      {
        if ((arrayOfmjk2 != null) && (arrayOfmjk2.length > 0))
        {
          n = 0 + arrayOfmjk2.length;
          m = a(paramContext, paramInt1, arrayOfmjk2, parambrm, null, true, null, 2, 4);
          break label641;
        }
        label1110:
        label1139:
        label1145:
        label1151:
        do
        {
          arrayOfmjk2 = localbis3.a;
          break label1050;
          b(paramContext, paramInt1, paramInt2, paramInt3, false);
          break label700;
          int i2 = arrayOfmjk1.length;
          do
          {
            i4 = 0;
            break label996;
            i5 = 0;
            break label1015;
            m = 0;
            n = 0;
            break label641;
            localbis3 = null;
            break;
            bool = true;
            break label876;
            if (arrayOfmjk1 != null) {
              break label1110;
            }
            i2 = 0;
            i3 = n + i2;
          } while ((1 != paramInt2) || (4 != paramInt3));
          i4 = 1;
          break label996;
          i5 = 1;
          break label1015;
          k = 0;
          break label605;
        } while (localbis3 != null);
        mjk[] arrayOfmjk2 = null;
      }
      bool = false;
      break label876;
    }
  }
  
  public static void a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    if (DatabaseUtils.longForQuery(localSQLiteDatabase, h, null) > 0L) {}
    for (int i = 1;; i = 0)
    {
      if (DatabaseUtils.longForQuery(localSQLiteDatabase, g, null) > 0L)
      {
        localSQLiteDatabase.execSQL("UPDATE guns SET read_state = 1, pending_read = 0 WHERE pending_read = 1");
        if (i != 0) {
          a(paramContext, paramInt, 1, null);
        }
        if (paramBoolean) {
          paramContext.getContentResolver().notifyChange(EsProvider.a(EsProvider.d(paramContext), paramInt), null);
        }
      }
      return;
    }
  }
  
  private static void a(Context paramContext, int paramInt1, mjk[] paramArrayOfmjk, Set<String> paramSet, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt1).getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    if (paramArrayOfmjk != null) {}
    for (;;)
    {
      int k;
      try
      {
        if (paramArrayOfmjk.length > 0)
        {
          ContentValues localContentValues = new ContentValues();
          int i = paramArrayOfmjk.length;
          int j = 1 + a(localSQLiteDatabase, paramInt2, paramInt3);
          k = 0;
          if (k < i)
          {
            a(paramArrayOfmjk[k], localContentValues, j + k);
            localSQLiteDatabase.insertWithOnConflict("guns", "key", localContentValues, 5);
            String str = localContentValues.getAsString("activity_id");
            if (TextUtils.isEmpty(str)) {
              break label152;
            }
            paramSet.add(str);
            break label152;
          }
        }
        a(paramContext, localSQLiteDatabase, paramArrayOfByte, paramInt2, paramInt3, true);
        localSQLiteDatabase.setTransactionSuccessful();
        return;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      label152:
      k++;
    }
  }
  
  private static void a(Context paramContext, SQLiteDatabase paramSQLiteDatabase, byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramArrayOfByte == a) {
      return;
    }
    long l;
    label115:
    ContentValues localContentValues;
    String str4;
    if (paramInt1 == 2)
    {
      String str5 = e;
      String str6 = String.valueOf(a(paramInt2));
      String str7 = String.valueOf("pending_delete");
      l = DatabaseUtils.longForQuery(paramSQLiteDatabase, 12 + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + str5 + " AND " + str6 + " AND " + str7 + "=0", null);
      if (l >= 100L) {
        paramArrayOfByte = null;
      }
      localContentValues = new ContentValues();
      str4 = c(paramInt1, paramInt2);
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0)) {
        break label295;
      }
      localContentValues.put(str4, paramArrayOfByte);
    }
    for (;;)
    {
      paramSQLiteDatabase.update("account_status", localContentValues, null, null);
      if (!paramBoolean) {
        break;
      }
      paramContext.getContentResolver().notifyChange(EsProvider.c(paramContext), null);
      return;
      String str1 = d;
      String str2 = String.valueOf(a(paramInt2));
      String str3 = String.valueOf("pending_delete");
      l = DatabaseUtils.longForQuery(paramSQLiteDatabase, 12 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + str1 + " AND " + str2 + " AND " + str3 + "=0", null);
      break label115;
      label295:
      localContentValues.putNull(str4);
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    if ((paramContext != null) && (!TextUtils.isEmpty(paramString)))
    {
      SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(paramContext).edit();
      localEditor.putString(paramContext.getString(aau.px), paramString);
      localEditor.commit();
    }
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    a(paramSQLiteDatabase, 200L);
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, long paramLong)
  {
    long l = bqj.a(paramSQLiteDatabase, "guns", null, null);
    if (Log.isLoggable("EsNotificationData", 4)) {
      new StringBuilder(84).append("deleteOldNotifications, keep count: 200").append(", have: ").append(l);
    }
    if (l - 200L <= 0L) {}
    Cursor localCursor;
    do
    {
      return;
      localCursor = paramSQLiteDatabase.query("guns", brk.a, null, null, null, null, "creation_time ASC", Long.toString(l - 200L));
    } while ((localCursor == null) || (localCursor.getCount() == 0));
    StringBuffer localStringBuffer = new StringBuffer(256);
    for (;;)
    {
      try
      {
        localStringBuffer.append("key IN(");
        int i = 1;
        if (!localCursor.moveToNext()) {
          break;
        }
        if (i != 0)
        {
          i = 0;
          localStringBuffer.append('\'');
          localStringBuffer.append(localCursor.getString(0));
          localStringBuffer.append('\'');
        }
        else
        {
          localStringBuffer.append(',');
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    localStringBuffer.append(')');
    localCursor.close();
    paramSQLiteDatabase.delete("guns", localStringBuffer.toString(), null);
  }
  
  private static void a(Collection<mjk> paramCollection)
  {
    if (Log.isLoggable("EsNotificationData", 4))
    {
      int i = paramCollection.size();
      new StringBuilder(32).append(i).append("Notifications to Log:");
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext()) {
        ((mjk)localIterator.next()).toString();
      }
    }
  }
  
  private static void a(mjk parammjk, ContentValues paramContentValues, int paramInt)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    paramContentValues.clear();
    paramContentValues.put("key", parammjk.a);
    long l1 = 0L;
    long l2 = 0L;
    paramContentValues.put("display_index", Integer.valueOf(paramInt));
    if (parammjk.h != null)
    {
      l2 = parammjk.h.longValue();
      paramContentValues.put("updated_version", Long.valueOf(l2));
    }
    long l3 = l2;
    if (parammjk.k != null) {
      paramContentValues.put("analytics_data", qat.a(parammjk.k));
    }
    int i = parammjk.c;
    int j;
    Boolean localBoolean;
    boolean bool;
    label149:
    int k;
    label157:
    String str8;
    int i12;
    label291:
    int i13;
    label317:
    String str10;
    label390:
    int i7;
    int i8;
    label426:
    String str7;
    if ((i == 1) || (i == 4))
    {
      j = 0;
      paramContentValues.put("read_state", Integer.valueOf(j));
      localBoolean = parammjk.i;
      if (localBoolean != null) {
        break label536;
      }
      bool = false;
      if (!bool) {
        break label546;
      }
      k = 1;
      paramContentValues.put("push_enabled", Integer.valueOf(k));
      paramContentValues.put("pending_read", Integer.valueOf(0));
      paramContentValues.put("seen", Integer.valueOf(0));
      paramContentValues.put("pending_delete", Integer.valueOf(0));
      paramContentValues.put("priority", Integer.valueOf(parammjk.b));
      if (parammjk.e != null)
      {
        mjl[] arrayOfmjl = parammjk.e;
        if (arrayOfmjl.length != 0)
        {
          mjl localmjl = arrayOfmjl[0];
          str8 = localmjl.a;
          if (!TextUtils.isEmpty(str8))
          {
            if ((TextUtils.isEmpty(str8)) || (!b.containsKey(str8))) {
              break label552;
            }
            i12 = ((Integer)b.get(str8)).intValue();
            paramContentValues.put("type", Integer.valueOf(i12));
            if (!str8.startsWith("STREAM")) {
              break label558;
            }
            i13 = 1;
            paramContentValues.put("category", Integer.valueOf(i13));
            if (TextUtils.equals("BIRTHDAY_WISH", str8))
            {
              String str9 = localmjl.b;
              if (!TextUtils.isEmpty(str9))
              {
                if (TextUtils.isEmpty(str9)) {
                  break label706;
                }
                String[] arrayOfString = str9.split(":");
                if ((arrayOfString == null) || (arrayOfString.length < 3)) {
                  break label706;
                }
                str10 = arrayOfString[2];
                if (!TextUtils.isEmpty(str10)) {
                  paramContentValues.put("activity_id", str10);
                }
              }
            }
          }
        }
      }
      if (parammjk.f == null) {
        break label877;
      }
      mjo[] arrayOfmjo = parammjk.f;
      i7 = 0;
      i8 = 0;
      if (i8 >= arrayOfmjo.length) {
        break label851;
      }
      mjo localmjo = arrayOfmjo[i8];
      int i9 = localmjo.a;
      str7 = localmjo.b;
      if (!TextUtils.isEmpty(str7)) {
        switch (i9)
        {
        }
      }
    }
    for (;;)
    {
      int i10 = i7;
      for (;;)
      {
        label508:
        i8++;
        i7 = i10;
        break label426;
        if (i == 2)
        {
          j = 1;
          break;
        }
        j = 2;
        break;
        label536:
        bool = localBoolean.booleanValue();
        break label149;
        label546:
        k = 0;
        break label157;
        label552:
        i12 = 0;
        break label291;
        label558:
        if (str8.startsWith("EVENTS"))
        {
          i13 = 10;
          break label317;
        }
        if (str8.startsWith("SQUARE"))
        {
          i13 = 11;
          break label317;
        }
        if (str8.startsWith("PHOTOS"))
        {
          i13 = 3;
          break label317;
        }
        if (str8.startsWith("GAMES"))
        {
          i13 = 4;
          break label317;
        }
        if (str8.startsWith("CIRCLE"))
        {
          i13 = 2;
          break label317;
        }
        if (str8.startsWith("SYSTEM"))
        {
          i13 = 5;
          break label317;
        }
        if (str8.startsWith("HANGOUT"))
        {
          i13 = 8;
          break label317;
        }
        if (str8.startsWith("ENGAGE_POSTS"))
        {
          i13 = 13;
          break label317;
        }
        i13 = 65535;
        break label317;
        label706:
        str10 = null;
        break label390;
        paramContentValues.put("activity_id", str7);
        i10 = i7 + 1;
        continue;
        paramContentValues.put("event_id", str7);
        i10 = i7;
        continue;
        paramContentValues.put("album_id", str7);
        localArrayList2.add(str7);
        i10 = i7;
        continue;
        paramContentValues.put("community_id", str7);
        i10 = i7;
      }
      int i11 = str7.indexOf("#");
      if (i11 <= 0) {}
      for (Object localObject3 = null; !TextUtils.isEmpty((CharSequence)localObject3); localObject3 = str7.substring(0, i11))
      {
        paramContentValues.put("activity_id", (String)localObject3);
        i10 = i7;
        break label508;
      }
      localArrayList1.add(str7);
    }
    label851:
    if ((paramContentValues.containsKey("community_id")) && (i7 > 1)) {
      paramContentValues.put("activity_id", "");
    }
    label877:
    ArrayList localArrayList3 = new ArrayList();
    mjt localmjt;
    long l4;
    ArrayList localArrayList6;
    List localList;
    if (parammjk.d != null)
    {
      localmjt = parammjk.d;
      if (localmjt.a != null)
      {
        mjm localmjm = localmjt.a;
        if (localmjm.b == null) {
          break label1694;
        }
        l4 = localmjm.b.longValue();
        if (localmjm.c != null) {
          paramContentValues.put("collapsed_destination", localmjm.c.a);
        }
        if (localmjm.a != null)
        {
          mju localmju = localmjm.a;
          paramContentValues.put("collapsed_heading", localmju.c);
          paramContentValues.put("collapsed_description", localmju.d);
          paramContentValues.put("collapsed_annotation", localmju.e);
          if (localmju.a != null) {
            paramContentValues.put("collapsed_icon", localmju.a.a);
          }
          if (localmju.b != null) {
            for (mjs localmjs : localmju.b) {
              localArrayList3.add(new bpx(localmjs.b, localmjs.c, hdo.a(localmjs.a)));
            }
          }
        }
      }
      else
      {
        l4 = l1;
      }
      localArrayList6 = a(localmjt.b);
      localList = b(localmjt.b);
      if (localList.isEmpty()) {}
    }
    for (;;)
    {
      try
      {
        paramContentValues.put("creators", bpw.a(localList));
        paramContentValues.put("expanded_info", c(localmjt.b));
        localmlf = localmjt.c;
        if (localmlf == null)
        {
          arrayOfByte1 = null;
          paramContentValues.put("payload", arrayOfByte1);
          localmke = localmjt.d;
          if (localmke != null) {
            continue;
          }
          arrayOfByte2 = null;
          paramContentValues.put("app_payload", arrayOfByte2);
          l1 = l4;
          localArrayList4 = localArrayList6;
          int m = localArrayList1.size();
          int n = localArrayList2.size();
          if (localArrayList4 != null) {
            continue;
          }
          i1 = 0;
          if ((i1 <= 0) || (i1 != m)) {
            continue;
          }
          localArrayList5 = new ArrayList(i1);
          int i2 = 0;
          localObject1 = "";
          if (i2 >= i1) {
            continue;
          }
          if (i2 >= n) {
            continue;
          }
          localObject2 = (String)localArrayList2.get(i2);
          String str3 = (String)localArrayList1.get(i2);
          int i3 = str3.indexOf(":");
          if (i3 <= 0) {
            continue;
          }
          str4 = str3.substring(0, i3);
          int i4 = str3.indexOf(":");
          if (i4 + 1 >= str3.length()) {
            continue;
          }
          str5 = str3.substring(i4 + 1);
          if ((!TextUtils.isEmpty(str4)) && (!TextUtils.isEmpty(str5)))
          {
            llx localllx = new llx(str4, str5, (String)localObject2, (String)localArrayList4.get(i2));
            localArrayList5.add(localllx);
          }
          i2++;
          localObject1 = localObject2;
          continue;
        }
      }
      catch (IOException localIOException3)
      {
        mlf localmlf;
        mke localmke;
        ArrayList localArrayList5;
        Object localObject1;
        String str6 = String.valueOf(localIOException3);
        Log.e("EsNotificationData", 42 + String.valueOf(str6).length() + "Cannot serialize creators (DataActor) list" + str6);
        continue;
        byte[] arrayOfByte1 = qat.a(localmlf);
        continue;
        byte[] arrayOfByte2 = qat.a(localmke);
        continue;
        int i1 = localArrayList4.size();
        continue;
        String str4 = null;
        continue;
        String str5 = null;
        continue;
        try
        {
          paramContentValues.put("PHOTOS", llt.a(new llt(localArrayList5)));
          if (localArrayList3.isEmpty()) {}
        }
        catch (IOException localIOException2)
        {
          try
          {
            paramContentValues.put("actors", bpw.a(localArrayList3));
            if (l1 > 0L)
            {
              paramContentValues.put("creation_time", Long.valueOf(l1));
              return;
              localIOException2 = localIOException2;
              String str2 = String.valueOf(localIOException2);
              Log.e("EsNotificationData", 32 + String.valueOf(str2).length() + "Cannot serialize PlusPhoto list " + str2);
            }
          }
          catch (IOException localIOException1)
          {
            String str1 = String.valueOf(localIOException1);
            Log.e("EsNotificationData", 32 + String.valueOf(str1).length() + "Cannot serialize DataActor list " + str1);
            continue;
            l1 = l3;
            continue;
          }
        }
        Object localObject2 = localObject1;
        continue;
      }
      label1694:
      l4 = l1;
      break;
      ArrayList localArrayList4 = null;
    }
  }
  
  public static boolean a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (paramBoolean) {
      return true;
    }
    int i;
    if ((1 == paramInt2) && (4 == paramInt3))
    {
      i = 1;
      if (i == 0) {
        break label79;
      }
    }
    label79:
    for (long l1 = bgp.a(paramContext, paramInt1, dnn.a);; l1 = c(paramContext, paramInt1, paramInt2, paramInt3))
    {
      long l2 = ((hyi)mbb.a(paramContext, hyi.class)).c(bwb.h, paramInt1).longValue();
      if (System.currentTimeMillis() - l1 <= l2) {
        break label91;
      }
      return true;
      i = 0;
      break;
    }
    label91:
    return false;
  }
  
  private static boolean a(Set<String> paramSet, llt paramllt)
  {
    int j;
    if ((paramSet != null) && (paramllt != null) && (paramSet.size() == paramllt.a))
    {
      int i = paramllt.a;
      j = 0;
      if (j >= i) {
        break label62;
      }
      if (paramSet.remove(String.valueOf(paramllt.f[j].h))) {
        break label56;
      }
    }
    label56:
    label62:
    while (!paramSet.isEmpty())
    {
      return true;
      j++;
      break;
    }
    return false;
  }
  
  private static boolean a(kcp paramkcp)
  {
    ArrayList localArrayList = paramkcp.e;
    for (int i = 0;; i++)
    {
      int j = localArrayList.size();
      boolean bool = false;
      if (i < j)
      {
        kbw localkbw = (kbw)localArrayList.get(i);
        if ((localkbw.o >= 400) && (localkbw.o < 500)) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
    }
  }
  
  public static Cursor b(Context paramContext, int paramInt, boolean paramBoolean)
  {
    long l1 = h(paramContext, paramInt);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(l1);
    String str1 = String.format(Locale.US, "read_state=0 AND pending_read=0 AND updated_version>%d", arrayOfObject);
    if (paramBoolean) {}
    Cursor localCursor;
    String str2;
    String str3;
    for (String str4 = null;; str4 = 5 + String.valueOf(str2).length() + String.valueOf(str1).length() + String.valueOf(str3).length() + str2 + str1 + " AND " + str3)
    {
      localCursor = bqj.a(paramContext, paramInt).getReadableDatabase().query("guns", bri.a, str4, null, null, null, "creation_time DESC");
      if ((localCursor == null) || (!Log.isLoggable("EsNotificationData", 4))) {
        break label315;
      }
      while (localCursor.moveToNext())
      {
        String str5 = String.valueOf(localCursor.getString(9));
        String str6 = String.valueOf(localCursor.getString(3));
        String str7 = String.valueOf(localCursor.getString(1));
        long l2 = localCursor.getLong(6);
        new StringBuilder(117 + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length()).append("getPhotosNotificationsToDisplay: unread notification key: ").append(str5).append(", heading: ").append(str6).append(", description: ").append(str7).append(", timestamp: ").append(l2);
      }
      str2 = String.valueOf("read_state=0 AND seen=0 AND push_enabled!=0 AND ");
      str3 = String.valueOf("(type=97 OR type=111 OR type=18 OR type=99)");
    }
    localCursor.moveToPosition(-1);
    label315:
    return localCursor;
  }
  
  private static String b(int paramInt1, int paramInt2)
  {
    int i = 1;
    if ((i == paramInt1) && (4 == paramInt2)) {}
    while (i != 0)
    {
      throw new IllegalArgumentException("This method should not be used for high-priority unread notifications.");
      i = 0;
    }
    if (paramInt1 == 2)
    {
      if (paramInt2 == 4) {
        return "last_read_notifications_sync_time";
      }
      return "last_lowpri_read_notifications_sync_time";
    }
    return "last_lowpri_unread_notifications_sync_time";
  }
  
  private static List<bpx> b(mjp parammjp)
  {
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    if ((parammjp != null) && (parammjp.b != null))
    {
      mjm[] arrayOfmjm = parammjp.b;
      int i = arrayOfmjm.length;
      for (int j = 0; j < i; j++) {
        if ((arrayOfmjm[j] != null) && (arrayOfmjm[j].a != null) && (arrayOfmjm[j].a.b != null)) {
          for (mjs localmjs : arrayOfmjm[j].a.b) {
            if ((localmjs != null) && (!localHashSet.contains(localmjs.b)))
            {
              String str = hdo.a(localmjs.a);
              localArrayList.add(new bpx(localmjs.b, localmjs.c, str));
              localHashSet.add(localmjs.b);
            }
          }
        }
      }
    }
    return localArrayList;
  }
  
  public static void b(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("seen", Integer.valueOf(1));
    localSQLiteDatabase.update("guns", localContentValues, null, null);
  }
  
  private static void b(Context paramContext, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt1).getWritableDatabase();
    String str1;
    String str2;
    String str3;
    if (paramBoolean)
    {
      str1 = "pending_delete=1 AND ";
      str2 = String.valueOf(str1);
      str3 = String.valueOf(a(paramInt2, paramInt3));
      if (str3.length() == 0) {
        break label74;
      }
    }
    label74:
    for (String str4 = str2.concat(str3);; str4 = new String(str2))
    {
      localSQLiteDatabase.delete("guns", str4, null);
      return;
      str1 = "";
      break;
    }
  }
  
  public static byte[] b(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    Cursor localCursor = bqj.a(paramContext, paramInt1).getReadableDatabase().query("account_status", new String[] { c(paramInt2, paramInt3) }, null, null, null, null, null);
    try
    {
      localCursor.moveToFirst();
      byte[] arrayOfByte = localCursor.getBlob(0);
      return arrayOfByte;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private static long c(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt1).getReadableDatabase();
    try
    {
      String str1 = String.valueOf(b(paramInt2, paramInt3));
      String str2 = String.valueOf("account_status");
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, 14 + String.valueOf(str1).length() + String.valueOf(str2).length() + "SELECT " + str1 + "  FROM " + str2, null);
      return l;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
  
  public static Cursor c(Context paramContext, int paramInt)
  {
    long l1 = h(paramContext, paramInt);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(l1);
    String str1 = String.format(Locale.US, "read_state=0 AND pending_read=0 AND updated_version>%d", arrayOfObject);
    if (dkk.a()) {}
    Cursor localCursor;
    String str2;
    String str3;
    for (String str4 = null;; str4 = 5 + String.valueOf(str2).length() + String.valueOf(str1).length() + String.valueOf(str3).length() + str2 + str1 + " AND " + str3)
    {
      localCursor = bqj.a(paramContext, paramInt).getReadableDatabase().query("guns", bri.a, str4, null, null, null, "creation_time DESC");
      if ((localCursor == null) || (!Log.isLoggable("EsNotificationData", 4))) {
        break label317;
      }
      while (localCursor.moveToNext())
      {
        String str5 = String.valueOf(localCursor.getString(9));
        String str6 = String.valueOf(localCursor.getString(3));
        String str7 = String.valueOf(localCursor.getString(1));
        long l2 = localCursor.getLong(6);
        new StringBuilder(111 + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length()).append("getNotificationsToDisplay: unread notification key: ").append(str5).append(", heading: ").append(str6).append(", description: ").append(str7).append(", timestamp: ").append(l2);
      }
      str2 = String.valueOf("read_state=0 AND seen=0 AND push_enabled!=0 AND ");
      str3 = String.valueOf("(type!=97 AND type!=111 AND type!=18 AND type!=99)");
    }
    localCursor.moveToPosition(-1);
    label317:
    return localCursor;
  }
  
  private static String c(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 4)
    {
      if (paramInt1 == 2) {
        return "next_read_notifications_fetch_param";
      }
      if (paramInt1 == 1) {
        return "next_unread_notifications_fetch_param";
      }
    }
    else if (paramInt2 == 2)
    {
      if (paramInt1 == 2) {
        return "next_read_low_notifications_fetch_param";
      }
      if (paramInt1 == 1) {
        return "next_unread_low_notifications_fetch_param";
      }
    }
    return "";
  }
  
  public static byte[] c(Context paramContext, int paramInt, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    if (paramBoolean) {}
    for (String str = "read_low_notifications_summary";; str = "unread_low_notifications_summary")
    {
      Cursor localCursor = localSQLiteDatabase.query("account_status", new String[] { str }, null, null, null, null, null);
      try
      {
        localCursor.moveToFirst();
        byte[] arrayOfByte = localCursor.getBlob(0);
        return arrayOfByte;
      }
      finally
      {
        localCursor.close();
      }
    }
  }
  
  private static byte[] c(mjp parammjp)
  {
    if (parammjp == null) {
      return null;
    }
    mjp localmjp = new mjp();
    if ((parammjp.a != null) && ((parammjp.a.b != null) || (parammjp.a.a != null)))
    {
      localmjp.a = new mjv();
      localmjp.a.b = parammjp.a.b;
      localmjp.a.a = parammjp.a.a;
    }
    if ((parammjp.b != null) && (parammjp.b.length != 0))
    {
      mjm[] arrayOfmjm = parammjp.b;
      int i = Math.min(arrayOfmjm.length, 5);
      ArrayList localArrayList = new ArrayList(i);
      for (int j = 0; j < arrayOfmjm.length; j++)
      {
        mjm localmjm1 = arrayOfmjm[j];
        if (localmjm1.a != null)
        {
          mjm localmjm2 = new mjm();
          mju localmju = new mju();
          localmju.c = localmjm1.a.c;
          localmju.d = localmjm1.a.d;
          localmjm2.a = localmju;
          localArrayList.add(localmjm2);
          if (localArrayList.size() == i) {
            break;
          }
        }
      }
      localmjp.b = ((mjm[])localArrayList.toArray(new mjm[localArrayList.size()]));
    }
    return qat.a(localmjp);
  }
  
  public static void d(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    Object[] arrayOfObject = { "guns" };
    localSQLiteDatabase.execSQL(String.format(Locale.US, "DELETE FROM %s", arrayOfObject));
  }
  
  public static void e(Context paramContext, int paramInt)
  {
    dmr.a(paramContext, paramInt);
    hcw.e(paramContext, paramInt);
  }
  
  public static long f(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT notification_poll_interval  FROM account_status", null);
      return l;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
  
  public static long g(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT last_notification_sync_version  FROM account_status", null);
      return l;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
  
  private static long h(Context paramContext, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getReadableDatabase();
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT last_viewed_notification_version  FROM account_status", null);
      return l;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     brg
 * JD-Core Version:    0.7.0.1
 */