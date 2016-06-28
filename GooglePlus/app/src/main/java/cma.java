import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cma
  extends hqi
{
  public int f;
  final AtomicBoolean g = new AtomicBoolean(false);
  boolean h;
  private int i;
  private String j;
  private String k;
  private int l;
  private String m;
  
  public cma(Context paramContext, Cursor paramCursor, String paramString1, int paramInt, String paramString2)
  {
    super(paramContext, null);
    this.j = paramString1;
    this.l = paramInt;
    this.m = null;
    Resources localResources = paramContext.getResources();
    this.i = ((int)localResources.getDimension(efj.nz));
    this.f = ((int)localResources.getDimension(efj.nB));
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    MediaView localMediaView = new MediaView(paramContext);
    localMediaView.s = 2;
    return localMediaView;
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    MediaView localMediaView = (MediaView)paramView;
    long l1 = paramCursor.getLong(4);
    String str1 = paramCursor.getString(1);
    String str2 = paramCursor.getString(2);
    ipm localipm = jrf.a(l1);
    localMediaView.a(ipf.a(this.d, str1, str2, localipm));
    paramView.setOnClickListener(null);
    lxk locallxk = new lxk(this.f, this.f);
    String str3 = paramCursor.getString(1);
    paramView.setTag(aaw.ln, str3);
    paramView.setLayoutParams(locallxk);
    if (paramCursor.getPosition() < -1 + paramCursor.getCount()) {}
    for (int n = this.i;; n = 0)
    {
      paramView.setPadding(0, 0, n, 0);
      return;
    }
  }
  
  public final Cursor b(Cursor paramCursor)
  {
    if (paramCursor == null) {}
    for (Bundle localBundle = Bundle.EMPTY;; localBundle = paramCursor.getExtras())
    {
      this.k = localBundle.getString("resume_token");
      this.h = false;
      return super.b(paramCursor);
    }
  }
  
  public final int getCount()
  {
    int n = super.getCount();
    if (n == 0) {
      n = 0;
    }
    while (this.k == null) {
      return n;
    }
    return n + 1;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (paramInt >= super.getCount()) {
      return -1;
    }
    return 0;
  }
  
  @SuppressLint({"InlinedApi"})
  @TargetApi(11)
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    cmb localcmb;
    if ((!this.h) && (this.k != null) && (super.getCount() - paramInt < 30) && (this.g.compareAndSet(false, true)))
    {
      localcmb = new cmb(this.d, this.l, this, this.j, this.m);
      if (Build.VERSION.SDK_INT >= 11) {
        break label117;
      }
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = this.k;
      localcmb.execute(arrayOfString2);
    }
    while (paramInt >= super.getCount())
    {
      return LayoutInflater.from(this.d).inflate(efj.uu, paramViewGroup, false);
      label117:
      Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = this.k;
      localcmb.executeOnExecutor(localExecutor, arrayOfString1);
    }
    return super.getView(paramInt, paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return 1;
  }
  
  public final boolean hasStableIds()
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cma
 * JD-Core Version:    0.7.0.1
 */