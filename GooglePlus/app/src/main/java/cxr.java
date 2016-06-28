import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.plus.views.AlbumTileView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cxr
  extends hqi
{
  final AtomicBoolean f = new AtomicBoolean(false);
  public View.OnClickListener g;
  private final int h;
  private final String i;
  private String j;
  private int k;
  private int l;
  
  public cxr(Context paramContext, Cursor paramCursor, String paramString, int paramInt1, int paramInt2)
  {
    super(paramContext, null);
    this.h = paramInt1;
    this.i = paramString;
    this.k = paramInt2;
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(efj.sE, paramViewGroup, false);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    AlbumTileView localAlbumTileView = (AlbumTileView)paramView;
    String str1 = paramCursor.getString(3);
    Integer localInteger;
    ipf localipf;
    int m;
    label93:
    int n;
    label113:
    Bitmap localBitmap;
    if (paramCursor.isNull(6))
    {
      localInteger = null;
      long l1 = paramCursor.getLong(9);
      String str2 = paramCursor.getString(1);
      String str3 = paramCursor.getString(5);
      ipm localipm = jrf.a(l1);
      localipf = ipf.a(this.d, str2, str3, localipm);
      if (!paramCursor.isNull(8)) {
        break label234;
      }
      m = -1;
      if ((0x2 & paramCursor.getLong(9)) == 0L) {
        break label247;
      }
      n = 1;
      String str4 = paramCursor.getString(2);
      localAlbumTileView.setTag(aaw.kX, str4);
      localAlbumTileView.g.setText(str1);
      if (localInteger != null) {
        break label253;
      }
      localAlbumTileView.h.setVisibility(4);
      label156:
      if (n == 0) {
        break label298;
      }
      localBitmap = AlbumTileView.e;
    }
    for (;;)
    {
      localAlbumTileView.j.setImageBitmap(localBitmap);
      localAlbumTileView.i.a(localipf);
      localAlbumTileView.setOnClickListener(this.g);
      localAlbumTileView.setLayoutParams(new lyc(2, (int)(1.2F * this.l)));
      return;
      localInteger = Integer.valueOf(paramCursor.getInt(6));
      break;
      label234:
      m = paramCursor.getInt(8);
      break label93;
      label247:
      n = 0;
      break label113;
      label253:
      localAlbumTileView.h.setVisibility(0);
      localAlbumTileView.h.setText(localAlbumTileView.getResources().getQuantityString(efj.xc, localInteger.intValue(), new Object[] { localInteger }));
      break label156;
      switch (m)
      {
      default: 
        localBitmap = null;
        break;
      case 2: 
        localBitmap = AlbumTileView.c;
        break;
      case 4: 
        localBitmap = AlbumTileView.f;
        break;
      case 1: 
        localBitmap = AlbumTileView.b;
        break;
      case 0: 
        localBitmap = AlbumTileView.a;
        break;
      case 3: 
        label298:
        localBitmap = AlbumTileView.d;
      }
    }
  }
  
  public final Cursor b(Cursor paramCursor)
  {
    if (paramCursor == null) {}
    for (Bundle localBundle = Bundle.EMPTY;; localBundle = paramCursor.getExtras())
    {
      this.j = localBundle.getString("resume_token");
      return super.b(paramCursor);
    }
  }
  
  public final int getCount()
  {
    int m = super.getCount();
    if (this.j != null) {
      m++;
    }
    return m;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (paramInt == super.getCount()) {
      return -1;
    }
    return 0;
  }
  
  @SuppressLint({"InlinedApi"})
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    cxs localcxs;
    if ((this.j != null) && (super.getCount() - paramInt < 30) && (this.f.compareAndSet(false, true)))
    {
      localcxs = new cxs(this.d, this.h, this, this.i);
      if (Build.VERSION.SDK_INT >= 11) {
        break label119;
      }
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = this.j;
      localcxs.execute(arrayOfString2);
    }
    for (;;)
    {
      this.l = (paramViewGroup.getWidth() / this.k);
      if (paramInt != super.getCount()) {
        break;
      }
      return LayoutInflater.from(this.d).inflate(efj.uu, paramViewGroup, false);
      label119:
      Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = this.j;
      localcxs.executeOnExecutor(localExecutor, arrayOfString1);
    }
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
 * Qualified Name:     cxr
 * JD-Core Version:    0.7.0.1
 */