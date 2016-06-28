import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.plus.views.AlbumCoverView;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class dfr
  extends deo
{
  public static boolean g;
  private static int j;
  private static boolean k;
  private static StyleSpan s;
  private final String A;
  final AtomicBoolean f = new AtomicBoolean(false);
  boolean h;
  public String i;
  private final int l;
  private final String m;
  private final int n;
  private String o;
  private int p;
  private dut q;
  private final cyr r;
  private String z;
  
  public dfr(Context paramContext, Cursor paramCursor, int paramInt1, String paramString1, int paramInt2, String paramString2, dut paramdut)
  {
    super(paramContext, null);
    this.l = paramInt1;
    this.m = paramString1;
    this.n = paramInt2;
    this.q = paramdut;
    this.z = paramString2;
    this.A = ((giz)mbb.a(paramContext, giz.class)).a(this.l).b("domain_name");
    if ("TRUE".equalsIgnoreCase(dun.h.a())) {}
    for (this.r = new cyr(paramContext);; this.r = null)
    {
      if (!k)
      {
        j = paramContext.getResources().getDimensionPixelSize(efj.kE);
        s = new StyleSpan(1);
        k = true;
      }
      return;
    }
  }
  
  private static String a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      return "EVENT";
    }
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return "PUBLIC";
    case 1: 
      return "LIMITED";
    case 3: 
      return "DOMAIN";
    case 2: 
      return "PRIVATE";
    }
    return "EXTENDED_CIRCLES";
  }
  
  private final ipf d(Cursor paramCursor)
  {
    long l1 = paramCursor.getLong(13);
    String str1 = paramCursor.getString(1);
    String str2 = paramCursor.getString(6);
    ipm localipm = jrf.a(l1);
    if (TextUtils.isEmpty(str2)) {
      return null;
    }
    if ((l1 & 0x40000) != 0L) {
      return ipf.a(this.d, Uri.parse(str2), localipm);
    }
    return ipf.a(this.d, str1, str2, localipm);
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    if (paramCursor.getPosition() == 0) {}
    for (int i1 = 1; i1 != 0; i1 = 0) {
      return this.u.inflate(efj.sB, paramViewGroup, false);
    }
    return this.u.inflate(efj.vS, paramViewGroup, false);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    int i1;
    AlbumCoverView localAlbumCoverView;
    String str3;
    int i6;
    label208:
    int i7;
    Object[] arrayOfObject2;
    if (paramCursor.getPosition() == 0)
    {
      i1 = 1;
      if (i1 == 0) {
        break label637;
      }
      localAlbumCoverView = (AlbumCoverView)paramView;
      ipf localipf3 = d(paramCursor);
      String str2 = jrf.g(this.m);
      str3 = paramCursor.getString(4);
      int i5 = paramCursor.getInt(11);
      long l3 = paramCursor.getLong(13);
      String str4 = paramCursor.getString(5);
      localAlbumCoverView.c = this.q;
      i6 = -1;
      if (!paramCursor.isNull(7)) {
        i6 = paramCursor.getInt(7);
      }
      boolean bool3 = "PLUS_EVENT".equals(str2);
      if (((!"ALBUM".equals(str2)) || ((l3 & 0x2) != 0L)) && (!bool3)) {
        break label614;
      }
      int i10 = aau.bO;
      Object[] arrayOfObject4 = new Object[4];
      arrayOfObject4[0] = "AUDIENCE";
      arrayOfObject4[1] = a(i5, bool3);
      arrayOfObject4[2] = "DOMAIN_NAME";
      arrayOfObject4[3] = this.A;
      this.i = rfb.a(Locale.getDefault(), paramContext.getResources().getString(i10), arrayOfObject4);
      String str5 = this.i;
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      if (!TextUtils.isEmpty(str5))
      {
        localSpannableStringBuilder.append(str5);
        int i9 = str5.length();
        localSpannableStringBuilder.setSpan(s, 0, i9, 33);
        lxw locallxw = new lxw("roster://");
        locallxw.b = true;
        localSpannableStringBuilder.setSpan(locallxw, 0, i9, 33);
      }
      if (i6 >= 0)
      {
        Resources localResources = this.d.getResources();
        int i8 = efj.xc;
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(i6);
        String str7 = localResources.getQuantityString(i8, i6, arrayOfObject3);
        if (!TextUtils.isEmpty(localSpannableStringBuilder)) {
          localSpannableStringBuilder.append(" • ");
        }
        localSpannableStringBuilder.append(str7);
      }
      if (!TextUtils.isEmpty(str4))
      {
        if (!TextUtils.isEmpty(localSpannableStringBuilder)) {
          localSpannableStringBuilder.append(" • ");
        }
        localSpannableStringBuilder.append(str4);
      }
      localAlbumCoverView.a = str3;
      localAlbumCoverView.b = localSpannableStringBuilder;
      localAlbumCoverView.invalidate();
      localAlbumCoverView.b(true);
      localAlbumCoverView.a(localipf3);
      i7 = aau.bW;
      arrayOfObject2 = new Object[8];
      arrayOfObject2[0] = "AUDIENCE";
      arrayOfObject2[1] = a(i5, bool3);
      arrayOfObject2[2] = "DOMAIN_NAME";
      arrayOfObject2[3] = this.A;
      arrayOfObject2[4] = "ALBUM_TITLE";
      if (TextUtils.isEmpty(str3)) {
        break label622;
      }
    }
    lyc locallyc;
    for (;;)
    {
      arrayOfObject2[5] = str3;
      arrayOfObject2[6] = "PHOTO_COUNT";
      arrayOfObject2[7] = Integer.valueOf(i6);
      localAlbumCoverView.setContentDescription(rfb.a(Locale.getDefault(), paramContext.getResources().getString(i7), arrayOfObject2));
      String str6 = paramCursor.getString(3);
      paramView.setTag(aaw.kX, str6);
      locallyc = new lyc(2, this.p, this.n, 1);
      String str1 = paramCursor.getString(1);
      ipf localipf2 = d(paramCursor);
      paramView.setTag(aaw.ln, str1);
      paramView.setTag(aaw.lc, localipf2);
      paramView.setLayoutParams(locallyc);
      return;
      i1 = 0;
      break;
      label614:
      this.i = null;
      break label208;
      label622:
      str3 = paramContext.getResources().getString(aau.bX);
    }
    label637:
    PhotoTileView localPhotoTileView = (PhotoTileView)paramView;
    ipf localipf1 = d(paramCursor);
    localPhotoTileView.b(true);
    localPhotoTileView.a(localipf1);
    int i2;
    label677:
    label692:
    int i3;
    label706:
    label721:
    long l1;
    long l2;
    boolean bool1;
    label766:
    jpu localjpu1;
    if (paramCursor.isNull(8))
    {
      i2 = 0;
      if (i2 <= 0) {
        break label1002;
      }
      localPhotoTileView.b(Integer.valueOf(i2));
      if (!paramCursor.isNull(9)) {
        break label1011;
      }
      i3 = 0;
      if (i3 <= 0) {
        break label1024;
      }
      localPhotoTileView.a(Integer.valueOf(i3));
      l1 = paramCursor.getLong(13);
      l2 = paramCursor.getLong(12);
      if (((0x20000000 & l2) == 0L) || ((0x4000 & l1) == 0L)) {
        break label1033;
      }
      bool1 = true;
      localjpu1 = (jpu)this.t.b.a(new jpy(this.m), new jpw(localipf1));
      if (localjpu1 != null) {
        break label1045;
      }
    }
    label1024:
    label1033:
    label1045:
    for (jpu localjpu2 = new jpu(this.m, this.m, localipf1, l1, l2);; localjpu2 = localjpu1)
    {
      if ((l1 & 0x100) != 0L) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        if (this.r != null)
        {
          localPhotoTileView.e = 1;
          localPhotoTileView.invalidate();
          this.r.a(localPhotoTileView, localipf1);
        }
        localPhotoTileView.a(localjpu2);
        localPhotoTileView.H = bool1;
        localPhotoTileView.invalidate();
        localPhotoTileView.d = bool2;
        Context localContext = this.d;
        int i4 = aau.cc;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = "PHOTO_COUNT";
        arrayOfObject1[1] = Integer.valueOf(paramCursor.getPosition());
        localPhotoTileView.setContentDescription(rfb.a(Locale.getDefault(), localContext.getResources().getString(i4), arrayOfObject1));
        paramView.setOnClickListener(this.w);
        paramView.setOnLongClickListener(this.x);
        locallyc = new lyc(2, -3);
        break;
        i2 = paramCursor.getInt(8);
        break label677;
        label1002:
        localPhotoTileView.b(null);
        break label692;
        label1011:
        i3 = paramCursor.getInt(9);
        break label706;
        localPhotoTileView.a(null);
        break label721;
        bool1 = false;
        break label766;
      }
    }
  }
  
  public final Cursor b(Cursor paramCursor)
  {
    if (paramCursor == null) {}
    for (Bundle localBundle = Bundle.EMPTY;; localBundle = paramCursor.getExtras())
    {
      this.o = localBundle.getString("resume_token");
      this.h = false;
      return super.b(paramCursor);
    }
  }
  
  public final void c()
  {
    if (this.r != null) {
      this.r.a();
    }
    super.c();
  }
  
  public final int getCount()
  {
    int i1 = super.getCount();
    if (i1 == 0) {
      i1 = 0;
    }
    do
    {
      return i1;
      if (g) {
        i1++;
      }
    } while (this.o == null);
    return i1 + 1;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (paramInt >= super.getCount()) {
      return -1;
    }
    if (paramInt == 0) {
      return 0;
    }
    return 1;
  }
  
  @SuppressLint({"InlinedApi", "NewApi"})
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    dfs localdfs;
    if ((!this.h) && (this.o != null) && (super.getCount() - paramInt < 30) && (this.f.compareAndSet(false, true)))
    {
      localdfs = new dfs(this.d, this.l, this, this.m, this.z);
      if (Build.VERSION.SDK_INT < 11)
      {
        String[] arrayOfString2 = new String[1];
        arrayOfString2[0] = this.o;
        localdfs.execute(arrayOfString2);
      }
    }
    else
    {
      if (paramViewGroup != null) {
        break label289;
      }
    }
    label289:
    for (int i1 = 0;; i1 = paramViewGroup.getMeasuredWidth())
    {
      if ((this.p == 0) && (i1 > 0))
      {
        Resources localResources = this.d.getResources();
        int i3 = localResources.getInteger(efj.sk);
        this.p = (i1 * 100 / i3);
        int i4 = localResources.getDimensionPixelSize(efj.mj);
        if (i4 > 0) {
          this.p = Math.min(this.p, i4);
        }
        if (Log.isLoggable("SingleAlbum", 3))
        {
          int i5 = this.p;
          new StringBuilder(47).append("albumCoverHeight=").append(i5).append(", width=").append(i1);
        }
      }
      int i2 = super.getCount();
      if (paramInt < i2) {
        break label346;
      }
      if ((this.o == null) || (paramInt != i2)) {
        break label298;
      }
      return this.u.inflate(efj.uu, paramViewGroup, false);
      Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = this.o;
      localdfs.executeOnExecutor(localExecutor, arrayOfString1);
      break;
    }
    label298:
    View localView = new View(this.d);
    lyc locallyc = new lyc(2, -2, this.n, 1);
    locallyc.height = j;
    localView.setLayoutParams(locallyc);
    return localView;
    label346:
    return super.getView(paramInt, paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return 2;
  }
  
  public final boolean hasStableIds()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfr
 * JD-Core Version:    0.7.0.1
 */