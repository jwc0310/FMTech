import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class gxy
{
  private static final Runtime a = ;
  private static final mcq b = new mcq("debug.memory.stats");
  
  public static Bundle a(String paramString, int paramInt)
  {
    Bundle localBundle = new Bundle();
    if (!TextUtils.isEmpty(paramString)) {
      localBundle.putInt(paramString, paramInt);
    }
    return localBundle;
  }
  
  public static Bundle a(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2))) {
      localBundle.putString(paramString1, paramString2);
    }
    return localBundle;
  }
  
  private static nij a(Bundle paramBundle)
  {
    if ((!paramBundle.containsKey("extra_gaia_id")) && (!paramBundle.containsKey("extra_participant_ids")) && (!paramBundle.containsKey("extra_circle_ids")) && (!paramBundle.containsKey("extra_square_id")) && (!paramBundle.containsKey("extra_promo_type")) && (!paramBundle.containsKey("extra_promo_group_id")) && (!paramBundle.containsKey("extra_posting_mode"))) {
      return null;
    }
    nij localnij = new nij();
    Object localObject;
    if (paramBundle.containsKey("extra_gaia_id"))
    {
      if (paramBundle != null) {
        break label334;
      }
      localObject = null;
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        localnij.a = new String[] { localObject };
        if (Log.isLoggable("EsAnalyticsData", 3))
        {
          String str10 = String.valueOf(localObject);
          if (str10.length() == 0) {
            break label345;
          }
          "> createClientActionData: target gaiaId: ".concat(str10);
        }
      }
    }
    label142:
    if (paramBundle.containsKey("extra_participant_ids"))
    {
      ArrayList localArrayList2 = paramBundle.getStringArrayList("extra_participant_ids");
      if ((localArrayList2 != null) && (!localArrayList2.isEmpty()))
      {
        ArrayList localArrayList3 = new ArrayList(localArrayList2.size());
        StringBuilder localStringBuilder2 = new StringBuilder();
        Iterator localIterator = localArrayList2.iterator();
        if (localIterator.hasNext())
        {
          String str6 = (String)localIterator.next();
          String str9;
          nio localnio;
          if ((!TextUtils.isEmpty(str6)) && (str6.length() > 2))
          {
            str9 = str6.substring(2);
            localnio = new nio();
          }
          String str7;
          switch (str6.charAt(0))
          {
          default: 
            str7 = String.valueOf(str6);
            if (str7.length() == 0) {
              break;
            }
          }
          for (String str8 = "Invalid personId: ".concat(str7);; str8 = new String("Invalid personId: "))
          {
            throw new IllegalStateException(str8);
            label334:
            localObject = paramBundle.getString("extra_gaia_id");
            break;
            label345:
            new String("> createClientActionData: target gaiaId: ");
            break label142;
            localnio.a = str9;
            while (localnio != null)
            {
              localArrayList3.add(localnio);
              localStringBuilder2.append(str6).append(' ');
              break;
              localnio.b = str9;
              continue;
              localnio = null;
            }
          }
        }
        localnij.c = ((nio[])localArrayList3.toArray(new nio[localArrayList3.size()]));
        if (Log.isLoggable("EsAnalyticsData", 3))
        {
          String str5 = String.valueOf(localStringBuilder2);
          new StringBuilder(40 + String.valueOf(str5).length()).append("> createClientActionData: participants: ").append(str5);
        }
      }
    }
    if (paramBundle.containsKey("extra_circle_ids"))
    {
      ArrayList localArrayList1 = paramBundle.getStringArrayList("extra_circle_ids");
      if ((localArrayList1 != null) && (!localArrayList1.isEmpty()))
      {
        nin[] arrayOfnin = new nin[localArrayList1.size()];
        StringBuilder localStringBuilder1 = new StringBuilder();
        for (int m = 0; m < localArrayList1.size(); m++)
        {
          String str4 = (String)localArrayList1.get(m);
          nin localnin = new nin();
          localnin.a = str4;
          arrayOfnin[m] = localnin;
          localStringBuilder1.append(str4).append(' ');
        }
        localnij.b = arrayOfnin;
        if (Log.isLoggable("EsAnalyticsData", 3))
        {
          String str3 = String.valueOf(localStringBuilder1);
          new StringBuilder(37 + String.valueOf(str3).length()).append("> createClientActionData: circleIds: ").append(str3);
        }
      }
    }
    if (paramBundle.containsKey("extra_square_id"))
    {
      String str1 = paramBundle.getString("extra_square_id");
      if (!TextUtils.isEmpty(str1))
      {
        localnij.e = new njd();
        localnij.e.a = str1;
        if (Log.isLoggable("EsAnalyticsData", 3))
        {
          String str2 = String.valueOf(str1);
          if (str2.length() == 0) {
            break label961;
          }
          "> createClientActionData: target squareId: ".concat(str2);
        }
      }
    }
    for (;;)
    {
      if (paramBundle.containsKey("extra_posting_mode"))
      {
        int k = paramBundle.getInt("extra_posting_mode");
        localnij.f = new njc();
        localnij.f.a = k;
        if (Log.isLoggable("EsAnalyticsData", 3)) {
          new StringBuilder(50).append("> createClientActionData: postingMode: ").append(k);
        }
      }
      if ((paramBundle.containsKey("extra_promo_type")) || (paramBundle.containsKey("extra_promo_group_id")))
      {
        niw localniw = new niw();
        if (paramBundle.containsKey("extra_promo_group_id"))
        {
          localniw.b = paramBundle.getInt("extra_promo_group_id");
          if (Log.isLoggable("EsAnalyticsData", 3))
          {
            int j = localniw.b;
            new StringBuilder(51).append("> createClientActionData: promoGroupId: ").append(j);
          }
        }
        if (paramBundle.containsKey("extra_promo_type"))
        {
          localniw.a = new niy();
          localniw.a.a = paramBundle.getInt("extra_promo_type");
          if (Log.isLoggable("EsAnalyticsData", 3))
          {
            int i = localniw.a.a;
            new StringBuilder(48).append("> createClientActionData: promoType: ").append(i);
          }
        }
        localnij.d = localniw;
      }
      return localnij;
      label961:
      new String("> createClientActionData: target squareId: ");
    }
  }
  
  public static njh a(gxz paramgxz, gya paramgya1, gya paramgya2, long paramLong1, long paramLong2, Bundle paramBundle)
  {
    njh localnjh = new njh();
    localnjh.e = Long.valueOf(paramLong1);
    nmd localnmd = new nmd();
    pge localpge = new pge();
    if ((paramLong1 > 0L) && (paramLong2 >= paramLong1))
    {
      localpge.a = Integer.valueOf((int)(paramLong2 - paramLong1));
      if (paramgxz == null) {
        break label1319;
      }
      localpge.b = paramgxz.ef;
      if ((localpge.b == null) || (!Log.isLoggable("EsAnalyticsData", 3))) {
        break label1319;
      }
      String str22 = String.valueOf("Action name: ");
      String str23 = String.valueOf(paramgxz);
      String str24 = String.valueOf(localpge.b.a);
      String str25 = String.valueOf(localpge.b.b);
      new StringBuilder(22 + String.valueOf(str22).length() + String.valueOf(str23).length() + String.valueOf(str24).length() + String.valueOf(str25).length()).append(str22).append(str23).append(" namespace: ").append(str24).append(" typeNum: ").append(str25);
    }
    label515:
    label773:
    label802:
    label1319:
    for (String str1 = paramgxz.name();; str1 = null)
    {
      if (paramgya1 != null)
      {
        nlz localnlz2 = paramgya1.ax;
        if (localnlz2 != null) {
          localnmd.c = localnlz2;
        }
        localpge.c = paramgya1.aw;
        label247:
        if ((localpge.c == null) || (!Log.isLoggable("EsAnalyticsData", 3))) {
          break label1313;
        }
        String str18 = String.valueOf("StartView name: ");
        String str19 = String.valueOf(paramgya1);
        String str20 = String.valueOf(localpge.c.a);
        String str21 = String.valueOf(localpge.c.b);
        new StringBuilder(22 + String.valueOf(str18).length() + String.valueOf(str19).length() + String.valueOf(str20).length() + String.valueOf(str21).length()).append(str18).append(str19).append(" namespace: ").append(str20).append(" typeNum: ").append(str21);
      }
      for (String str2 = paramgya1.name();; str2 = null)
      {
        nlz localnlz1;
        Object localObject2;
        label492:
        Object localObject3;
        if (paramgya2 != null)
        {
          localnlz1 = paramgya2.ax;
          if (localnlz1 != null) {
            localnmd.d = localnlz1;
          }
          localpge.d = paramgya2.aw;
          if ((localpge.d != null) && (Log.isLoggable("EsAnalyticsData", 3)))
          {
            String str12 = String.valueOf("EndView name: ");
            String str13 = String.valueOf(paramgya2);
            String str14 = String.valueOf(localpge.d.a);
            String str15 = String.valueOf(localpge.d.b);
            if ((localnlz1 == null) || (localnlz1.b == null))
            {
              localObject2 = null;
              String str16 = String.valueOf(localObject2);
              if ((localnlz1 != null) && (localnlz1.a != null)) {
                break label1147;
              }
              localObject3 = null;
              String str17 = String.valueOf(localObject3);
              new StringBuilder(41 + String.valueOf(str12).length() + String.valueOf(str13).length() + String.valueOf(str14).length() + String.valueOf(str15).length() + String.valueOf(str16).length() + String.valueOf(str17).length()).append(str12).append(str13).append(" namespace: ").append(str14).append(" typeNum: ").append(str15).append(" filterType: ").append(str16).append(" tab: ").append(str17);
            }
          }
        }
        for (String str3 = paramgya2.name();; str3 = null)
        {
          Bundle localBundle2;
          String str8;
          label680:
          String str9;
          label688:
          label741:
          Bundle localBundle1;
          Object localObject1;
          if (paramBundle != null)
          {
            if (paramBundle.containsKey("extra_start_view_extras"))
            {
              localBundle2 = paramBundle.getBundle("extra_start_view_extras");
              if (localBundle2 != null) {
                break label1157;
              }
              str8 = null;
              if (localBundle2 != null) {
                break label1169;
              }
              str9 = null;
              localnjh.c = b(str8, str9);
              if (Log.isLoggable("EsAnalyticsData", 3))
              {
                if (!TextUtils.isEmpty(str8))
                {
                  String str11 = String.valueOf(str8);
                  if (str11.length() == 0) {
                    break label1182;
                  }
                  "createClientOzEvent: start view target gaiaId: ".concat(str11);
                }
                if (!TextUtils.isEmpty(str9))
                {
                  String str10 = String.valueOf(str9);
                  if (str10.length() == 0) {
                    break label1196;
                  }
                  "createClientOzEvent: start view streamFilterCircleId: ".concat(str10);
                }
              }
            }
            if (paramBundle.containsKey("extra_end_view_extras"))
            {
              localBundle1 = paramBundle.getBundle("extra_end_view_extras");
              if (localBundle1 != null) {
                break label1210;
              }
              localObject1 = null;
              if (!TextUtils.isEmpty((CharSequence)localObject1))
              {
                localnjh.d = b((String)localObject1, null);
                if (Log.isLoggable("EsAnalyticsData", 3))
                {
                  String str7 = String.valueOf(localObject1);
                  if (str7.length() == 0) {
                    break label1222;
                  }
                  "createClientOzEvent: end view target gaiaId: ".concat(str7);
                }
              }
            }
            label854:
            if (paramBundle.containsKey("extra_platform_event"))
            {
              localnmd.e = Boolean.valueOf(paramBundle.getBoolean("extra_platform_event", false));
              if (Log.isLoggable("EsAnalyticsData", 3))
              {
                String str6 = String.valueOf(localnmd.e);
                new StringBuilder(33 + String.valueOf(str6).length()).append("createClientOzEvent: isPlatform: ").append(str6);
              }
            }
            if (paramBundle.containsKey("extra_error_code"))
            {
              String str4 = paramBundle.getString("extra_error_code");
              localpge.e = new String[] { str4 };
              if (Log.isLoggable("EsAnalyticsData", 3))
              {
                String str5 = String.valueOf(str4);
                if (str5.length() == 0) {
                  break label1236;
                }
                "createClientOzEvent: errorCode: ".concat(str5);
              }
            }
            label999:
            localnjh.b = a(paramBundle);
            localnmd.b = b(paramBundle);
          }
          else if (Log.isLoggable("EsAnalyticsData", 3))
          {
            if (str1 != null) {
              break label1250;
            }
            String.format("EVENT SUMMARY: %s -> %s", new Object[] { str2, str3 });
          }
          for (;;)
          {
            localnmd.a = localpge;
            if (paramBundle.getParcelable("device_info") != null) {
              localnmd.f = ((nma)((hqw)paramBundle.getParcelable("device_info")).a(new nma()));
            }
            localnjh.a = localnmd;
            return localnjh;
            localpge.a = Integer.valueOf(0);
            break;
            localpge.c = gya.J.aw;
            break label247;
            localObject2 = localnlz1.b;
            break label492;
            label1147:
            localObject3 = localnlz1.a;
            break label515;
            str8 = localBundle2.getString("extra_gaia_id");
            break label680;
            str9 = localBundle2.getString("extra_circle_id");
            break label688;
            new String("createClientOzEvent: start view target gaiaId: ");
            break label741;
            label1196:
            new String("createClientOzEvent: start view streamFilterCircleId: ");
            break label773;
            label1210:
            localObject1 = localBundle1.getString("extra_gaia_id");
            break label802;
            label1222:
            new String("createClientOzEvent: end view target gaiaId: ");
            break label854;
            label1236:
            new String("createClientOzEvent: errorCode: ");
            break label999;
            label1250:
            if (str3 == null) {
              String.format("EVENT SUMMARY: %s in %s", new Object[] { str1, str2 });
            } else {
              String.format("EVENT SUMMARY: %s in %s (unexpected endView: %s)", new Object[] { str1, str2, paramgya2 });
            }
          }
        }
      }
    }
  }
  
  public static nji a(Context paramContext)
  {
    nji localnji = new nji();
    localnji.b = Long.valueOf(System.currentTimeMillis());
    if (efj.b(efj.K(paramContext))) {}
    for (int i = 10;; i = 4)
    {
      localnji.e = i;
      if (Log.isLoggable("EsAnalyticsData", 3)) {
        new StringBuilder(32).append("Set the client id to ").append(i);
      }
      try
      {
        PackageManager localPackageManager = paramContext.getPackageManager();
        String str = paramContext.getPackageName();
        localnji.d = str;
        localnji.c = localPackageManager.getPackageInfo(str, 0).versionName;
        return localnji;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localNameNotFoundException.printStackTrace();
      }
    }
    return localnji;
  }
  
  public static nmw a(int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2)
  {
    int i = 1;
    nmw localnmw = new nmw();
    localnmw.a = Integer.valueOf(paramInt1);
    localnmw.b = paramInt2;
    int j;
    if (paramBoolean1)
    {
      j = i;
      localnmw.c = j;
      localnmw.d = paramInt3;
      if (!paramBoolean2) {
        break label69;
      }
    }
    for (;;)
    {
      localnmw.e = i;
      return localnmw;
      j = 2;
      break;
      label69:
      i = 2;
    }
  }
  
  public static void a(Context paramContext, int paramInt, long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("last_analytics_sync_time", Long.valueOf(paramLong));
    localSQLiteDatabase.update("account_status", localContentValues, null, null);
  }
  
  private static nie b(Bundle paramBundle)
  {
    if ((!paramBundle.containsKey("extra_activity_id")) && (!paramBundle.containsKey("extra_comment_id")) && (!paramBundle.containsKey("extra_notification_read")) && (!paramBundle.containsKey("extra_notification_types")) && (!paramBundle.containsKey("extra_coalescing_codes")) && (!paramBundle.containsKey("extra_prev_num_unread_notifi")) && (!paramBundle.containsKey("extra_num_unread_notifi")) && (!paramBundle.containsKey("extra_media_url")) && (!paramBundle.containsKey("extra_has_emotishare")) && (!paramBundle.containsKey("extra_external_url")) && (!paramBundle.containsKey("extra_prev_num_unread_noti")) && (!paramBundle.containsKey("extra_creation_source_id")) && (!paramBundle.containsKey("extra_search_query")) && (!paramBundle.containsKey("extra_notification_volume_change")) && (!paramBundle.containsKey("extra_notification_id")) && (!paramBundle.containsKey("extra_num_users_on_map")) && (!paramBundle.containsKey("extra_circle_mutate_location_id")) && (!paramBundle.containsKey("extra_people_notification_count")) && (!paramBundle.containsKey("extra_people_notification_acceptance_per_session")) && (!paramBundle.containsKey("extra_people_notification_dismiss_per_session")) && (!paramBundle.containsKey("extra_user_settings_state")) && (!paramBundle.containsKey("extra_photo_count")) && (!paramBundle.containsKey("extra_video_count")) && (!paramBundle.containsKey("extra_total_bytes")) && (!paramBundle.containsKey("extra_thumbnail_count")) && (!paramBundle.containsKey("extra_highlight_item_count")) && (!paramBundle.containsKey("extra_highlight_page_count")) && (!paramBundle.containsKey("extra_max_highlight_item_count")) && (!paramBundle.containsKey("extra_max_highlight_page_count")) && (!paramBundle.containsKey("story_id")) && (!paramBundle.containsKey("story_num_moments")) && (!paramBundle.containsKey("story_fraction_complete")) && (!paramBundle.containsKey("story_viewer_relationship")) && (!paramBundle.containsKey("story_status")) && (!paramBundle.containsKey("story_moment_type")) && (!paramBundle.containsKey("story_enrichment_type"))) {
      return null;
    }
    nie localnie = new nie();
    if (paramBundle.containsKey("extra_notification_id"))
    {
      String str20 = paramBundle.getString("extra_notification_id");
      if (!TextUtils.isEmpty(str20))
      {
        localnie.k = str20;
        if (Log.isLoggable("EsAnalyticsData", 3))
        {
          String str21 = String.valueOf(str20);
          if (str21.length() == 0) {
            break label1597;
          }
          "> createActionTarget: notificationId: ".concat(str21);
        }
      }
    }
    for (;;)
    {
      if (paramBundle.containsKey("extra_search_query"))
      {
        String str15 = paramBundle.getString("extra_search_query");
        if (!TextUtils.isEmpty(str15))
        {
          njt localnjt = new njt();
          localnjt.a = str15;
          String str16 = paramBundle.getString("extra_search_selected_text");
          if (TextUtils.isEmpty(str16)) {
            str16 = str15;
          }
          localnjt.c = str16;
          if (paramBundle.containsKey("extra_search_selected_index"))
          {
            localnjt.e = Integer.valueOf(paramBundle.getInt("extra_search_selected_index"));
            if (Log.isLoggable("EsAnalyticsData", 3))
            {
              String str19 = String.valueOf(localnjt.e);
              new StringBuilder(57 + String.valueOf(str19).length()).append("> createActionTarget.autoComplete.absolutePositionIndex: ").append(str19);
            }
          }
          if (paramBundle.containsKey("extra_search_type"))
          {
            localnjt.b = paramBundle.getInt("extra_search_type");
            if (Log.isLoggable("EsAnalyticsData", 3))
            {
              int i10 = localnjt.b;
              new StringBuilder(51).append("> createActionTarget.autoComplete.type: ").append(i10);
            }
          }
          if (paramBundle.containsKey("extra_search_personalization_type"))
          {
            localnjt.d = paramBundle.getInt("extra_search_personalization_type");
            if (Log.isLoggable("EsAnalyticsData", 3))
            {
              int i9 = localnjt.d;
              new StringBuilder(66).append("> createActionTarget.autoComplete.personalizationType: ").append(i9);
            }
          }
          if (Log.isLoggable("EsAnalyticsData", 3))
          {
            String str17 = String.valueOf(str15);
            if (str17.length() == 0) {
              break label1611;
            }
            "> createActionTarget.autoComplete.query: ".concat(str17);
            label732:
            String str18 = String.valueOf(str15);
            if (str18.length() == 0) {
              break label1625;
            }
            "> createActionTarget.autoComplete.acceptedQuery: ".concat(str18);
            label756:
            int i8 = localnjt.d;
            new StringBuilder(66).append("> createActionTarget.autoComplete.personalizationType: ").append(i8);
          }
          localnie.g = localnjt;
        }
      }
      if (paramBundle.containsKey("extra_activity_id"))
      {
        String str13 = paramBundle.getString("extra_activity_id");
        if (!TextUtils.isEmpty(str13))
        {
          localnie.a = str13;
          if (Log.isLoggable("EsAnalyticsData", 3))
          {
            String str14 = String.valueOf(str13);
            if (str14.length() == 0) {
              break label1639;
            }
            "> createActionTarget: activityId: ".concat(str14);
          }
        }
      }
      label856:
      if (paramBundle.containsKey("extra_comment_id"))
      {
        String str11 = paramBundle.getString("extra_comment_id");
        if (!TextUtils.isEmpty(str11))
        {
          localnie.c = str11;
          if (Log.isLoggable("EsAnalyticsData", 3))
          {
            String str12 = String.valueOf(str11);
            if (str12.length() == 0) {
              break label1653;
            }
            "> createActionTarget: commentId: ".concat(str12);
          }
        }
      }
      label922:
      boolean bool2;
      label950:
      boolean bool3;
      if (paramBundle.containsKey("extra_notification_read"))
      {
        boolean bool1 = paramBundle.getBoolean("extra_notification_read", false);
        if (bool1) {
          break label1667;
        }
        bool2 = true;
        localnie.j = Boolean.valueOf(bool2);
        if (Log.isLoggable("EsAnalyticsData", 3))
        {
          if (bool1) {
            break label1673;
          }
          bool3 = true;
          new StringBuilder(49).append("> createActionTarget: isUnreadNotification: ").append(bool3);
        }
      }
      byte[] arrayOfByte2;
      if (paramBundle.containsKey("extra_notification_volume_change"))
      {
        arrayOfByte2 = paramBundle.getByteArray("extra_notification_volume_change");
        if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0)) {}
      }
      try
      {
        nmw localnmw = (nmw)qat.b(new nmw(), arrayOfByte2, 0, arrayOfByte2.length);
        localnie.i = localnmw;
        if (Log.isLoggable("EsAnalyticsData", 3))
        {
          String str9 = String.valueOf("> createActionTarget.volumeChange keyType: ");
          String str10 = String.valueOf(localnmw.a);
          int i4 = localnmw.b;
          int i5 = localnmw.c;
          int i6 = localnmw.d;
          int i7 = localnmw.e;
          new StringBuilder(126 + String.valueOf(str9).length() + String.valueOf(str10).length()).append(str9).append(str10).append(" prevVolume: ").append(i4).append(" previousNotificationSetting: ").append(i5).append(" nextVolume: ").append(i6).append(" nextNotificationSetting: ").append(i7);
        }
        if (paramBundle.containsKey("extra_num_unread_notifi"))
        {
          int i3 = paramBundle.getInt("extra_num_unread_notifi");
          localnie.e = Integer.valueOf(i3);
          if (Log.isLoggable("EsAnalyticsData", 3)) {
            new StringBuilder(57).append("> createActionTarget: numUnreadNotifications: ").append(i3);
          }
        }
        if (paramBundle.containsKey("extra_prev_num_unread_notifi"))
        {
          int i2 = paramBundle.getInt("extra_prev_num_unread_notifi");
          localnie.f = Integer.valueOf(i2);
          if (Log.isLoggable("EsAnalyticsData", 3)) {
            new StringBuilder(65).append("> createActionTarget: previousNumUnreadNotifications: ").append(i2);
          }
        }
        if (paramBundle.containsKey("extra_prev_num_unread_noti"))
        {
          int i1 = paramBundle.getInt("extra_prev_num_unread_noti");
          localnie.f = Integer.valueOf(i1);
          if (Log.isLoggable("EsAnalyticsData", 3)) {
            new StringBuilder(65).append("> createActionTarget: previousNumUnreadNotifications: ").append(i1);
          }
        }
        if ((paramBundle.containsKey("extra_notification_types")) && (paramBundle.containsKey("extra_coalescing_codes")))
        {
          localStringBuilder2 = new StringBuilder();
          ArrayList localArrayList1 = paramBundle.getIntegerArrayList("extra_notification_types");
          ArrayList localArrayList2 = paramBundle.getStringArrayList("extra_coalescing_codes");
          if ((localArrayList1 != null) && (localArrayList2 != null) && (!localArrayList1.isEmpty()) && (localArrayList1.size() == localArrayList2.size()))
          {
            arrayOfnlx = new nlx[localArrayList1.size()];
            int m = 0;
            for (;;)
            {
              if (m < localArrayList1.size())
              {
                nlx localnlx = new nlx();
                localInteger = (Integer)localArrayList1.get(m);
                int[] arrayOfInt = new int[1];
                if (localInteger == null)
                {
                  n = 0;
                  arrayOfInt[0] = n;
                  localnlx.a = arrayOfInt;
                  String str7 = (String)localArrayList2.get(m);
                  if (!TextUtils.isEmpty(str7)) {
                    localnlx.b = str7;
                  }
                  if (Log.isLoggable("EsAnalyticsData", 3)) {
                    localStringBuilder2.append('(').append(Arrays.toString(localnlx.a)).append(':').append(str7).append(") ");
                  }
                  arrayOfnlx[m] = localnlx;
                  m++;
                  continue;
                  label1597:
                  new String("> createActionTarget: notificationId: ");
                  break;
                  label1611:
                  new String("> createActionTarget.autoComplete.query: ");
                  break label732;
                  label1625:
                  new String("> createActionTarget.autoComplete.acceptedQuery: ");
                  break label756;
                  label1639:
                  new String("> createActionTarget: activityId: ");
                  break label856;
                  label1653:
                  new String("> createActionTarget: commentId: ");
                  break label922;
                  label1667:
                  bool2 = false;
                  break label950;
                  label1673:
                  bool3 = false;
                }
              }
            }
          }
        }
      }
      catch (qas localqas2)
      {
        StringBuilder localStringBuilder2;
        nlx[] arrayOfnlx;
        for (;;)
        {
          Integer localInteger;
          Log.e("EsAnalyticsData", "Unable to deserialize volume change", localqas2);
          continue;
          int n = localInteger.intValue();
        }
        if (Log.isLoggable("EsAnalyticsData", 3))
        {
          String str8 = String.valueOf(localStringBuilder2);
          new StringBuilder(41 + String.valueOf(str8).length()).append("> createActionTarget: notificationTypes: ").append(str8);
        }
        localnie.d = arrayOfnlx;
        if (paramBundle.containsKey("extra_external_url"))
        {
          localnie.b = paramBundle.getString("extra_external_url");
          if (Log.isLoggable("EsAnalyticsData", 3))
          {
            String str6 = String.valueOf(localnie.b);
            if (str6.length() == 0) {
              break label2241;
            }
            "> createActionTarget: externalUrl: ".concat(str6);
          }
        }
        if ((paramBundle.containsKey("extra_has_emotishare")) || (paramBundle.containsKey("extra_media_url")) || (paramBundle.containsKey("extra_creation_source_id")) || (paramBundle.containsKey("extra_stream_explanation"))) {
          localnie.h = new nif();
        }
        if (paramBundle.containsKey("extra_has_emotishare"))
        {
          localnie.h.d = Integer.valueOf(334);
          if (Log.isLoggable("EsAnalyticsData", 3))
          {
            String str5 = String.valueOf(localnie.h.d);
            new StringBuilder(36 + String.valueOf(str5).length()).append("> createActivityDetails: embedType: ").append(str5);
          }
        }
        if (paramBundle.containsKey("extra_media_url"))
        {
          localnie.h.a = paramBundle.getString("extra_media_url");
          if (Log.isLoggable("EsAnalyticsData", 3))
          {
            String str4 = String.valueOf(localnie.h.a);
            if (str4.length() == 0) {
              break label2255;
            }
            "> createActivityDetails: mediaUrl: ".concat(str4);
          }
        }
        label2000:
        if (paramBundle.containsKey("extra_creation_source_id"))
        {
          localnie.h.c = paramBundle.getString("extra_creation_source_id");
          if (Log.isLoggable("EsAnalyticsData", 3))
          {
            String str3 = String.valueOf(localnie.h.c);
            if (str3.length() == 0) {
              break label2269;
            }
            "> createActivityDetails: sourceStreamId: ".concat(str3);
          }
        }
        StringBuilder localStringBuilder1;
        for (;;)
        {
          if (paramBundle.containsKey("extra_stream_explanation"))
          {
            int j = paramBundle.getInt("extra_stream_explanation");
            if (j != 0)
            {
              localnie.h.b = j;
              if (Log.isLoggable("EsAnalyticsData", 3))
              {
                int k = localnie.h.b;
                new StringBuilder(53).append("> createActivityDetails: explanationType: ").append(k);
              }
            }
          }
          if (!paramBundle.containsKey("extra_notification_id_list")) {
            break label2292;
          }
          localnie.l = ((String[])paramBundle.getStringArrayList("extra_notification_id_list").toArray(qay.f));
          if (!Log.isLoggable("EsAnalyticsData", 3)) {
            break label2292;
          }
          localStringBuilder1 = new StringBuilder(" > createActionTarget: notificationIdList: [\n");
          Iterator localIterator = paramBundle.getStringArrayList("extra_notification_id_list").iterator();
          while (localIterator.hasNext())
          {
            String str2 = (String)localIterator.next();
            localStringBuilder1.append("    ").append(str2).append('\n');
          }
          label2241:
          new String("> createActionTarget: externalUrl: ");
          break;
          label2255:
          new String("> createActivityDetails: mediaUrl: ");
          break label2000;
          label2269:
          new String("> createActivityDetails: sourceStreamId: ");
        }
        localStringBuilder1.append("  ]\n");
        label2292:
        if (paramBundle.containsKey("extra_num_users_on_map"))
        {
          njs localnjs = new njs();
          localnjs.a = Integer.valueOf(paramBundle.getInt("extra_num_users_on_map"));
          localnie.m = localnjs;
        }
        if (paramBundle.containsKey("extra_circle_mutate_location_id"))
        {
          nih localnih = new nih();
          localnih.a = 119;
          localnih.b = paramBundle.getInt("extra_circle_mutate_location_id");
          if (Log.isLoggable("EsAnalyticsData", 3))
          {
            int i = localnih.b;
            new StringBuilder(35).append("Circle Mutate Location: ").append(i);
          }
          localnie.n = localnih;
        }
        if (!paramBundle.containsKey("extra_user_settings_state")) {}
      }
    }
    try
    {
      nmv localnmv = new nmv();
      byte[] arrayOfByte1 = paramBundle.getByteArray("extra_user_settings_state");
      localnie.o = ((nmv)qat.b(localnmv, arrayOfByte1, 0, arrayOfByte1.length));
      if (Log.isLoggable("EsAnalyticsData", 3))
      {
        String str1 = String.valueOf(localnie.o);
        new StringBuilder(15 + String.valueOf(str1).length()).append("user_settings: ").append(str1);
      }
      label2499:
      if (paramBundle.containsKey("extra_people_notification_count")) {
        localnie.q = Integer.valueOf(paramBundle.getInt("extra_people_notification_count"));
      }
      if (paramBundle.containsKey("extra_people_notification_acceptance_per_session")) {
        localnie.s = Integer.valueOf(paramBundle.getInt("extra_people_notification_acceptance_per_session"));
      }
      if (paramBundle.containsKey("extra_people_notification_dismiss_per_session")) {
        localnie.t = Integer.valueOf(paramBundle.getInt("extra_people_notification_dismiss_per_session"));
      }
      if ((paramBundle.containsKey("extra_photo_count")) || (paramBundle.containsKey("extra_video_count")) || (paramBundle.containsKey("extra_total_bytes")) || (paramBundle.containsKey("extra_thumbnail_count")) || (paramBundle.containsKey("extra_highlight_item_count")) || (paramBundle.containsKey("extra_highlight_page_count")) || (paramBundle.containsKey("extra_max_highlight_item_count")) || (paramBundle.containsKey("extra_max_highlight_page_count")) || (paramBundle.containsKey("extra_all_photos_item_count")) || (paramBundle.containsKey("extra_all_photos_page_count")) || (paramBundle.containsKey("extra_max_all_photos_item_count")))
      {
        localnie.r = new nme();
        if (paramBundle.containsKey("extra_photo_count")) {
          localnie.r.a = Integer.valueOf(paramBundle.getInt("extra_photo_count"));
        }
        if (paramBundle.containsKey("extra_video_count")) {
          localnie.r.b = Integer.valueOf(paramBundle.getInt("extra_video_count"));
        }
        if (paramBundle.containsKey("extra_total_bytes")) {
          localnie.r.c = Long.valueOf(paramBundle.getLong("extra_total_bytes"));
        }
        if (paramBundle.containsKey("extra_thumbnail_count")) {
          localnie.r.d = Integer.valueOf(paramBundle.getInt("extra_thumbnail_count"));
        }
        if (paramBundle.containsKey("extra_highlight_item_count")) {
          localnie.r.f = Integer.valueOf(paramBundle.getInt("extra_highlight_item_count"));
        }
        if (paramBundle.containsKey("extra_highlight_page_count")) {
          localnie.r.h = Integer.valueOf(paramBundle.getInt("extra_highlight_page_count"));
        }
        if (paramBundle.containsKey("extra_max_highlight_item_count")) {
          localnie.r.e = Integer.valueOf(paramBundle.getInt("extra_max_highlight_item_count"));
        }
        if (paramBundle.containsKey("extra_max_highlight_page_count")) {
          localnie.r.g = Integer.valueOf(paramBundle.getInt("extra_max_highlight_page_count"));
        }
        if (paramBundle.containsKey("extra_all_photos_item_count")) {
          localnie.r.j = Integer.valueOf(paramBundle.getInt("extra_all_photos_item_count"));
        }
        if (paramBundle.containsKey("extra_all_photos_page_count")) {
          localnie.r.k = Integer.valueOf(paramBundle.getInt("extra_all_photos_page_count"));
        }
        if (paramBundle.containsKey("extra_max_all_photos_item_count")) {
          localnie.r.i = Integer.valueOf(paramBundle.getInt("extra_max_all_photos_item_count"));
        }
      }
      if ((paramBundle.containsKey("story_id")) || (paramBundle.containsKey("story_num_moments")) || (paramBundle.containsKey("story_fraction_complete")) || (paramBundle.containsKey("story_viewer_relationship")) || (paramBundle.containsKey("story_status")) || (paramBundle.containsKey("story_moment_type")) || (paramBundle.containsKey("story_enrichment_type")))
      {
        localnie.p = new nlh();
        if (paramBundle.containsKey("story_id")) {
          localnie.p.a = paramBundle.getString("story_id");
        }
        if (paramBundle.containsKey("story_num_moments")) {
          localnie.p.b = Integer.valueOf(paramBundle.getInt("story_num_moments"));
        }
        if (paramBundle.containsKey("story_fraction_complete")) {
          localnie.p.c = Double.valueOf(paramBundle.getDouble("story_fraction_complete"));
        }
        if (paramBundle.containsKey("story_viewer_relationship")) {
          localnie.p.d = paramBundle.getInt("story_viewer_relationship");
        }
        if (paramBundle.containsKey("story_status")) {
          localnie.p.e = paramBundle.getInt("story_status");
        }
        if (paramBundle.containsKey("story_moment_type")) {
          localnie.p.f = Integer.valueOf(paramBundle.getInt("story_moment_type"));
        }
        if (paramBundle.containsKey("story_enrichment_type")) {
          localnie.p.f = Integer.valueOf(paramBundle.getInt("story_enrichment_type"));
        }
      }
      return localnie;
    }
    catch (qas localqas1)
    {
      break label2499;
    }
  }
  
  private static njg b(String paramString1, String paramString2)
  {
    njg localnjg = new njg();
    if (!TextUtils.isEmpty(paramString1))
    {
      njj localnjj = new njj();
      localnjj.a = paramString1;
      localnjg.a = new njj[] { localnjj };
    }
    if (!TextUtils.isEmpty(paramString2))
    {
      nin localnin = new nin();
      localnin.a = paramString2;
      localnjg.b = localnin;
    }
    return localnjg;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gxy
 * JD-Core Version:    0.7.0.1
 */