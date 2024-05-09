package examcookie.examcookie;

import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;


public class CookieBoxUtil {

   private Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
   
   public CookieBoxUtil(HttpServletRequest request) {
      Cookie[] cookies = request.getCookies();
      if ( cookies != null) {
         for( int i = 0; i < cookies.length; i=i+1) {
            cookieMap.put(cookies[i].getName(), cookies[i]);
         }
      }
   }
   
   //쿠키를 쉽게 만들기 다양한 방법으로
   // 가장 기본적인 쿠키 만들기(쿠키명과 쿠키값을 받아서 쿠키를 만들어 준다)
   public static Cookie createCookie(String name, String value) {
      return new Cookie(name, value);
   }
   // 쿠키의 보유기간까지 설정해서 쿠키를 만들어 준다.
   public static Cookie createCookie(String name, String value, int maxAge) {
      Cookie cookie = new Cookie(name, value);
      cookie.setMaxAge(maxAge);
      return cookie;
   }
   // 도메인과 기간을 설정한 쿠키를 만들어 준다.
   public static Cookie createCookie(String name, String value, String domain, int maxAge) {
      Cookie cookie = new Cookie(name, value);
      cookie.setDomain(domain);
      cookie.setMaxAge(maxAge);
      return cookie;
   }
   
   // 경로와 기간을 설정한 쿠키를 만들어 준다.
   public static Cookie createCookie(String name, String value,  int maxAge, String path) {
      Cookie cookie = new Cookie(name, value);
      cookie.setDomain(path);
      cookie.setMaxAge(maxAge);
      return cookie;
   }

   // 쿠키의 모든 정보를 설정한 쿠키를 만들어 준다.
   public static Cookie createCookie(String name, String value, String domain, int maxAge, String path) {
      Cookie cookie = new Cookie(name, value);
      cookie.setDomain(domain);
      cookie.setMaxAge(maxAge);
      cookie.setPath(path);
      return cookie;
   }
   
   public Cookie getCookie(String name) {
      return cookieMap.get(name);
   }
   
   public String getValue( String name) {
      Cookie cookie = getCookie(name);
      if( cookie == null) {
         return null;
      }
      return cookie.getValue();
   }
   
   public boolean exists(String name ) {
      Cookie cookie = cookieMap.get(name);
      if (cookie == null ) {
         return false;
      }else {
         return true;
      }
      // return cookieMap.get(name) != null;
   }
}