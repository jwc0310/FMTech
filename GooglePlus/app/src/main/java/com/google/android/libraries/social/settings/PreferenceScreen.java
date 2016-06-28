package com.google.android.libraries.social.settings;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.common.proguard.UsedByReflection;
import efj;
import java.util.ArrayList;
import java.util.List;
import ket;
import key;
import kfg;
import kfh;
import kfk;
import kfn;
import kfq;

@UsedByReflection
public final class PreferenceScreen
  extends kfg
  implements DialogInterface.OnDismissListener, AdapterView.OnItemClickListener
{
  private ListAdapter b;
  private Dialog c;
  
  @UsedByReflection
  public PreferenceScreen(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, efj.Um);
  }
  
  private final void a(Bundle paramBundle)
  {
    Context localContext = this.l;
    ListView localListView = new ListView(localContext);
    a(localListView);
    CharSequence localCharSequence = this.r;
    int i;
    if (TextUtils.isEmpty(localCharSequence)) {
      i = 16973830;
    }
    for (;;)
    {
      Dialog localDialog = new Dialog(localContext, i);
      this.c = localDialog;
      localDialog.setContentView(localListView);
      if (!TextUtils.isEmpty(localCharSequence)) {
        localDialog.setTitle(localCharSequence);
      }
      localDialog.setOnDismissListener(this);
      if (paramBundle != null) {
        localDialog.onRestoreInstanceState(paramBundle);
      }
      synchronized (this.m)
      {
        if (???.f == null) {
          ???.f = new ArrayList();
        }
        ???.f.add(localDialog);
        localDialog.show();
        return;
        i = 16973829;
      }
    }
  }
  
  private ListAdapter l()
  {
    if (this.b == null) {
      this.b = new kfh(this);
    }
    return this.b;
  }
  
  protected final Parcelable a()
  {
    Parcelable localParcelable = super.a();
    Dialog localDialog = this.c;
    if ((localDialog == null) || (!localDialog.isShowing())) {
      return localParcelable;
    }
    kfq localkfq = new kfq(localParcelable);
    localkfq.a = true;
    localkfq.b = localDialog.onSaveInstanceState();
    return localkfq;
  }
  
  protected final void a(Parcelable paramParcelable)
  {
    if ((paramParcelable == null) || (!paramParcelable.getClass().equals(kfq.class))) {
      super.a(paramParcelable);
    }
    kfq localkfq;
    do
    {
      return;
      localkfq = (kfq)paramParcelable;
      super.a(localkfq.getSuperState());
    } while (!localkfq.a);
    a(localkfq.b);
  }
  
  public final void a(ListView paramListView)
  {
    paramListView.setOnItemClickListener(this);
    paramListView.setAdapter(l());
    i();
  }
  
  protected final void b()
  {
    if ((this.t != null) || (this.a.size() == 0)) {
      return;
    }
    a(null);
  }
  
  protected final boolean k()
  {
    return false;
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    this.c = null;
    synchronized (this.m)
    {
      if (???.f == null) {
        return;
      }
      ???.f.remove(paramDialogInterface);
      return;
    }
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object localObject = l().getItem(paramInt);
    if (!(localObject instanceof ket)) {}
    ket localket;
    do
    {
      kfn localkfn;
      do
      {
        do
        {
          do
          {
            return;
            localket = (ket)localObject;
          } while (!localket.c());
          localket.b();
        } while ((localket.p != null) && (localket.p.a(localket)));
        kfk localkfk = localket.m;
        if (localkfk == null) {
          break;
        }
        localkfn = localkfk.g;
      } while ((this != null) && (localkfn != null) && (localkfn.a(localket)));
    } while (localket.t == null);
    localket.l.startActivity(localket.t);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.settings.PreferenceScreen
 * JD-Core Version:    0.7.0.1
 */