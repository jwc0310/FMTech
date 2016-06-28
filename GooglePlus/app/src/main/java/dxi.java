import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.media.ui.MediaView;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class dxi
  extends eab
  implements gik
{
  private llv V;
  private dzn a;
  private int b = -1;
  
  public dxi(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dxi(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dxi(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.a = new dzn(paramContext, paramAttributeSet, 0);
  }
  
  protected final boolean C_()
  {
    return true;
  }
  
  public final void D_()
  {
    super.D_();
    this.b = -1;
    this.a.D_();
    this.V = null;
  }
  
  public final void E_()
  {
    onClick(this);
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.B = paramInt1;
    this.b = paramInt2;
    this.a.measure(View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    return paramInt2 + this.a.getMeasuredHeight();
  }
  
  protected final int a(Canvas paramCanvas, int paramInt)
  {
    return paramInt + this.a.getMeasuredHeight();
  }
  
  protected final void a(Cursor paramCursor)
  {
    int i = 1;
    byte[] arrayOfByte = paramCursor.getBlob(26);
    Object localObject;
    if (arrayOfByte != null)
    {
      if (arrayOfByte == null)
      {
        localObject = null;
        this.V = localObject;
      }
    }
    else {
      return;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
    llv localllv = new llv();
    localllv.a = llv.d(localByteBuffer);
    localllv.b = ((ArrayList)llv.c(localByteBuffer));
    localllv.c = ((ArrayList)llv.c(localByteBuffer));
    localllv.d = ((ArrayList)llv.c(localByteBuffer));
    localllv.e = llv.d(localByteBuffer);
    localllv.g = localByteBuffer.getInt();
    localllv.f = llv.d(localByteBuffer);
    localllv.h = llv.d(localByteBuffer);
    int j;
    if (localByteBuffer.get() == i)
    {
      j = i;
      label145:
      localllv.i = j;
      if (localByteBuffer.get() != i) {
        break label180;
      }
    }
    for (;;)
    {
      localllv.j = i;
      localObject = localllv;
      break;
      j = 0;
      break label145;
      label180:
      i = 0;
    }
  }
  
  public final void a(StringBuilder paramStringBuilder)
  {
    if (this.a != null)
    {
      CharSequence[] arrayOfCharSequence = new CharSequence[1];
      arrayOfCharSequence[0] = ((String)this.a.getContentDescription());
      efj.a(paramStringBuilder, arrayOfCharSequence);
    }
  }
  
  protected final void a_(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    int i;
    dzn localdzn;
    boolean bool1;
    int j;
    label141:
    int i4;
    label220:
    label244:
    label254:
    String str4;
    label353:
    String str5;
    String str7;
    label417:
    label424:
    label440:
    dzo localdzo;
    boolean bool2;
    label474:
    Resources localResources;
    int n;
    label542:
    int i1;
    if (this.V != null)
    {
      removeView(this.a);
      addView(this.a);
      i = a(paramhfa, this.K);
      localdzn = this.a;
      llv localllv = this.V;
      String str1 = this.g;
      long l = this.i;
      localdzn.removeAllViews();
      localdzn.e = 0;
      localdzn.b = localllv;
      if (localdzn.b != null)
      {
        if (TextUtils.isEmpty(localdzn.b.e)) {
          break label693;
        }
        bool1 = true;
        localdzn.c = bool1;
        localdzn.d = l;
        j = localdzn.b.b.size();
        if ((j != 0) && (!localdzn.c)) {
          break label699;
        }
        if (!localdzn.c) {
          break label1179;
        }
        localdzn.l.s = 1;
        localdzn.l.b(1);
        localdzn.addView(localdzn.l);
        localdzn.addView(localdzn.j);
        if ((!localdzn.b()) || (!localdzn.b.j)) {
          break label897;
        }
        if (localdzn.b.g != 0) {
          break label869;
        }
        i4 = 1;
        if (i4 == 0) {
          break label875;
        }
        localdzn.o.setText(localdzn.getContext().getString(aau.dd));
        localdzn.addView(localdzn.o);
        localdzn.o.setBackgroundColor(localdzn.a.L);
        localdzn.o.setPadding(localdzn.a.M, localdzn.a.P, localdzn.a.M, localdzn.a.P);
        localdzn.m = ((int)Math.ceil(i / 1.77D));
        localdzn.n = i;
        Context localContext2 = localdzn.getContext();
        if (localdzn.c) {
          break label954;
        }
        str4 = "";
        localdzn.k = ipf.a(localContext2, str4, ipm.a);
        if (!localdzn.b()) {
          break label1160;
        }
        str5 = String.valueOf(efj.j("https://plus.google.com/hangouts/onair/watch?hl=%locale%&d=r&hid="));
        String str6 = String.valueOf(localdzn.b.h);
        if (str6.length() == 0) {
          break label1146;
        }
        str7 = str5.concat(str6);
        localdzn.f = str7;
        if (localdzn.c) {
          break label1206;
        }
        localdzn.setBackgroundColor(-16777216);
        localdzo = localdzn.g;
        localdzo.b = localdzn.b;
        if (TextUtils.isEmpty(localdzo.b.e)) {
          break label1215;
        }
        bool2 = true;
        localdzo.c = bool2;
        localdzo.d = str1;
        Context localContext1 = localdzo.getContext();
        localResources = localdzo.getResources();
        if (TextUtils.isEmpty(localdzo.b.f)) {
          break label1221;
        }
        localdzo.e = localdzo.b.f;
        if (!localdzo.c) {
          break label1302;
        }
        n = efj.yH;
        localdzo.f.setTextAppearance(localContext1, n);
        localdzo.f.setText(localdzo.e);
        localdzo.f.setContentDescription(localdzo.e);
        localdzo.i.setTextAppearance(localContext1, efj.ys);
        if (!localdzo.c) {
          break label1310;
        }
        i1 = aau.df;
        label606:
        localdzo.h = localResources.getString(i1);
        localdzo.i.setText(localdzo.h);
        localdzo.i.setContentDescription(localdzo.h);
        if (!localdzo.c) {
          break label1318;
        }
      }
    }
    label897:
    label1160:
    label1179:
    label1310:
    label1318:
    for (Bitmap localBitmap = localdzo.a.I;; localBitmap = localdzo.a.H)
    {
      localdzo.g = localBitmap;
      efj.i(localdzo);
      localdzn.addView(localdzn.g);
      this.a.p = this;
      return;
      label693:
      bool1 = false;
      break;
      label699:
      localdzn.h.clear();
      localdzn.e = 0;
      localdzn.e = Math.min(Math.min(localdzn.a.K, j), i / (efj.r(localdzn.getContext(), 2) + localdzn.a.G));
      ArrayList localArrayList1 = localdzn.b.b;
      ArrayList localArrayList2 = localdzn.b.d;
      for (int i5 = 0; i5 < localdzn.e; i5++)
      {
        AvatarView localAvatarView = new AvatarView(localdzn.getContext());
        localAvatarView.setOnClickListener(localdzn);
        localAvatarView.a(2);
        localAvatarView.a((String)localArrayList1.get(i5), (String)localArrayList2.get(i5));
        localAvatarView.b();
        localdzn.h.add(localAvatarView);
        localdzn.addView(localAvatarView);
      }
      break label141;
      label869:
      i4 = 0;
      break label220;
      label875:
      localdzn.o.setText(localdzn.getContext().getString(aau.dc));
      break label244;
      if (localdzn.b.g == 0) {}
      for (int i2 = 1;; i2 = 0)
      {
        if (i2 == 0) {
          break label952;
        }
        localdzn.o.setText(localdzn.getContext().getString(aau.de));
        localdzn.addView(localdzn.o);
        break;
      }
      label952:
      break label254;
      label954:
      int i3 = (int)Math.floor((localdzn.d - 10000L) / 300000L);
      if (i3 > 4571423)
      {
        String str8 = String.valueOf("https://i1.ytimg.com/vi/");
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = localdzn.b.e;
        arrayOfObject3[1] = Integer.valueOf(i3);
        String str9 = String.valueOf(String.format("%s/wide_360p_v%s.jpg", arrayOfObject3));
        if (str9.length() != 0)
        {
          str4 = str8.concat(str9);
          break label353;
        }
        str4 = new String(str8);
        break label353;
      }
      String str2 = String.valueOf("https://i1.ytimg.com/vi/");
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = localdzn.b.e;
      arrayOfObject2[1] = Integer.valueOf(i3);
      String str3 = String.valueOf(String.format("%s/sddefault_v%s.jpg", arrayOfObject2));
      if (str3.length() != 0)
      {
        str4 = str2.concat(str3);
        break label353;
      }
      str4 = new String(str2);
      break label353;
      label1146:
      str7 = new String(str5);
      break label417;
      localdzn.f = efj.A(localdzn.b.e);
      break label424;
      if (!TextUtils.isEmpty(localdzn.b.e)) {
        break label424;
      }
      localdzn.addView(localdzn.i);
      break label424;
      label1206:
      localdzn.setBackgroundColor(0);
      break label440;
      label1215:
      bool2 = false;
      break label474;
      label1221:
      int k;
      if (localdzo.b.g == 0)
      {
        k = 1;
        label1235:
        if (k == 0) {
          break label1294;
        }
      }
      for (int m = aau.dh;; m = aau.di)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localdzo.a.a.a(localdzo.d);
        localdzo.e = localResources.getString(m, arrayOfObject1);
        break;
        k = 0;
        break label1235;
      }
      n = efj.yN;
      break label542;
      i1 = aau.da;
      break label606;
    }
  }
  
  public final boolean f()
  {
    return this.R == 0;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.a.layout(this.B, this.b, this.B + this.a.getMeasuredWidth(), this.b + this.a.getMeasuredHeight());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dxi
 * JD-Core Version:    0.7.0.1
 */