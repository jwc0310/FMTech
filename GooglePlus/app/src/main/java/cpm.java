import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public final class cpm
  extends mca
  implements AdapterView.OnItemClickListener, cw<Cursor>, gpq, gxv, luu
{
  private ListView a;
  private cpr b;
  
  public cpm()
  {
    new gpk(this, this.bp, this);
  }
  
  private final void a(int paramInt)
  {
    coo.a(null, g().getString(paramInt), false, false).a(this.x, "dialog_pending");
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.wF, paramViewGroup, false);
    this.b = new cpr(f());
    this.a = ((ListView)localView.findViewById(16908298));
    this.a.setAdapter(this.b);
    this.a.setOnItemClickListener(this);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new cpq(f(), hbu.b);
  }
  
  @SuppressLint({"InlinedApi"})
  public final void a(int paramInt, Bundle paramBundle, String paramString)
  {
    ArrayList localArrayList = paramBundle.getIntegerArrayList("args_action_list");
    if (localArrayList == null) {}
    while (paramInt >= localArrayList.size()) {
      return;
    }
    int i = paramBundle.getInt("args_account_name");
    String str1 = paramBundle.getString("args_media_url");
    long l1 = paramBundle.getLong("args_media_id");
    int j = paramBundle.getInt("args_upload_reason");
    long l2 = paramBundle.getLong("args_row_id", -1L);
    switch (((Integer)localArrayList.get(paramInt)).intValue())
    {
    default: 
      return;
    case 0: 
      if (Log.isLoggable("iu.UploadStatFragment", 3))
      {
        String str2 = String.valueOf(str1);
        if (str2.length() == 0) {
          break label240;
        }
        "  -- on-demand upload; img: ".concat(str2);
      }
      for (;;)
      {
        ContentValues localContentValues = new ContentValues(5);
        if (l2 >= 0L) {
          localContentValues.put("_id", Long.valueOf(l2));
        }
        localContentValues.put("upload_account_id", Integer.valueOf(i));
        localContentValues.put("media_id", Long.valueOf(l1));
        localContentValues.put("media_url", str1);
        localContentValues.put("upload_reason", Integer.valueOf(j));
        localContentValues.put("upload_state", Integer.valueOf(100));
        this.bn.getContentResolver().insert(hbu.e(this.bn), localContentValues);
        return;
        label240:
        new String("  -- on-demand upload; img: ");
      }
    }
    a(aau.rB);
    if (Build.VERSION.SDK_INT < 11)
    {
      cpo localcpo1 = new cpo(this);
      Long[] arrayOfLong1 = new Long[1];
      arrayOfLong1[0] = Long.valueOf(l2);
      localcpo1.execute(arrayOfLong1);
      return;
    }
    cpo localcpo2 = new cpo(this);
    Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
    Long[] arrayOfLong2 = new Long[1];
    arrayOfLong2[0] = Long.valueOf(l2);
    localcpo2.executeOnExecutor(localExecutor, arrayOfLong2);
  }
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    d(true);
    k().a(0, null, this);
  }
  
  public final void a(Bundle paramBundle, String paramString) {}
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(gpr paramgpr)
  {
    paramgpr.d(aau.pD);
    paramgpr.b(aaw.iv);
    paramgpr.b(aaw.jc);
  }
  
  public final void a(tp paramtp) {}
  
  @SuppressLint({"InlinedApi"})
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == aaw.iv)
    {
      a(aau.rB);
      if (Build.VERSION.SDK_INT < 11) {
        new cpn(this).execute(new String[0]);
      }
    }
    while (i != aaw.jc)
    {
      return false;
      new cpn(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
      return false;
    }
    a(aau.rC);
    if (Build.VERSION.SDK_INT < 11)
    {
      new cpp(this).execute(new Void[0]);
      return false;
    }
    new cpp(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    long l = ((Long)paramView.getTag(aaw.lb)).longValue();
    String str1 = (String)paramView.getTag(aaw.ld);
    int i = ((Integer)paramView.getTag(aaw.lq)).intValue();
    Long localLong = (Long)paramView.getTag(aaw.li);
    if (Log.isLoggable("iu.UploadStatFragment", 3))
    {
      String str2 = String.valueOf(str1);
      if (str2.length() == 0) {
        break label336;
      }
      "  -- item clicked; img: ".concat(str2);
    }
    for (;;)
    {
      Resources localResources = this.bn.getResources();
      ArrayList localArrayList1 = new ArrayList(5);
      ArrayList localArrayList2 = new ArrayList(5);
      localArrayList1.add(localResources.getString(aau.kU));
      localArrayList2.add(Integer.valueOf(0));
      if (localLong != null)
      {
        localArrayList1.add(localResources.getString(aau.kT));
        localArrayList2.add(Integer.valueOf(1));
      }
      String[] arrayOfString = new String[localArrayList1.size()];
      localArrayList1.toArray(arrayOfString);
      int j = ((giz)this.bo.a(giz.class)).c("active-photos-account");
      int k = aau.uo;
      lut locallut = lut.a(g().getString(k), arrayOfString);
      locallut.n = this;
      locallut.p = 0;
      locallut.m.putIntegerArrayList("args_action_list", localArrayList2);
      locallut.m.putInt("args_account_name", j);
      locallut.m.putString("args_media_url", str1);
      locallut.m.putLong("args_media_id", l);
      locallut.m.putInt("args_upload_reason", i);
      if (localLong != null) {
        locallut.m.putLong("args_row_id", localLong.longValue());
      }
      locallut.a(this.x, "tag_option_list");
      return;
      label336:
      new String("  -- item clicked; img: ");
    }
  }
  
  public final gya r_()
  {
    return gya.p;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cpm
 * JD-Core Version:    0.7.0.1
 */