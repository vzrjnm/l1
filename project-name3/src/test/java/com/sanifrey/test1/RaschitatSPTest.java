/**
 * ������������� �������������� ������ � ������
 */
package com.sanifrey.test1;
/**
*��������� ���������� ��� �������� ���������� �����
*/
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
/**
*��������� ���������� ��� ������������
*/
import org.junit.Test;

/**
*��������� �����, � ������� �������������� ������ ��������� ������
*/
import com.sanifrey.test1.Formuly;

/**
 *������� ����� ��� ������������ ������� ��������� ������
 */
public class RaschitatSPTest {

	/**
	*��������� ���������� ��� ������������
	*/
	private Formuly test;
	
	/**
	*��������� ������, ������� ����� ������� ����� ���������� �����
	*/
	@After
	/**
	*��������� ����������� �����
	*/
	public void tearDown() { test = null; }
	/**
	*��������� ������, ������� ����� ������� �� ���������� �����
	*/
	@Before
	/**
	*�������� ������ �����
	*/
	public void init() { test = new Formuly(); }
	/**
	* ���������, ��� ��������� ����� ����� �����������
	*/
	@Test
	/**
	* ������ ����� ������� ��������� ������
	*/
	public void test() {
		/**
		* ������ ���������:
		* �������������� ����� "5000" ���.
		* ��������� ����������� "0.8"
		*/

		test.setdPr(5000);
		test.setPredKoef(0.8);
		/**
		 * �������� ����� RaschitatSP() ��� ������� ��������� ������
		 */
		test.RaschitatSP();

		/**
 		* ���������� �������� ���������� StrPrem, ���������� � ������� ������ 
 		* RaschitatSP(), � �������������� ����������� 4000
 		*/
		assertEquals(4000,test.getStrPrem());
	}
}

