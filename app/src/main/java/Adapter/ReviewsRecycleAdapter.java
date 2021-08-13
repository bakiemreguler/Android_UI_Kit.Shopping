package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ModelClass.EShoppingModelClass;
import ModelClass.ReviewModelClass;
import uiux.design.eshoppinguikit.HomePageActivity;
import uiux.design.eshoppinguikit.LoginActivity;
import uiux.design.eshoppinguikit.NavigationActivity;
import uiux.design.eshoppinguikit.ProductDetailActivity;
import uiux.design.eshoppinguikit.ProductGridActivity;
import uiux.design.eshoppinguikit.ProductListActivity;
import uiux.design.eshoppinguikit.R;
import uiux.design.eshoppinguikit.SignupActivity;


public class ReviewsRecycleAdapter extends RecyclerView.Adapter<ReviewsRecycleAdapter.MyViewHolder> {

    Context context;


    private List<ReviewModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public ReviewsRecycleAdapter(Context context, List<ReviewModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public ReviewsRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_review_list, parent, false);


        return new ReviewsRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        ReviewModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());



    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


