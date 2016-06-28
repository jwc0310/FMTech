import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cxn
  extends hqi
{
  private static Bitmap h;
  private static Bitmap i;
  private static Bitmap j;
  private static Bitmap k;
  private static Bitmap l;
  private static int m;
  private static int n;
  private static int o;
  private static int p;
  final AtomicBoolean f = new AtomicBoolean(false);
  public View.OnClickListener g;
  private final int q;
  private String r;
  private String s;
  
  public cxn(Context paramContext, Cursor paramCursor, int paramInt, String paramString)
  {
    super(paramContext, null);
    this.q = paramInt;
    this.s = paramString;
    if (h == null)
    {
      Resources localResources = paramContext.getResources();
      m = localResources.getDimensionPixelSize(efj.nb);
      n = localResources.getDimensionPixelSize(efj.nd);
      p = localResources.getDimensionPixelSize(efj.nc);
      o = localResources.getDimensionPixelSize(efj.na);
      h = efj.a(localResources, efj.pG);
      i = efj.a(localResources, efj.pi);
      j = efj.a(localResources, efj.pE);
      k = efj.a(localResources, efj.po);
      l = efj.a(localResources, efj.pq);
    }
  }
  
  private static void a(View paramView, int paramInt)
  {
    if (paramView == null) {
      return;
    }
    int i1 = 0;
    int i5;
    int i6;
    int i2;
    switch (paramInt)
    {
    default: 
      i5 = 0;
      i6 = 0;
      i2 = 0;
    }
    for (;;)
    {
      paramView.setPadding(i2, i6, i5, i1);
      return;
      i2 = m;
      i5 = p;
      i6 = n;
      i1 = 0;
      continue;
      i6 = n;
      i2 = m;
      i5 = p;
      i1 = 0;
      continue;
      i1 = n;
      i2 = m;
      int i3 = p;
      int i4 = o;
      i5 = i3;
      i6 = i1;
      i1 = i4;
    }
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(efj.sy, paramViewGroup, false);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    int i1;
    String str1;
    int i2;
    label90:
    int i5;
    label188:
    Bitmap localBitmap;
    label227:
    ImageView localImageView;
    int i6;
    if (2 + paramCursor.getPosition() == getCount())
    {
      i1 = 2;
      a(paramView, i1);
      ((MediaView)paramView.findViewById(aaw.ek)).a(ipf.a(paramContext, paramCursor.getString(5), ipm.a));
      str1 = paramCursor.getString(3);
      TextView localTextView1 = (TextView)paramView.findViewById(aaw.lK);
      localTextView1.setText(str1);
      if (TextUtils.isEmpty(str1)) {
        break label356;
      }
      i2 = 0;
      localTextView1.setVisibility(i2);
      int i3 = paramCursor.getInt(6);
      Resources localResources = this.d.getResources();
      int i4 = efj.xc;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i3);
      String str2 = localResources.getQuantityString(i4, i3, arrayOfObject);
      TextView localTextView2 = (TextView)paramView.findViewById(aaw.kH);
      localTextView2.setText(str2);
      localTextView2.setVisibility(0);
      if (!paramCursor.isNull(8)) {
        break label363;
      }
      i5 = -1;
      switch (i5)
      {
      default: 
        localBitmap = null;
        localImageView = (ImageView)paramView.findViewById(aaw.v);
        localImageView.setImageBitmap(localBitmap);
        i6 = 0;
        if (localBitmap == null) {
          break;
        }
      }
    }
    for (;;)
    {
      localImageView.setVisibility(i6);
      paramView.setTag(aaw.lp, str1);
      paramView.setTag(aaw.kQ, Integer.valueOf(i5));
      paramView.setTag(aaw.kX, paramCursor.getString(2));
      byte[] arrayOfByte = paramCursor.getBlob(10);
      if (arrayOfByte != null)
      {
        jqt localjqt = jqt.a(arrayOfByte);
        if (!TextUtils.isEmpty(localjqt.b)) {
          paramView.setTag(aaw.kR, localjqt.b);
        }
      }
      paramView.setOnClickListener(this.g);
      return;
      i1 = 1;
      break;
      label356:
      i2 = 8;
      break label90;
      label363:
      i5 = paramCursor.getInt(8);
      break label188;
      localBitmap = j;
      break label227;
      localBitmap = l;
      break label227;
      localBitmap = i;
      break label227;
      localBitmap = h;
      break label227;
      localBitmap = k;
      break label227;
      i6 = 8;
    }
  }
  
  public final Cursor b(Cursor paramCursor)
  {
    if (paramCursor == null) {}
    for (Bundle localBundle = Bundle.EMPTY;; localBundle = paramCursor.getExtras())
    {
      this.r = localBundle.getString("resume_token");
      return super.b(paramCursor);
    }
  }
  
  public final int getCount()
  {
    int i1 = 1 + super.getCount();
    if (this.r != null) {
      i1++;
    }
    return i1;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if ((paramInt == 0) || (paramInt + 1 == getCount())) {
      return -1;
    }
    return 0;
  }
  
  @SuppressLint({"InlinedApi"})
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    cxo localcxo;
    View localView2;
    int i2;
    if ((this.r != null) && (super.getCount() - paramInt < 30) && (this.f.compareAndSet(false, true)))
    {
      localcxo = new cxo(this.d, this.q, this, this.s);
      if (Build.VERSION.SDK_INT < 11)
      {
        String[] arrayOfString2 = new String[1];
        arrayOfString2[0] = this.r;
        localcxo.execute(arrayOfString2);
      }
    }
    else
    {
      if (paramInt != 0) {
        break label175;
      }
      localView2 = LayoutInflater.from(this.d).inflate(efj.sA, paramViewGroup, false);
      localView2.setOnClickListener(this.g);
      int i1 = getCount();
      i2 = 0;
      if (i1 <= 1) {
        break label169;
      }
    }
    for (;;)
    {
      a(localView2, i2);
      return localView2;
      Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      String[] arrayOfString1 = new String[1];
      arrayOfString1[0] = this.r;
      localcxo.executeOnExecutor(localExecutor, arrayOfString1);
      break;
      label169:
      i2 = 3;
    }
    label175:
    if ((this.r != null) && (paramInt + 1 == getCount()))
    {
      View localView1 = LayoutInflater.from(this.d).inflate(efj.sz, paramViewGroup, false);
      a(localView1, 2);
      return localView1;
    }
    return super.getView(paramInt - 1, paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return 1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxn
 * JD-Core Version:    0.7.0.1
 */