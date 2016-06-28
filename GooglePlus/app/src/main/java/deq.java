import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.apps.plus.views.PhotoTileView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class deq
  extends deo
{
  final AtomicBoolean f = new AtomicBoolean(false);
  public int g = 6;
  private final int h;
  private String i;
  private int j;
  private int k;
  private lb<String> l;
  private SparseIntArray m;
  private int n;
  private String o;
  
  public deq(Context paramContext, Cursor paramCursor, int paramInt, String paramString)
  {
    super(paramContext, null);
    this.h = paramInt;
    this.o = paramString;
  }
  
  private final int a(int paramInt)
  {
    if ((!this.a) || (this.c == null)) {
      return -1;
    }
    if (this.m.indexOfKey(paramInt) >= 0) {
      return this.m.get(paramInt);
    }
    int i1 = Math.max(paramInt, 15 + this.n);
    int i2 = this.n;
    int i3 = -1 + this.n;
    this.c.moveToPosition(-1 + this.m.get(this.n, 0));
    int i4 = -1;
    int i5 = i3;
    while ((i5 < i1) && (this.c.moveToNext()))
    {
      int i6 = this.c.getPosition();
      if (!d(this.c)) {}
      int i8;
      for (int i7 = 1;; i7 = 0)
      {
        if ((i6 < i4) && (i7 == 0)) {
          break label205;
        }
        i8 = i5 + 1;
        this.m.put(i8, i6);
        if (i7 == 0) {
          break label207;
        }
        String str = this.c.getString(3);
        this.l.a(i6, str);
        i5 = i8;
        i4 = -1;
        break;
      }
      label205:
      continue;
      label207:
      int i9 = i6 + b(i6);
      i5 = i8;
      i4 = i9;
    }
    this.n = i5;
    if (i2 != this.n) {
      notifyDataSetChanged();
    }
    return this.m.get(paramInt, -1);
  }
  
  private final View a(Cursor paramCursor, ViewGroup paramViewGroup, int paramInt1, int paramInt2)
  {
    int i1;
    View localView;
    label37:
    int i2;
    if ((paramCursor == null) || (d(paramCursor)))
    {
      i1 = 1;
      if (i1 == 0) {
        break label118;
      }
      if (paramCursor != null) {
        break label101;
      }
      localView = this.u.inflate(efj.uu, paramViewGroup, false);
      if (i1 == 0) {
        break label135;
      }
      i2 = this.j;
      label48:
      if (i1 == 0) {
        break label141;
      }
    }
    label135:
    label141:
    for (int i3 = this.j;; i3 = -2)
    {
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(i2, i3);
      localLayoutParams.rightMargin = paramInt1;
      localLayoutParams.bottomMargin = paramInt2;
      localView.setLayoutParams(localLayoutParams);
      return localView;
      i1 = 0;
      break;
      label101:
      localView = this.u.inflate(efj.vS, paramViewGroup, false);
      break label37;
      label118:
      localView = this.u.inflate(efj.tj, paramViewGroup, false);
      break label37;
      i2 = -1;
      break label48;
    }
  }
  
  private final int b(int paramInt)
  {
    if (this.l.f(paramInt) >= 0) {
      return 0;
    }
    return this.k;
  }
  
  private static boolean d(Cursor paramCursor)
  {
    return paramCursor.getInt(2) == 4;
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.u.inflate(efj.sS, paramViewGroup, false);
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    PhotoTileView localPhotoTileView;
    ipf localipf;
    label99:
    int i5;
    label216:
    label225:
    String str6;
    label277:
    long l2;
    long l3;
    boolean bool2;
    label330:
    jpu localjpu1;
    if (d(paramCursor))
    {
      localPhotoTileView = (PhotoTileView)paramView;
      long l1 = paramCursor.getLong(11);
      String str4 = paramCursor.getString(1);
      String str5 = paramCursor.getString(5);
      ipm localipm = jrf.a(l1);
      localipf = ipf.a(this.d, str4, str5, localipm);
      localPhotoTileView.a(localipf);
      int i4;
      if (paramCursor.isNull(7))
      {
        i4 = 0;
        if (i4 <= 0) {
          break label216;
        }
        localPhotoTileView.b(Integer.valueOf(i4));
        if (!paramCursor.isNull(8)) {
          break label225;
        }
      }
      int i6;
      int i8;
      for (Integer localInteger = null;; localInteger = Integer.valueOf(paramCursor.getInt(8)))
      {
        localPhotoTileView.a(localInteger);
        i5 = paramCursor.getPosition();
        lb locallb = this.l;
        if (locallb.b) {
          locallb.a();
        }
        i6 = locallb.e;
        i7 = this.l.f(i5);
        if (i7 >= 0) {
          break label277;
        }
        for (i8 = i7 ^ 0xFFFFFFFF; (i8 < i6) && (this.l.d(i8) < i5); i8++) {}
        i4 = paramCursor.getInt(7);
        break;
        localPhotoTileView.b(null);
        break label99;
      }
      for (int i7 = Math.min(i8, i6 - 1); (i7 >= 0) && (this.l.d(i7) > i5); i7--) {}
      if (i7 >= 0)
      {
        str6 = (String)this.l.e(i7);
        l2 = paramCursor.getLong(11);
        l3 = paramCursor.getLong(12);
        if ((0x4000 & l2) == 0L) {
          break label526;
        }
        bool2 = true;
        localjpu1 = (jpu)this.t.b.a(new jpy(str6), new jpw(localipf));
        if (localjpu1 != null) {
          break label793;
        }
      }
    }
    label526:
    label787:
    label793:
    for (jpu localjpu2 = new jpu(this.o, str6, localipf, l2, l3);; localjpu2 = localjpu1)
    {
      if ((0x100 & l2) != 0L) {}
      int i3;
      for (boolean bool3 = true;; bool3 = false)
      {
        localPhotoTileView.a(localjpu2);
        localPhotoTileView.H = bool2;
        localPhotoTileView.invalidate();
        localPhotoTileView.d = bool3;
        paramView.setOnLongClickListener(this.x);
        paramView.setOnClickListener(this.w);
        i3 = 1;
        String str3 = paramCursor.getString(1);
        paramView.setTag(aaw.ln, str3);
        paramView.setTag(aaw.lo, Integer.valueOf(i3));
        return;
        if (Log.isLoggable("EsTile", 6)) {
          Log.e("EsTile", 58 + "Unable to find cluster ID for photo: cursorPos=" + i5);
        }
        str6 = null;
        break;
        bool2 = false;
        break label330;
      }
      boolean bool1 = TextUtils.equals("~pending_photos_of_user", jrf.d(paramCursor.getString(3)));
      TextView localTextView1 = (TextView)paramView.findViewById(aaw.bA);
      TextView localTextView2 = (TextView)paramView.findViewById(aaw.hs);
      localTextView1.setText(paramCursor.getString(4));
      if (!paramCursor.isNull(6))
      {
        StyleSpan localStyleSpan = new StyleSpan(1);
        SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
        int i1 = paramCursor.getInt(6);
        Resources localResources = this.d.getResources();
        int i2 = efj.xc;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i1);
        String str1 = localResources.getQuantityString(i2, i1, arrayOfObject).toUpperCase();
        localSpannableStringBuilder.append(str1);
        localSpannableStringBuilder.setSpan(localStyleSpan, 0, str1.length(), 33);
        localTextView2.setText(localSpannableStringBuilder);
        localTextView2.setVisibility(0);
        label713:
        String str2 = paramCursor.getString(3);
        paramView.setTag(aaw.kX, str2);
        paramView.setClickable(bool1);
        if (!bool1) {
          break label787;
        }
      }
      for (View.OnClickListener localOnClickListener = this.w;; localOnClickListener = null)
      {
        paramView.setOnClickListener(localOnClickListener);
        paramView.setBackgroundColor(this.d.getResources().getColor(efj.jy));
        i3 = 0;
        break;
        localTextView2.setVisibility(8);
        break label713;
      }
    }
  }
  
  public final boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public final Cursor b(Cursor paramCursor)
  {
    Bundle localBundle;
    int i1;
    label70:
    lb locallb;
    label81:
    SparseIntArray localSparseIntArray;
    if (paramCursor == null)
    {
      localBundle = Bundle.EMPTY;
      this.i = localBundle.getString("resume_token");
      if ((paramCursor != null) && (this.c != null) && ((paramCursor == this.c) || ((paramCursor.getCount() >= this.c.getCount()) && (this.c.getCount() != 0)))) {
        break label139;
      }
      i1 = 1;
      if (i1 != 0)
      {
        if (paramCursor != null) {
          break label144;
        }
        locallb = null;
        this.l = locallb;
        localSparseIntArray = null;
        if (paramCursor != null) {
          break label156;
        }
      }
    }
    for (;;)
    {
      this.m = localSparseIntArray;
      this.n = 0;
      this.k = new jrh(this.d).a;
      return super.b(paramCursor);
      localBundle = paramCursor.getExtras();
      break;
      label139:
      i1 = 0;
      break label70;
      label144:
      locallb = new lb();
      break label81;
      label156:
      localSparseIntArray = new SparseIntArray(paramCursor.getCount());
    }
  }
  
  public final int getCount()
  {
    int i1 = 1;
    boolean bool = this.a;
    int i2 = 0;
    if (bool)
    {
      Cursor localCursor = this.c;
      i2 = 0;
      if (localCursor != null) {}
    }
    else
    {
      return i2;
    }
    int i3 = this.m.get(this.n, 0);
    int i4;
    label52:
    int i5;
    label77:
    int i6;
    label87:
    int i7;
    if (this.n == 0)
    {
      i4 = 0;
      if ((!this.a) || (this.c == null)) {
        break label203;
      }
      i5 = this.c.getCount();
      if (this.i != null) {
        break label209;
      }
      i6 = 0;
      i7 = i5 + i6;
      if (i7 - i3 <= i4) {
        break label215;
      }
    }
    for (;;)
    {
      int i8 = 0;
      if (i1 != 0) {
        i8 = i7 - i3 - i4;
      }
      i2 = i8 + 1 + this.n;
      if (!Log.isLoggable("EsTile", 3)) {
        break;
      }
      new StringBuilder(48).append("#getCount; curCnt: ").append(i7).append(", cnt: ").append(i2);
      return i2;
      if (this.l.f(i3) >= 0)
      {
        i4 = i1;
        break label52;
      }
      i4 = b(i3);
      break label52;
      label203:
      i5 = 0;
      break label77;
      label209:
      i6 = i1;
      break label87;
      label215:
      i1 = 0;
    }
  }
  
  public final Object getItem(int paramInt)
  {
    int i1 = a(paramInt);
    if (Log.isLoggable("EsTile", 3))
    {
      if ((!this.a) || (this.c == null)) {
        break label116;
      }
      int i2 = this.c.getCount();
      new StringBuilder(68).append("#getItem; pos: ").append(paramInt).append(", curPos: ").append(i1).append(", curCnt: ").append(i2);
    }
    while ((this.a) && (this.c != null) && (i1 >= 0))
    {
      this.c.moveToPosition(i1);
      return this.c;
      label116:
      boolean bool = this.a;
      new StringBuilder(30).append("#getItem; is data valid? ").append(bool);
    }
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    long l1 = 0L;
    int i1 = a(paramInt);
    if ((this.a) && (this.c != null) && (i1 >= 0) && (this.c.moveToPosition(i1))) {
      l1 = this.c.getLong(this.e);
    }
    return l1;
  }
  
  public final int getItemViewType(int paramInt)
  {
    int i1 = a(paramInt);
    if (Log.isLoggable("EsTile", 3))
    {
      if ((!this.a) || (this.c == null)) {
        break label102;
      }
      int i2 = this.c.getCount();
      new StringBuilder(76).append("#getItemViewType; pos: ").append(paramInt).append(", curPos: ").append(i1).append(", curCnt: ").append(i2);
    }
    while ((!this.a) || (this.c == null) || (i1 < 0))
    {
      return -1;
      label102:
      boolean bool = this.a;
      new StringBuilder(38).append("#getItemViewType; is data valid? ").append(bool);
    }
    if (d((Cursor)getItem(paramInt))) {
      return 1;
    }
    return 0;
  }
  
  @SuppressLint({"InlinedApi"})
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (!this.a) {
      throw new IllegalStateException("this should only be called when the cursor is valid");
    }
    int i1 = paramViewGroup.getMeasuredWidth();
    int i2 = this.j;
    if ((i2 == 0) && (i1 > 0)) {
      this.j = ((i1 - this.g * (-1 + this.k)) / this.k);
    }
    if (Log.isLoggable("EsTile", 3))
    {
      int i8 = this.k;
      new StringBuilder(56).append("#calcColumnCount; count: ").append(i8).append(", width: ").append(i2);
    }
    int i3 = a(paramInt);
    int i4 = this.c.getCount();
    if (Log.isLoggable("EsTile", 3)) {
      new StringBuilder(49).append("#getView; pos: ").append(paramInt).append(", curStart: ").append(i3);
    }
    der localder;
    ViewGroup localViewGroup;
    if ((this.i != null) && (i4 - i3 < 100) && (this.f.compareAndSet(false, true)))
    {
      localder = new der(this.d, this.h, this);
      if (Build.VERSION.SDK_INT < 11)
      {
        String[] arrayOfString2 = new String[1];
        arrayOfString2[0] = this.i;
        localder.execute(arrayOfString2);
      }
    }
    else
    {
      if (paramView != null) {
        break label363;
      }
      localViewGroup = (ViewGroup)this.u.inflate(efj.sS, paramViewGroup, false);
      label273:
      localViewGroup.removeAllViews();
      if (this.l.f(i3) < 0) {
        break label372;
      }
      View localView2 = a(this.c, localViewGroup, 0, this.g);
      localViewGroup.addView(localView2);
      a(localView2, this.d, this.c);
    }
    label363:
    label372:
    int i5;
    int i6;
    label387:
    label433:
    do
    {
      do
      {
        return localViewGroup;
        Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
        String[] arrayOfString1 = new String[1];
        arrayOfString1[0] = this.i;
        localder.executeOnExecutor(localExecutor, arrayOfString1);
        break;
        localViewGroup = (ViewGroup)paramView;
        break label273;
        i5 = i3 + b(i3);
        i6 = i3;
        if (i6 >= i5) {
          break label510;
        }
        if ((i6 != i4) && (i6 >= 0)) {
          break label433;
        }
      } while (this.i == null);
      localViewGroup.addView(a(null, localViewGroup, 0, this.g));
      return localViewGroup;
      this.c.moveToPosition(i6);
    } while (!d(this.c));
    if (i6 == i5 - 1) {}
    for (int i7 = 0;; i7 = this.g)
    {
      View localView1 = a(this.c, localViewGroup, i7, this.g);
      localViewGroup.addView(localView1);
      a(localView1, this.d, this.c);
      i6++;
      break label387;
      label510:
      break;
    }
  }
  
  public final int getViewTypeCount()
  {
    return 3;
  }
  
  public final boolean hasStableIds()
  {
    return false;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     deq
 * JD-Core Version:    0.7.0.1
 */