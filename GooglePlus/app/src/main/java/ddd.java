import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class ddd
  extends hqf
{
  private static boolean b;
  private static Drawable c;
  private static Drawable d;
  private static Drawable e;
  private static Drawable f;
  private static Drawable g;
  private static Drawable h;
  private static Drawable i;
  private static Drawable j;
  public final lb<View.OnClickListener> a;
  private final lb<Cursor> k;
  private final lb<gnm> l;
  
  public ddd(Context paramContext)
  {
    super(paramContext);
    for (int m = 2; m >= 0; m--)
    {
      hqg localhqg = new hqg(false, false);
      if (this.aO >= this.aN.length)
      {
        hqg[] arrayOfhqg2 = new hqg[2 + this.aO];
        System.arraycopy(this.aN, 0, arrayOfhqg2, 0, this.aO);
        this.aN = arrayOfhqg2;
      }
      hqg[] arrayOfhqg1 = this.aN;
      int n = this.aO;
      this.aO = (n + 1);
      arrayOfhqg1[n] = localhqg;
      this.aP = false;
      notifyDataSetChanged();
    }
    if (!b)
    {
      Resources localResources = paramContext.getResources();
      Drawable localDrawable = localResources.getDrawable(efj.rz);
      c = localDrawable;
      localDrawable.setColorFilter(localResources.getColor(efj.jX), PorterDuff.Mode.MULTIPLY);
      d = localResources.getDrawable(efj.qP);
      f = localResources.getDrawable(efj.qR);
      g = localResources.getDrawable(efj.qS);
      h = localResources.getDrawable(efj.qQ);
      i = localResources.getDrawable(efj.qO);
      e = localResources.getDrawable(((bot)mbb.a(paramContext, bot.class)).c());
      int i1 = (int)this.aM.getResources().getDimension(efj.mm);
      int i2 = (int)this.aM.getResources().getDimension(efj.mn);
      bfq localbfq = new bfq();
      String str = localResources.getString(aau.kV);
      TextPaint localTextPaint = efj.B(this.aM, efj.yG);
      localbfq.a = str;
      localbfq.b = localTextPaint;
      localbfq.c = i1;
      localbfq.d = i2;
      localbfq.e = ((NinePatchDrawable)this.aM.getResources().getDrawable(efj.oA));
      j = localbfq;
      b = true;
    }
    this.a = new lb(3);
    this.k = new lb(3);
    this.l = new lb();
    Iterator localIterator = mbb.c(this.aM, gnm.class).iterator();
    while (localIterator.hasNext())
    {
      gnm localgnm = (gnm)localIterator.next();
      this.l.a(localgnm.a(), localgnm);
    }
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    ViewGroup localViewGroup1 = (ViewGroup)LayoutInflater.from(this.aM).inflate(efj.uF, paramViewGroup, false);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -2, 1.0F);
    localLayoutParams.gravity = 17;
    ViewGroup localViewGroup2 = (ViewGroup)localViewGroup1.findViewById(aaw.gQ);
    for (int m = 2; m >= 0; m--)
    {
      dxm localdxm = new dxm(this.aM);
      localdxm.setLayoutParams(localLayoutParams);
      localViewGroup2.addView(localdxm);
    }
    return localViewGroup1;
  }
  
  public final void a(int paramInt, Cursor paramCursor)
  {
    this.k.a(paramInt, paramCursor);
    if (paramCursor != null)
    {
      hqr localhqr = new hqr(dde.a);
      Object[] arrayOfObject = new Object[dde.a.length];
      int m = paramCursor.getCount();
      int n = 0;
      int i1 = 0;
      if (i1 < m)
      {
        Arrays.fill(arrayOfObject, null);
        arrayOfObject[0] = Integer.valueOf(n);
        arrayOfObject[1] = Integer.valueOf(i1);
        if (i1 + 3 > m) {}
        for (int i2 = 1;; i2 = 0)
        {
          arrayOfObject[2] = Integer.valueOf(i2);
          localhqr.a(arrayOfObject);
          int i3 = n + 1;
          i1 += 3;
          n = i3;
          break;
        }
      }
      paramCursor = localhqr;
    }
    super.a(paramInt, paramCursor);
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    int m = paramCursor.getInt(1);
    Cursor localCursor = (Cursor)this.k.a(paramInt1);
    localCursor.moveToPosition(m);
    ViewGroup localViewGroup = (ViewGroup)paramView.findViewById(aaw.gQ);
    localViewGroup.setVisibility(0);
    int n = Math.min(3, localCursor.getCount() - m);
    int i1 = 0;
    if (i1 < n)
    {
      dxm localdxm = (dxm)localViewGroup.getChildAt(i1);
      localdxm.setVisibility(0);
      localdxm.setClickable(true);
      switch (paramInt1)
      {
      }
      for (;;)
      {
        localdxm.setOnClickListener((View.OnClickListener)this.a.a(paramInt1));
        localdxm.setClickable(true);
        localCursor.moveToNext();
        i1++;
        break;
        String str2 = localCursor.getString(1);
        byte[] arrayOfByte2 = localCursor.getBlob(2);
        Parcel localParcel = Parcel.obtain();
        localParcel.unmarshall(arrayOfByte2, 0, arrayOfByte2.length);
        localParcel.setDataPosition(0);
        Intent localIntent = (Intent)Intent.CREATOR.createFromParcel(localParcel);
        localdxm.setTag(aaw.kZ, localIntent);
        ResolveInfo localResolveInfo = (ResolveInfo)ResolveInfo.CREATOR.createFromParcel(localParcel);
        localdxm.setTag(aaw.lg, localResolveInfo);
        localdxm.a(str2, localResolveInfo.loadIcon(this.aM.getPackageManager()), true);
        continue;
        switch (localCursor.getInt(0))
        {
        }
      }
      String str1 = localCursor.getString(3);
      byte[] arrayOfByte1 = localCursor.getBlob(4);
      Object localObject;
      if (arrayOfByte1 != null)
      {
        gnb localgnb2 = gnl.a(ByteBuffer.wrap(arrayOfByte1));
        localdxm.setTag(aaw.fk, localgnb2);
        switch (localCursor.getInt(2))
        {
        default: 
          localObject = d;
        }
      }
      for (;;)
      {
        localdxm.a(str1, (Drawable)localObject, false);
        break;
        localObject = g;
        continue;
        localObject = f;
        continue;
        localObject = h;
        continue;
        localdxm.setTag(aaw.fk, null);
        int i5 = localCursor.getInt(1);
        if (i5 == 2)
        {
          localdxm.setTag(aaw.fj, Integer.valueOf(1));
          localObject = i;
        }
        else if (this.l.a(i5) != null)
        {
          gnm localgnm = (gnm)this.l.a(i5);
          localdxm.setTag(aaw.fj, Integer.valueOf(localgnm.a()));
          Drawable localDrawable2 = localgnm.c();
          if (localgnm.d())
          {
            Drawable[] arrayOfDrawable = new Drawable[2];
            arrayOfDrawable[0] = localDrawable2;
            arrayOfDrawable[1] = j;
            localObject = new LayerDrawable(arrayOfDrawable);
          }
          else
          {
            localObject = localDrawable2;
          }
        }
        else
        {
          localdxm.setTag(aaw.fj, Integer.valueOf(0));
          localObject = d;
        }
      }
      gnb localgnb1 = gnl.a(ByteBuffer.wrap(localCursor.getBlob(1)));
      localdxm.setTag(aaw.fk, localgnb1);
      Drawable localDrawable1;
      if (localgnb1.c.length > 0) {
        localDrawable1 = d;
      }
      for (;;)
      {
        localdxm.a(localgnb1, localDrawable1);
        break;
        if (localgnb1.d.length > 0) {
          localDrawable1 = c;
        } else if (localgnb1.e.length > 0) {
          localDrawable1 = e;
        } else {
          localDrawable1 = null;
        }
      }
    }
    int i2;
    View localView;
    int i3;
    if ((paramCursor.getInt(2) != 0) || (localCursor.getCount() <= 3))
    {
      i2 = 1;
      localView = paramView.findViewById(aaw.cD);
      if (e_(1) <= 0) {
        break label760;
      }
      i3 = 1;
      label732:
      if ((paramInt1 != i3) || (i2 == 0)) {
        break label766;
      }
    }
    label760:
    label766:
    for (int i4 = 0;; i4 = 8)
    {
      localView.setVisibility(i4);
      return;
      i2 = 0;
      break;
      i3 = 0;
      break label732;
    }
  }
  
  public final boolean hasStableIds()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ddd
 * JD-Core Version:    0.7.0.1
 */