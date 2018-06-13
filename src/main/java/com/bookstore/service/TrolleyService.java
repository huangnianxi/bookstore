package com.bookstore.service;

import com.bookstore.message.ResponseMes;

/**
 * 购物车
 * @author JinQi
 *
 */
public interface TrolleyService {
	
	/**
	 * 向用户的购物车中添加商品
	 * @param userName
	 * @param isbn
	 * @param degree
	 * @param num
	 * @return ResponseMes
	 * 成功返回“{“status”: “success”}”
	 * 失败返回“{“status”: “fail”}”
	 */
	public ResponseMes insertTrolley(String userName, String isbn, int degree, int num);
	
	/**
	 * 向用户的购物车中删除商品
	 * @param userName
	 * @param isbn
	 * @param degree
	 * @return ResponseMes
	 * 成功返回“{“status”: “success”}”
	 * 失败返回“{“status”: “fail”}”
	 */
	public ResponseMes deleteTrolley(String userName, String isbn, int degree);
	
	/**
	 * 修改用户的购物车中商品的数量
	 * @param userName
	 * @param isbn
	 * @param degree
	 * @param num
	 * @return ResponseMes
	 * 成功返回“{“status”: “success”}”
	 * 失败返回“{“status”: “fail”}”
	 */
	public ResponseMes updateTrolley(String userName, String isbn, int degree, int num);
	
	/**
	 * 查询用户的购物车信息
	 * @param userName
	 * @return ResponseMes
	 * 成功返回“{“status”: “success”, ArrayList<Trolley>}”
	 * 失败返回“{“status”: “fail”}”
	 */
	public ResponseMes selectTrolley(String userName);
	
	/**
	 * 获取待支付总价
	 * @param trolleyMsg
	 * @return double
	 */
	public double getPrice2Pay(String trolleyMsg);
	
	/**
	 * 支付
	 * @param paymentMsg
	 * 成功应接收“{“status”:“success”, msg: “Approved”}”
	 * 支付被取消则接收“{"status":“fail”, msg:“paymentCancelled”}”
	 * 支付出错则接收“{“status”:“fail”, msg:“paymentError”}”
	 */
	public void recvPaymentStatus(String userName, int paymentStatus);

}
