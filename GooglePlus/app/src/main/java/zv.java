import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class zv
{
  public static final boolean a;
  private static final PorterDuff.Mode b;
  private static final WeakHashMap<Context, zv> c;
  private static final kq d;
  private static final int[] e;
  private static final int[] f;
  private static final int[] g;
  private static final int[] h;
  private static final int[] i;
  private static final int[] j;
  private final WeakReference<Context> k;
  private SparseArray<ColorStateList> l;
  private ColorStateList m;
  
  static
  {
    if (Build.VERSION.SDK_INT < 21) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      b = PorterDuff.Mode.SRC_IN;
      c = new WeakHashMap();
      d = new kq(6, (byte)0);
      int[] arrayOfInt1 = new int[3];
      arrayOfInt1[0] = efj.Z;
      arrayOfInt1[1] = efj.X;
      arrayOfInt1[2] = efj.q;
      e = arrayOfInt1;
      int[] arrayOfInt2 = new int[12];
      arrayOfInt2[0] = efj.A;
      arrayOfInt2[1] = efj.D;
      arrayOfInt2[2] = efj.K;
      arrayOfInt2[3] = efj.C;
      arrayOfInt2[4] = efj.B;
      arrayOfInt2[5] = efj.J;
      arrayOfInt2[6] = efj.E;
      arrayOfInt2[7] = efj.F;
      arrayOfInt2[8] = efj.I;
      arrayOfInt2[9] = efj.H;
      arrayOfInt2[10] = efj.G;
      arrayOfInt2[11] = efj.L;
      f = arrayOfInt2;
      int[] arrayOfInt3 = new int[4];
      arrayOfInt3[0] = efj.W;
      arrayOfInt3[1] = efj.Y;
      arrayOfInt3[2] = efj.y;
      arrayOfInt3[3] = efj.V;
      g = arrayOfInt3;
      int[] arrayOfInt4 = new int[3];
      arrayOfInt4[0] = efj.O;
      arrayOfInt4[1] = efj.w;
      arrayOfInt4[2] = efj.N;
      h = arrayOfInt4;
      int[] arrayOfInt5 = new int[10];
      arrayOfInt5[0] = efj.z;
      arrayOfInt5[1] = efj.U;
      arrayOfInt5[2] = efj.aa;
      arrayOfInt5[3] = efj.Q;
      arrayOfInt5[4] = efj.R;
      arrayOfInt5[5] = efj.P;
      arrayOfInt5[6] = efj.T;
      arrayOfInt5[7] = efj.S;
      arrayOfInt5[8] = efj.u;
      arrayOfInt5[9] = efj.r;
      i = arrayOfInt5;
      int[] arrayOfInt6 = new int[2];
      arrayOfInt6[0] = efj.s;
      arrayOfInt6[1] = efj.v;
      j = arrayOfInt6;
      return;
    }
  }
  
  private zv(Context paramContext)
  {
    this.k = new WeakReference(paramContext);
  }
  
  private static PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode)
  {
    PorterDuffColorFilter localPorterDuffColorFilter = d.a(paramInt, paramMode);
    if (localPorterDuffColorFilter == null)
    {
      localPorterDuffColorFilter = new PorterDuffColorFilter(paramInt, paramMode);
      d.a(paramInt, paramMode, localPorterDuffColorFilter);
    }
    return localPorterDuffColorFilter;
  }
  
  public static Drawable a(Context paramContext, int paramInt)
  {
    if ((a(f, paramInt)) || (a(e, paramInt)) || (a(g, paramInt)) || (a(i, paramInt)) || (a(h, paramInt)) || (a(j, paramInt)) || (paramInt == efj.x)) {}
    for (int n = 1; n != 0; n = 0) {
      return a(paramContext).a(paramInt, false);
    }
    return fo.a(paramContext, paramInt);
  }
  
  public static zv a(Context paramContext)
  {
    zv localzv = (zv)c.get(paramContext);
    if (localzv == null)
    {
      localzv = new zv(paramContext);
      c.put(paramContext, localzv);
    }
    return localzv;
  }
  
  public static void a(View paramView, zu paramzu)
  {
    Drawable localDrawable = paramView.getBackground();
    ColorStateList localColorStateList;
    PorterDuff.Mode localMode;
    label44:
    int[] arrayOfInt;
    Object localObject;
    if ((paramzu.d) || (paramzu.c)) {
      if (paramzu.d)
      {
        localColorStateList = paramzu.a;
        if (!paramzu.c) {
          break label89;
        }
        localMode = paramzu.b;
        arrayOfInt = paramView.getDrawableState();
        localObject = null;
        if (localColorStateList != null)
        {
          localObject = null;
          if (localMode != null) {
            break label97;
          }
        }
        label65:
        localDrawable.setColorFilter((ColorFilter)localObject);
      }
    }
    for (;;)
    {
      if (Build.VERSION.SDK_INT <= 10) {
        paramView.invalidate();
      }
      return;
      localColorStateList = null;
      break;
      label89:
      localMode = b;
      break label44;
      label97:
      localObject = a(localColorStateList.getColorForState(arrayOfInt, 0), localMode);
      break label65;
      localDrawable.clearColorFilter();
    }
  }
  
  private static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    int n = paramArrayOfInt.length;
    for (int i1 = 0;; i1++)
    {
      boolean bool = false;
      if (i1 < n)
      {
        if (paramArrayOfInt[i1] == paramInt) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  private static ColorStateList b(Context paramContext, int paramInt)
  {
    int[][] arrayOfInt = new int[4][];
    int[] arrayOfInt1 = new int[4];
    int n = zr.a(paramContext, paramInt);
    int i1 = zr.a(paramContext, aau.N);
    arrayOfInt[0] = zr.a;
    arrayOfInt1[0] = zr.c(paramContext, aau.L);
    arrayOfInt[1] = zr.d;
    arrayOfInt1[1] = efj.a(i1, n);
    arrayOfInt[2] = zr.b;
    arrayOfInt1[2] = efj.a(i1, n);
    arrayOfInt[3] = zr.h;
    arrayOfInt1[3] = n;
    return new ColorStateList(arrayOfInt, arrayOfInt1);
  }
  
  public final ColorStateList a(int paramInt)
  {
    Context localContext = (Context)this.k.get();
    Object localObject;
    if (localContext == null) {
      localObject = null;
    }
    ColorStateList localColorStateList1;
    label170:
    label862:
    for (;;)
    {
      return localObject;
      if (this.l != null)
      {
        localColorStateList1 = (ColorStateList)this.l.get(paramInt);
        if (localColorStateList1 != null) {
          break;
        }
        if (paramInt != efj.z) {
          break label170;
        }
        int[][] arrayOfInt11 = new int[3][];
        int[] arrayOfInt12 = new int[3];
        arrayOfInt11[0] = zr.a;
        arrayOfInt12[0] = zr.c(localContext, aau.O);
        arrayOfInt11[1] = zr.g;
        arrayOfInt12[1] = zr.a(localContext, aau.O);
        arrayOfInt11[2] = zr.h;
        arrayOfInt12[2] = zr.a(localContext, aau.M);
        localObject = new ColorStateList(arrayOfInt11, arrayOfInt12);
      }
      for (;;)
      {
        if (localObject == null) {
          break label862;
        }
        if (this.l == null) {
          this.l = new SparseArray();
        }
        this.l.append(paramInt, localObject);
        return localObject;
        localColorStateList1 = null;
        break;
        if (paramInt == efj.T)
        {
          int[][] arrayOfInt9 = new int[3][];
          int[] arrayOfInt10 = new int[3];
          arrayOfInt9[0] = zr.a;
          arrayOfInt10[0] = zr.a(localContext, 16842800, 0.1F);
          arrayOfInt9[1] = zr.e;
          arrayOfInt10[1] = zr.a(localContext, aau.M, 0.3F);
          arrayOfInt9[2] = zr.h;
          arrayOfInt10[2] = zr.a(localContext, 16842800, 0.3F);
          localObject = new ColorStateList(arrayOfInt9, arrayOfInt10);
        }
        else
        {
          if (paramInt == efj.S)
          {
            int[][] arrayOfInt7 = new int[3][];
            int[] arrayOfInt8 = new int[3];
            ColorStateList localColorStateList2 = zr.b(localContext, aau.P);
            if ((localColorStateList2 != null) && (localColorStateList2.isStateful()))
            {
              arrayOfInt7[0] = zr.a;
              arrayOfInt8[0] = localColorStateList2.getColorForState(arrayOfInt7[0], 0);
              arrayOfInt7[1] = zr.e;
              arrayOfInt8[1] = zr.a(localContext, aau.M);
              arrayOfInt7[2] = zr.h;
              arrayOfInt8[2] = localColorStateList2.getDefaultColor();
            }
            for (;;)
            {
              localObject = new ColorStateList(arrayOfInt7, arrayOfInt8);
              break;
              arrayOfInt7[0] = zr.a;
              arrayOfInt8[0] = zr.c(localContext, aau.P);
              arrayOfInt7[1] = zr.e;
              arrayOfInt8[1] = zr.a(localContext, aau.M);
              arrayOfInt7[2] = zr.h;
              arrayOfInt8[2] = zr.a(localContext, aau.P);
            }
          }
          if ((paramInt == efj.u) || (paramInt == efj.r))
          {
            localObject = b(localContext, aau.L);
          }
          else if (paramInt == efj.t)
          {
            localObject = b(localContext, aau.K);
          }
          else if ((paramInt == efj.Q) || (paramInt == efj.R))
          {
            int[][] arrayOfInt1 = new int[3][];
            int[] arrayOfInt2 = new int[3];
            arrayOfInt1[0] = zr.a;
            arrayOfInt2[0] = zr.c(localContext, aau.O);
            arrayOfInt1[1] = zr.g;
            arrayOfInt2[1] = zr.a(localContext, aau.O);
            arrayOfInt1[2] = zr.h;
            arrayOfInt2[2] = zr.a(localContext, aau.M);
            localObject = new ColorStateList(arrayOfInt1, arrayOfInt2);
          }
          else if (a(f, paramInt))
          {
            localObject = zr.b(localContext, aau.O);
          }
          else if (a(i, paramInt))
          {
            if (this.m == null)
            {
              int n = zr.a(localContext, aau.O);
              int i1 = zr.a(localContext, aau.M);
              int[][] arrayOfInt5 = new int[7][];
              int[] arrayOfInt6 = new int[7];
              arrayOfInt5[0] = zr.a;
              arrayOfInt6[0] = zr.c(localContext, aau.O);
              arrayOfInt5[1] = zr.b;
              arrayOfInt6[1] = i1;
              arrayOfInt5[2] = zr.c;
              arrayOfInt6[2] = i1;
              arrayOfInt5[3] = zr.d;
              arrayOfInt6[3] = i1;
              arrayOfInt5[4] = zr.e;
              arrayOfInt6[4] = i1;
              arrayOfInt5[5] = zr.f;
              arrayOfInt6[5] = i1;
              arrayOfInt5[6] = zr.h;
              arrayOfInt6[6] = n;
              this.m = new ColorStateList(arrayOfInt5, arrayOfInt6);
            }
            localObject = this.m;
          }
          else if (a(j, paramInt))
          {
            int[][] arrayOfInt3 = new int[3][];
            int[] arrayOfInt4 = new int[3];
            arrayOfInt3[0] = zr.a;
            arrayOfInt4[0] = zr.c(localContext, aau.O);
            arrayOfInt3[1] = zr.e;
            arrayOfInt4[1] = zr.a(localContext, aau.M);
            arrayOfInt3[2] = zr.h;
            arrayOfInt4[2] = zr.a(localContext, aau.O);
            localObject = new ColorStateList(arrayOfInt3, arrayOfInt4);
          }
          else
          {
            localObject = localColorStateList1;
          }
        }
      }
    }
    return localColorStateList1;
  }
  
  public final Drawable a(int paramInt, boolean paramBoolean)
  {
    Context localContext = (Context)this.k.get();
    if (localContext == null) {
      return null;
    }
    Drawable localDrawable = fo.a(localContext, paramInt);
    if (localDrawable != null)
    {
      if (Build.VERSION.SDK_INT >= 8) {
        localDrawable = localDrawable.mutate();
      }
      ColorStateList localColorStateList = a(paramInt);
      if (localColorStateList == null) {
        break label113;
      }
      localDrawable = gl.a.c(localDrawable);
      gl.a.a(localDrawable, localColorStateList);
      int n = efj.S;
      PorterDuff.Mode localMode = null;
      if (paramInt == n) {
        localMode = PorterDuff.Mode.MULTIPLY;
      }
      if (localMode != null) {
        gl.a.a(localDrawable, localMode);
      }
    }
    for (;;)
    {
      return localDrawable;
      label113:
      if (paramInt == efj.x)
      {
        Drawable[] arrayOfDrawable = new Drawable[2];
        arrayOfDrawable[0] = a(efj.w, false);
        arrayOfDrawable[1] = a(efj.y, false);
        return new LayerDrawable(arrayOfDrawable);
      }
      if ((!a(paramInt, localDrawable)) && (paramBoolean)) {
        localDrawable = null;
      }
    }
  }
  
  public final boolean a(int paramInt, Drawable paramDrawable)
  {
    Context localContext = (Context)this.k.get();
    if (localContext == null) {
      return false;
    }
    PorterDuff.Mode localMode1 = b;
    int i1;
    Object localObject;
    int i2;
    int n;
    if (a(e, paramInt))
    {
      i1 = aau.O;
      localObject = localMode1;
      i2 = 1;
      n = -1;
    }
    for (;;)
    {
      if (i2 != 0)
      {
        paramDrawable.setColorFilter(a(zr.a(localContext, i1), (PorterDuff.Mode)localObject));
        if (n != -1) {
          paramDrawable.setAlpha(n);
        }
        return true;
        if (a(g, paramInt))
        {
          i1 = aau.M;
          localObject = localMode1;
          i2 = 1;
          n = -1;
          continue;
        }
        if (a(h, paramInt))
        {
          PorterDuff.Mode localMode2 = PorterDuff.Mode.MULTIPLY;
          i2 = 1;
          localObject = localMode2;
          i1 = 16842801;
          n = -1;
          continue;
        }
        if (paramInt == efj.M)
        {
          i1 = 16842800;
          n = Math.round(40.799999F);
          localObject = localMode1;
          i2 = 1;
        }
      }
      else
      {
        return false;
      }
      n = -1;
      localObject = localMode1;
      i1 = 0;
      i2 = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     zv
 * JD-Core Version:    0.7.0.1
 */