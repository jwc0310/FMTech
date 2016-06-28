import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public final class dhi
  extends mby
  implements DialogInterface.OnClickListener
{
  private int[] Z = new int[5];
  
  public final void a(bw parambw, String paramString)
  {
    Bundle localBundle = this.m;
    if ((localBundle.getBoolean("is_camera_supported", false)) || (localBundle.getBoolean("is_for_cover_photo", false)))
    {
      super.a(parambw, paramString);
      return;
    }
    ((dha)this.ae.a(dha.class)).b(localBundle.getBoolean("local_folders_only", false));
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    Bundle localBundle = this.m;
    bp localbp = f();
    boolean bool1 = localBundle.getBoolean("is_camera_supported", false);
    boolean bool2 = localBundle.getBoolean("is_for_cover_photo", false);
    boolean bool3 = localBundle.getBoolean("local_folders_only", false);
    boolean bool4 = localBundle.getBoolean("has_scrapbook", false);
    String str = localBundle.getString("dialog_title", localbp.getString(aw.q));
    boolean bool5 = localBundle.getBoolean("only_instant_upload", false);
    ArrayList localArrayList = new ArrayList();
    if (bool1)
    {
      this.Z[localArrayList.size()] = 1;
      localArrayList.add(localbp.getString(aw.n));
    }
    this.Z[localArrayList.size()] = 2;
    if (bool5) {
      localArrayList.add(localbp.getString(aw.k));
    }
    for (;;)
    {
      if (!bool3)
      {
        this.Z[localArrayList.size()] = 5;
        localArrayList.add(localbp.getString(aw.j));
      }
      if ((bool2) && (bool4))
      {
        this.Z[localArrayList.size()] = 4;
        localArrayList.add(localbp.getString(aw.l));
      }
      if (bool2)
      {
        this.Z[localArrayList.size()] = 3;
        localArrayList.add(localbp.getString(aw.m));
      }
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(localbp);
      localBuilder.setTitle(str);
      localBuilder.setAdapter(new ArrayAdapter(localbp, 17367057, localArrayList), this);
      localBuilder.setCancelable(true);
      return localBuilder.create();
      localArrayList.add(localbp.getString(aw.o));
    }
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (!i()) {
      return;
    }
    a(false);
    Bundle localBundle = this.m;
    boolean bool = localBundle.getBoolean("is_for_cover_photo", false);
    dha localdha = (dha)this.ae.a(dha.class);
    switch (this.Z[paramInt])
    {
    default: 
      return;
    case 1: 
      localdha.a();
      return;
    case 2: 
      if (bool)
      {
        localdha.b(localBundle.getBoolean("local_folders_only", false));
        return;
      }
      localdha.a(localBundle.getBoolean("local_folders_only", false));
      return;
    case 3: 
      localdha.d();
      return;
    case 4: 
      localdha.a(String.valueOf(localBundle.getLong("cover_photo_id")));
      return;
    }
    if (bool)
    {
      localdha.c();
      return;
    }
    localdha.b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dhi
 * JD-Core Version:    0.7.0.1
 */