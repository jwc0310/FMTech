import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.apps.plus.views.PhotoTileView;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class dec
  extends hqi
{
  final AtomicBoolean f = new AtomicBoolean(false);
  public View.OnClickListener g;
  boolean h;
  private final int i;
  private String j;
  private String k;
  
  public dec(Context paramContext, Cursor paramCursor, int paramInt, String paramString)
  {
    super(paramContext, null);
    this.k = paramString;
    this.i = paramInt;
  }
  
  private static boolean d(Cursor paramCursor)
  {
    return paramCursor.getInt(6) == 100;
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    if (paramCursor.getInt(6) == 100) {
      return localLayoutInflater.inflate(efj.sU, paramViewGroup, false);
    }
    return localLayoutInflater.inflate(efj.vS, paramViewGroup, false);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    if (d(paramCursor))
    {
      PhotoTileView localPhotoTileView2 = (PhotoTileView)paramView.findViewById(aaw.hn);
      String str4 = paramCursor.getString(2);
      Uri localUri;
      String str5;
      ipf localipf;
      if (str4 == null)
      {
        localUri = null;
        str5 = paramCursor.getString(1);
        localipf = null;
        if (localUri != null) {
          break label99;
        }
      }
      for (;;)
      {
        localPhotoTileView2.a(localipf);
        paramView.setTag(aaw.ln, str5);
        paramView.setTag(aaw.lo, Integer.valueOf(1));
        paramView.setOnClickListener(this.g);
        return;
        localUri = Uri.parse(str4);
        break;
        label99:
        localipf = ipf.a(paramContext, str5, null, localUri, ipm.a);
      }
    }
    PhotoTileView localPhotoTileView1 = (PhotoTileView)paramView;
    long l = paramCursor.getLong(7);
    String str1 = paramCursor.getString(1);
    String str2 = paramCursor.getString(2);
    ipm localipm = jrf.a(l);
    localPhotoTileView1.a(ipf.a(this.d, str1, str2, localipm));
    int m;
    label203:
    Integer localInteger;
    if (paramCursor.isNull(3))
    {
      m = 0;
      if (m <= 0) {
        break label343;
      }
      localPhotoTileView1.b(Integer.valueOf(m));
      boolean bool1 = paramCursor.isNull(4);
      localInteger = null;
      if (!bool1) {
        break label352;
      }
      label220:
      localPhotoTileView1.a(localInteger);
      int n = aau.mV;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(1 + paramCursor.getPosition());
      localPhotoTileView1.setContentDescription(paramContext.getString(n, arrayOfObject));
      if ((0x100 & paramCursor.getLong(7)) == 0L) {
        break label367;
      }
    }
    label343:
    label352:
    label367:
    for (boolean bool2 = true;; bool2 = false)
    {
      localPhotoTileView1.d = bool2;
      String str3 = paramCursor.getString(1);
      paramView.setTag(aaw.ln, str3);
      paramView.setTag(aaw.lo, Integer.valueOf(0));
      paramView.setOnClickListener(this.g);
      return;
      m = paramCursor.getInt(3);
      break;
      localPhotoTileView1.b(null);
      break label203;
      localInteger = Integer.valueOf(paramCursor.getInt(4));
      break label220;
    }
  }
  
  public final Cursor b(Cursor paramCursor)
  {
    if (paramCursor == null) {}
    for (Bundle localBundle = Bundle.EMPTY;; localBundle = paramCursor.getExtras())
    {
      this.j = localBundle.getString("resume_token");
      this.h = false;
      return super.b(paramCursor);
    }
  }
  
  public final int getCount()
  {
    int m;
    if ((!this.a) || (this.c == null)) {
      m = 0;
    }
    do
    {
      return m;
      m = super.getCount();
    } while (this.j == null);
    return m + 1;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (paramInt == super.getCount()) {
      return -1;
    }
    if (d((Cursor)getItem(paramInt))) {
      return 1;
    }
    return 0;
  }
  
  @SuppressLint({"InlinedApi"})
  @TargetApi(11)
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ded localded;
    if ((!this.h) && (this.j != null) && (super.getCount() - paramInt < 100) && (this.f.compareAndSet(false, true)))
    {
      localded = new ded(this.d, this.i, this, this.k);
      if (Build.VERSION.SDK_INT >= 11) {
        break label113;
      }
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = this.j;
      localded.execute(arrayOfString2);
    }
    while (paramInt == super.getCount())
    {
      return LayoutInflater.from(this.d).inflate(efj.uu, paramViewGroup, false);
      label113:
      Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = this.j;
      localded.executeOnExecutor(localExecutor, arrayOfString1);
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
 * Qualified Name:     dec
 * JD-Core Version:    0.7.0.1
 */