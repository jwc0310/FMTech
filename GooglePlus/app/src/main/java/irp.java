import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class irp
  implements mes, mfa, mfd
{
  public ArrayList<ipa> a = new ArrayList();
  public ArrayList<irq> b = new ArrayList();
  public int c = 1;
  public String d;
  public String e;
  public String f;
  public String g;
  public String h;
  private final Activity i;
  
  public irp(Activity paramActivity, mek parammek)
  {
    this.i = paramActivity;
    parammek.a(this);
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      Intent localIntent = this.i.getIntent();
      if (localIntent.hasExtra("target_media_id"))
      {
        if (localIntent.hasExtra("target_album_id")) {
          this.e = localIntent.getStringExtra("target_album_id");
        }
        this.f = localIntent.getStringExtra("target_media_id");
      }
      if (localIntent.hasExtra("album_owner_id")) {
        this.g = localIntent.getStringExtra("album_owner_id");
      }
      Activity localActivity;
      Parcelable localParcelable1;
      if (localIntent.hasExtra("android.intent.extra.STREAM"))
      {
        localActivity = this.i;
        if ("android.intent.action.SEND_MULTIPLE".equals(localIntent.getAction()))
        {
          Iterator localIterator = localIntent.getExtras().getParcelableArrayList("android.intent.extra.STREAM").iterator();
          while (localIterator.hasNext())
          {
            Parcelable localParcelable2 = (Parcelable)localIterator.next();
            if ((localParcelable2 instanceof ipa))
            {
              this.a.add((ipa)localParcelable2);
            }
            else if ((localParcelable2 instanceof Uri))
            {
              irn localirn2 = irn.a(localActivity, (Uri)localParcelable2);
              if (localirn2 != null) {
                this.a.add(localirn2);
              }
            }
          }
        }
        localParcelable1 = localIntent.getExtras().getParcelable("android.intent.extra.STREAM");
        if (!(localParcelable1 instanceof ipa)) {
          break label244;
        }
        this.a.add((ipa)localParcelable1);
      }
      for (;;)
      {
        if (localIntent.hasExtra("cluster_id")) {
          this.h = localIntent.getStringExtra("cluster_id");
        }
        return;
        label244:
        if ((localParcelable1 instanceof Uri))
        {
          irn localirn1 = irn.a(localActivity, (Uri)localParcelable1);
          if (localirn1 != null) {
            this.a.add(localirn1);
          }
        }
      }
    }
    this.a = paramBundle.getParcelableArrayList("selected");
    this.c = paramBundle.getInt("mode");
    this.d = paramBundle.getString("album");
    this.e = paramBundle.getString("target_album_id");
    this.f = paramBundle.getString("target_media_id");
    this.g = paramBundle.getString("album_owner_id");
    this.h = paramBundle.getString("cluster_id");
  }
  
  public final void a(ipa paramipa, Object paramObject)
  {
    c();
    this.a.remove(paramipa);
    this.a.add(paramipa);
    a(paramObject);
  }
  
  public final void a(Object paramObject)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext()) {
      ((irq)localIterator.next()).a(this.a, paramObject);
    }
  }
  
  public final void a(String paramString, Object paramObject)
  {
    if (TextUtils.equals(paramString, this.d)) {}
    for (;;)
    {
      return;
      this.d = paramString;
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext()) {
        ((irq)localIterator.next()).aJ_();
      }
    }
  }
  
  public final void a(List<ipa> paramList, Object paramObject)
  {
    c();
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        ipa localipa = (ipa)localIterator.next();
        this.a.remove(localipa);
        this.a.add(localipa);
      }
      a(paramObject);
    }
  }
  
  public final boolean a()
  {
    if (!this.a.isEmpty()) {}
    for (int j = 1; (j == 0) && (!b()); j = 0) {
      return true;
    }
    return false;
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putParcelableArrayList("selected", this.a);
    paramBundle.putInt("mode", this.c);
    paramBundle.putString("album", this.d);
    paramBundle.putString("target_album_id", this.e);
    paramBundle.putString("target_media_id", this.f);
    paramBundle.putString("album_owner_id", this.g);
    paramBundle.putString("cluster_id", this.h);
  }
  
  public final void b(ipa paramipa, Object paramObject)
  {
    c();
    if (this.a.remove(paramipa)) {
      a(paramObject);
    }
  }
  
  public final boolean b()
  {
    return (!TextUtils.isEmpty(this.h)) || (!TextUtils.isEmpty(this.e)) || (!TextUtils.isEmpty(this.f));
  }
  
  public final void c()
  {
    if (b()) {
      throw new IllegalStateException("MediaModel is read only, cannot modify.");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     irp
 * JD-Core Version:    0.7.0.1
 */