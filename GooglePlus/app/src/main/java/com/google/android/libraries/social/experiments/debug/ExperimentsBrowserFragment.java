package com.google.android.libraries.social.experiments.debug;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import dl;
import efj;
import git;
import gjb;
import hyf;
import hyk;
import hyn;
import hyu;
import hyv;
import hyw;
import hyz;
import hza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mbb;
import mca;

public final class ExperimentsBrowserFragment
  extends mca
  implements hyz
{
  public hyn a;
  public hza b;
  private Button c;
  
  private final void v()
  {
    int i = 0;
    boolean bool = false;
    while (i < this.a.getCount())
    {
      if (this.b.a((hyf)this.a.getItem(i))) {
        bool = true;
      }
      i++;
    }
    this.c.setEnabled(bool);
    this.c.invalidate();
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    View localView = paramLayoutInflater.inflate(efj.My, paramViewGroup, true);
    ((ListView)localView.findViewById(efj.Ms)).setAdapter(this.a);
    EditText localEditText = (EditText)localView.findViewById(efj.Mv);
    localEditText.addTextChangedListener(new hyv(this, localEditText));
    this.c = ((Button)localView.findViewById(efj.Mo));
    this.c.setOnClickListener(new hyw(this));
    v();
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ArrayList localArrayList = new ArrayList(((hyk)this.bo.a(hyk.class)).b());
    Collections.sort(localArrayList, new hyu(this));
    String str = ((git)this.bo.a(git.class)).f().b("account_name");
    this.b = new hza(this.bn);
    this.a = new hyn(this.bn, efj.Mw, (hyf[])localArrayList.toArray(new hyf[localArrayList.size()]), str, this.b);
  }
  
  public final void aC_()
  {
    Toast.makeText(this.bn, dl.a, 1).show();
    this.a.notifyDataSetChanged();
    v();
  }
  
  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.b(hyz.class, this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.experiments.debug.ExperimentsBrowserFragment
 * JD-Core Version:    0.7.0.1
 */