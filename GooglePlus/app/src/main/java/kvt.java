import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.RemoteViews;
import com.google.android.libraries.social.socialcast.impl.CastService;
import com.google.android.libraries.social.socialcast.impl.StreamCastActivity;

public final class kvt
  implements kvw
{
  private final Context a;
  private final kwa b;
  private dk c;
  
  public kvt(Context paramContext, kwa paramkwa)
  {
    this.a = paramContext;
    this.b = paramkwa;
    a(this.b.a.q);
  }
  
  private final void a(RemoteViews paramRemoteViews)
  {
    int i;
    if ((this.b.a.x != null) && (this.b.a.x.j() != null))
    {
      i = 1;
      paramRemoteViews.setImageViewBitmap(eyg.bC, this.b.a.x.j());
    }
    for (;;)
    {
      int j = eyg.bC;
      int k = 0;
      if (i != 0) {}
      for (;;)
      {
        paramRemoteViews.setViewVisibility(j, k);
        return;
        k = 4;
      }
      i = 0;
    }
  }
  
  private final void a(RemoteViews paramRemoteViews, int paramInt, String paramString)
  {
    paramRemoteViews.setOnClickPendingIntent(paramInt, PendingIntent.getService(this.a, 0, new Intent(paramString), 134217728));
  }
  
  @TargetApi(16)
  private final void a(boolean paramBoolean)
  {
    int i = 8;
    if (Log.isLoggable("CastNotification", 4)) {
      new StringBuilder(43).append("Showing cast notification, connected: ").append(paramBoolean);
    }
    dk localdk = d();
    RemoteViews localRemoteViews1 = new RemoteViews(this.a.getPackageName(), efj.VO);
    int j = eyg.bB;
    String str1;
    int m;
    label124:
    int i1;
    label158:
    int i2;
    label178:
    label194:
    int i22;
    label215:
    int i26;
    label243:
    Notification localNotification;
    RemoteViews localRemoteViews2;
    String str2;
    label375:
    int i5;
    label396:
    int i7;
    label435:
    label451:
    int i8;
    label512:
    int i16;
    label540:
    int i18;
    label572:
    int i19;
    if (paramBoolean)
    {
      Context localContext2 = this.a;
      int i27 = dl.n;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.b.n();
      str1 = localContext2.getString(i27, arrayOfObject2);
      localRemoteViews1.setTextViewText(j, str1);
      int k = eyg.bm;
      if (!paramBoolean) {
        break label698;
      }
      m = i;
      localRemoteViews1.setViewVisibility(k, m);
      int n = eyg.bs;
      if ((!paramBoolean) || (!this.b.a.s)) {
        break label704;
      }
      i1 = 0;
      localRemoteViews1.setViewVisibility(n, i1);
      if (Build.VERSION.SDK_INT < 21) {
        break label710;
      }
      i2 = 1;
      if (i2 == 0) {
        break label716;
      }
      localRemoteViews1.setImageViewResource(eyg.bA, efj.VA);
      if (paramBoolean)
      {
        a(localRemoteViews1);
        if (Build.VERSION.SDK_INT < 21) {
          break label730;
        }
        i22 = 1;
        if (i22 == 0) {
          break label744;
        }
        int i25 = eyg.bs;
        if (!this.b.a.s) {
          break label736;
        }
        i26 = efj.VH;
        localRemoteViews1.setImageViewResource(i25, i26);
      }
      a(localRemoteViews1, eyg.bu, "com.google.android.libraries.social.socialcast.action.toggle_playpause");
      a(localRemoteViews1, eyg.bs, "com.google.android.libraries.social.socialcast.action.next");
      a(localRemoteViews1, eyg.bA, "com.google.android.libraries.social.socialcast.action.stop");
      localdk.x.contentView = localRemoteViews1;
      localNotification = localdk.b();
      if (Build.VERSION.SDK_INT >= 16)
      {
        localRemoteViews2 = new RemoteViews(this.a.getPackageName(), efj.VN);
        int i3 = eyg.bB;
        if (!paramBoolean) {
          break label787;
        }
        Context localContext1 = this.a;
        int i21 = dl.n;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = this.b.n();
        str2 = localContext1.getString(i21, arrayOfObject1);
        localRemoteViews2.setTextViewText(i3, str2);
        int i4 = eyg.bm;
        if (!paramBoolean) {
          break label802;
        }
        i5 = i;
        localRemoteViews2.setViewVisibility(i4, i5);
        int i6 = eyg.bv;
        if (paramBoolean) {
          i = 0;
        }
        localRemoteViews2.setViewVisibility(i6, i);
        if (Build.VERSION.SDK_INT < 21) {
          break label808;
        }
        i7 = 1;
        if (i7 == 0) {
          break label814;
        }
        localRemoteViews2.setImageViewResource(eyg.bA, efj.VA);
        if (paramBoolean)
        {
          a(localRemoteViews2);
          localRemoteViews2.setBoolean(eyg.bz, "setEnabled", this.b.a.t);
          localRemoteViews2.setBoolean(eyg.bs, "setEnabled", this.b.a.s);
          if (Build.VERSION.SDK_INT < 21) {
            break label828;
          }
          i8 = 1;
          if (i8 == 0) {
            break label858;
          }
          int i15 = eyg.bu;
          if (!this.b.a.r) {
            break label834;
          }
          i16 = efj.VC;
          localRemoteViews2.setImageViewResource(i15, i16);
          int i17 = eyg.bz;
          if (!this.b.a.t) {
            break label842;
          }
          i18 = efj.VL;
          localRemoteViews2.setImageViewResource(i17, i18);
          i19 = eyg.bs;
          if (!this.b.a.s) {
            break label850;
          }
        }
      }
    }
    label698:
    label704:
    label710:
    label716:
    label850:
    for (int i20 = efj.VH;; i20 = efj.VG)
    {
      localRemoteViews2.setImageViewResource(i19, i20);
      a(localRemoteViews2, eyg.bz, "com.google.android.libraries.social.socialcast.action.prev");
      a(localRemoteViews2, eyg.bu, "com.google.android.libraries.social.socialcast.action.toggle_playpause");
      a(localRemoteViews2, eyg.bs, "com.google.android.libraries.social.socialcast.action.next");
      a(localRemoteViews2, eyg.bA, "com.google.android.libraries.social.socialcast.action.stop");
      localNotification.bigContentView = localRemoteViews2;
      ((NotificationManager)this.a.getSystemService("notification")).notify(0, localNotification);
      return;
      str1 = this.a.getString(dl.s);
      break;
      m = 0;
      break label124;
      i1 = i;
      break label158;
      i2 = 0;
      break label178;
      localRemoteViews1.setImageViewResource(eyg.bA, efj.VB);
      break label194;
      label730:
      i22 = 0;
      break label215;
      label736:
      i26 = efj.VG;
      break label243;
      label744:
      int i23 = eyg.bs;
      if (this.b.a.s) {}
      for (int i24 = efj.VI;; i24 = efj.VJ)
      {
        localRemoteViews1.setImageViewResource(i23, i24);
        break;
      }
      str2 = this.a.getString(dl.s);
      break label375;
      i5 = 0;
      break label396;
      i7 = 0;
      break label435;
      localRemoteViews2.setImageViewResource(eyg.bA, efj.VB);
      break label451;
      i8 = 0;
      break label512;
      i16 = efj.VE;
      break label540;
      i18 = efj.VK;
      break label572;
    }
    label787:
    label802:
    label808:
    label814:
    label828:
    label834:
    label842:
    label858:
    int i9 = eyg.bu;
    int i10;
    label881:
    int i12;
    label913:
    int i13;
    if (this.b.a.r)
    {
      i10 = efj.VD;
      localRemoteViews2.setImageViewResource(i9, i10);
      int i11 = eyg.bz;
      if (!this.b.a.t) {
        break label965;
      }
      i12 = efj.VM;
      localRemoteViews2.setImageViewResource(i11, i12);
      i13 = eyg.bs;
      if (!this.b.a.s) {
        break label973;
      }
    }
    label965:
    label973:
    for (int i14 = efj.VI;; i14 = efj.VJ)
    {
      localRemoteViews2.setImageViewResource(i13, i14);
      break;
      i10 = efj.VF;
      break label881;
      i12 = efj.VJ;
      break label913;
    }
  }
  
  public final void a()
  {
    a(true);
  }
  
  public final void b()
  {
    a(false);
  }
  
  public final void c()
  {
    ((NotificationManager)this.a.getSystemService("notification")).cancel(0);
  }
  
  public final dk d()
  {
    boolean bool = true;
    if (this.c == null)
    {
      Intent localIntent = new Intent(this.a, StreamCastActivity.class);
      localIntent.putExtra("account_id", this.b.a.n);
      PendingIntent localPendingIntent = PendingIntent.getActivity(this.a, 0, localIntent, 134217728);
      dk localdk = new dk(this.a);
      int i = efj.Vz;
      localdk.x.icon = i;
      localdk.a(2, bool);
      localdk.d = localPendingIntent;
      localdk.s = "social";
      this.c = localdk;
      if (Build.VERSION.SDK_INT < 21) {
        break label148;
      }
    }
    for (;;)
    {
      if (bool) {
        this.c.u = this.a.getResources().getColor(aaw.qa);
      }
      return this.c;
      label148:
      bool = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kvt
 * JD-Core Version:    0.7.0.1
 */