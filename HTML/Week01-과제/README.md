# 1주차 과제  

> **1. 실제 웹페이지를 클론 코딩 하기**   

- HTML 만 활용해서 아디다스의 상품 Description 페이지 최대한 유사하게 만들어 보기
- `<table>` 태그와 그와 연관된 태그들 + `<ul><li>` 같이 리스트 태그들에 대해서 학습 해보고 직접 구현

클론 코딩한 페이지 [adidas](https://www.adidas.com/us/supernova-2.0-x-marimekko-running-shoes/HQ8919.html)

<br>

> **2. Meta Data는 무엇을 의미할까요?**
[MetaData란?](https://ko.wikipedia.org/wiki/%EB%A9%94%ED%83%80%EB%8D%B0%EC%9D%B4%ED%84%B0)
- 어떤 목적을 가지고 만들어진 데이터
- 데이터에 관한 구조화된 데이터로 다른 데이터를 설명하는 데이터이다.    
    - 대량의 정보 가운데에서 찾고 있는 정보를 효율적으로 찾아서 이용하기 위해 **일정한** 규칙에 따른다. 
```
ex 
사진을 찍어 기록할 때마다 카메라 자체의 정보와 촬영 당시의 시간, 노출, 플래시 사용 여부, 해상도, 
사진 크기 등의 사진 정보를 화상 데이터와 같이 저장하게 되어 있다. 
이러한 데이터를 분석하여 이용하면 그 뒤에 사진을 적절하게 정리하거나 다시 가공할 때에 아주 
유용하게 쓸 수 있는 정보가 된다.
```

**`<meta charset=’utf-8’>`의 의미는?**          
- <meta> 태그의 charset 속성은 해당 HTML 문서의 문자 인코딩 방식을 명시한다.
- 어떤 브라우저를 사용하던 한글 폰트를 인식하게 하는 인코딩을 알려주는 태그

[Q. <meta charset="utf-8">반드시 써야하나요?](https://github.com/codingeverybody/codingyahac/issues/107)
```
 웹브라우저 설정 상황에 따라 자동으로 인코딩을 추정해서 처리해주는데, 
 처리가 정확할 경우도 있지만, 그렇지 못하는 경우도 많습니다. 
 다양한 경우에 한글이 깨지지 않고 잘 보이기를 기대한다면 
 위 태그는 꼭 적어주는 것이 좋습니다.
 ```

[<meta> 태그에 대한 공식문서 살펴보기](http://www.tcpschool.com/html-tags/meta)

1) 검색 엔진을 위한 키워드(keyword)를 정의하는 예제   
`<meta name="keyword" content="HTML, meta, tag, element, reference">`   

2) 웹 페이지에 대한 설명(description)을 정의하는 예제   
`<meta name="description" content="HTML meta tag page">`   

3) 문서의 저자(author)를 정의하는 예제      
`<meta name="author" content="TCPSchool">`    

4) 5초 뒤에 다른 페이지로 리다이렉트(redirect)시키는 예제   
`<meta http-equiv="refresh" content="5;url=http://www.tcpschool.com">`   

5) 모든 장치에서 웹 사이트가 잘 보이도록 뷰포트(viewport)를 설정하는 예제   
`<meta name="viewport" content="width=device-width, initial-scale=1.0">`  
