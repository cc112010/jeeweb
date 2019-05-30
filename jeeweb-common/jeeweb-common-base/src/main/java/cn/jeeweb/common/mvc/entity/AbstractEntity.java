
package cn.jeeweb.common.mvc.entity;

import java.io.Serializable;

/**
 * 抽象实体基类
 * 
 * @author 王存见
 *
 * 
 */
public abstract class AbstractEntity<ID> implements Serializable {

	public abstract ID getId();

	public abstract void setId(ID id);
}
