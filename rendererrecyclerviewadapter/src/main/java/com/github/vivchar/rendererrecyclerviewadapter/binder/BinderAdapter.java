package com.github.vivchar.rendererrecyclerviewadapter.binder;

import androidx.annotation.NonNull;

import java.util.List;

/**
 * Created by Vivchar Vitaly on 18.01.18.
 */

public abstract class BinderAdapter <M> implements ViewBinder.Binder<M> {

	@Override
	public void bindView(@NonNull final M model, @NonNull final int position, @NonNull final ViewFinder finder, @NonNull final List<Object> payloads) {
		bindView(model, position, finder);
	}

	public void bindView(@NonNull final M model, @NonNull final int position, @NonNull final ViewFinder finder) {}
}
