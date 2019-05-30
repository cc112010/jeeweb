package cn.jeeweb.beetl.tags;

import cn.jeeweb.beetl.tags.exception.BeetlTagException;
import org.springframework.lang.Nullable;

public interface ArgumentAware {

	/**
	 * Callback hook for nested spring:argument tags to pass their value
	 * to the parent tag.
	 * @param argument the result of the nested {@code spring:argument} tag
	 */
	void addArgument(@Nullable Object argument) throws BeetlTagException;

}
