package mobile.myfirstprojectonintern;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Manoj Budha Ayer on 8/30/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<ListItem> listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListItem listItem = listItems.get(position);

        holder.textViewTitle.setText(listItem.getTitle());
        holder.textViewDesc.setText(listItem.getDesc());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       private TextView textViewTitle;
       private TextView textViewDesc;
        public ViewHolder(View itemView) {
            super(itemView);
            textViewTitle = (TextView) itemView.findViewById(R.id.tv1fragment1);
            textViewDesc = (TextView) itemView.findViewById(R.id.tv2fragment1);
        }
    }
}
