import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class kdx
  extends ket
  implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, kfl
{
  private AlertDialog.Builder a;
  private CharSequence b;
  private Drawable c;
  private Dialog d;
  private int e;
  public CharSequence h;
  CharSequence i;
  CharSequence j;
  public int k;
  
  public kdx(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, efj.Uj);
  }
  
  public kdx(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, kfu.h, paramInt, 0);
    this.h = localTypedArray.getString(kfu.l);
    if (this.h == null) {
      this.h = this.r;
    }
    this.b = localTypedArray.getString(kfu.k);
    this.c = localTypedArray.getDrawable(kfu.i);
    this.i = localTypedArray.getString(kfu.n);
    this.j = localTypedArray.getString(kfu.m);
    this.k = localTypedArray.getResourceId(kfu.j, this.k);
    localTypedArray.recycle();
  }
  
  public Parcelable a()
  {
    Parcelable localParcelable = super.a();
    if ((this.d == null) || (!this.d.isShowing())) {
      return localParcelable;
    }
    kdy localkdy = new kdy(localParcelable);
    localkdy.a = true;
    localkdy.b = this.d.onSaveInstanceState();
    return localkdy;
  }
  
  public void a(AlertDialog.Builder paramBuilder) {}
  
  public final void a(Bundle paramBundle)
  {
    Context localContext = this.l;
    this.e = -2;
    this.a = new AlertDialog.Builder(localContext).setTitle(this.h).setIcon(this.c).setPositiveButton(this.i, this).setNegativeButton(this.j, this);
    int m = this.k;
    View localView = null;
    if (m == 0) {}
    for (;;)
    {
      if (localView != null)
      {
        b(localView);
        this.a.setView(localView);
        a(this.a);
      }
      synchronized (this.m)
      {
        if (???.e == null) {
          ???.e = new ArrayList();
        }
        if (!???.e.contains(this)) {
          ???.e.add(this);
        }
        AlertDialog localAlertDialog = this.a.create();
        this.d = localAlertDialog;
        if (paramBundle != null) {
          localAlertDialog.onRestoreInstanceState(paramBundle);
        }
        if (at_()) {
          localAlertDialog.getWindow().setSoftInputMode(5);
        }
        localAlertDialog.setOnDismissListener(this);
        localAlertDialog.show();
        return;
        localView = LayoutInflater.from(this.a.getContext()).inflate(this.k, null);
        continue;
        this.a.setMessage(this.b);
      }
    }
  }
  
  public void a(Parcelable paramParcelable)
  {
    if ((paramParcelable == null) || (!paramParcelable.getClass().equals(kdy.class))) {
      super.a(paramParcelable);
    }
    kdy localkdy;
    do
    {
      return;
      localkdy = (kdy)paramParcelable;
      super.a(localkdy.getSuperState());
    } while (!localkdy.a);
    a(localkdy.b);
  }
  
  public void a(boolean paramBoolean) {}
  
  protected boolean at_()
  {
    return false;
  }
  
  protected final void b()
  {
    if ((this.d != null) && (this.d.isShowing())) {
      return;
    }
    a(null);
  }
  
  protected void b(View paramView)
  {
    View localView = paramView.findViewById(da.V);
    if (localView != null)
    {
      CharSequence localCharSequence = this.b;
      int m = 8;
      if (!TextUtils.isEmpty(localCharSequence))
      {
        if ((localView instanceof TextView)) {
          ((TextView)localView).setText(localCharSequence);
        }
        m = 0;
      }
      if (localView.getVisibility() != m) {
        localView.setVisibility(m);
      }
    }
  }
  
  public final void d()
  {
    if ((this.d == null) || (!this.d.isShowing())) {
      return;
    }
    this.d.dismiss();
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.e = paramInt;
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    for (;;)
    {
      synchronized (this.m)
      {
        if (???.e != null) {
          ???.e.remove(this);
        }
        this.d = null;
        if (this.e == -1)
        {
          bool = true;
          a(bool);
          return;
        }
      }
      boolean bool = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kdx
 * JD-Core Version:    0.7.0.1
 */