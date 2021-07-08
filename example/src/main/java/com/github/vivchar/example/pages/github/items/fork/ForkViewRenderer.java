package com.github.vivchar.example.pages.github.items.fork;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.github.vivchar.example.R;
import com.github.vivchar.rendererrecyclerviewadapter.ViewRenderer;

import jp.wasabeef.glide.transformations.BlurTransformation;

/**
 * Created by Vivchar Vitaly on 1/10/17.
 */
public class ForkViewRenderer extends ViewRenderer<ForkModel, ForkViewHolder> {

	@NonNull
	private final Listener mListener;

	public ForkViewRenderer(@NonNull final Listener listener) {
		super(ForkModel.class);
		mListener = listener;
	}

	@Override
	public void bindView(@NonNull final ForkModel model, @NonNull final int position, @NonNull final ForkViewHolder holder) {
		holder.name.setText(model.getName());

//		final RequestOptions options = new RequestOptions();
//		options.transform(new MultiTransformation(new BlurTransformation(25), new CircleCrop()));

//		Glide.with(getContext())
//				.asBitmap()
//				.load(model.getAvatarUrl())
//				.apply(options)
//				.into(holder.avatar);
		holder.itemView.setOnClickListener(view -> mListener.onForkItemClicked(model));
	}

	@NonNull
	@Override
	public ForkViewHolder createViewHolder(@Nullable final ViewGroup parent) {
		return new ForkViewHolder(inflate(R.layout.item_fork, parent));
	}

	public interface Listener {
		void onForkItemClicked(@NonNull ForkModel model);
	}
}
