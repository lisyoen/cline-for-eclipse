# Session: 플러그인 자동 활성화 설정

**세션 ID**: session-20241114-003-plugin-activation-fix  
**날짜**: 2024-11-14  
**상태**: 완료 ✅

## 작업 목표

Eclipse 플러그인이 IDE 시작 시 자동으로 활성화되도록 설정

## 문제 분석

### 현재 상태
- Eclipse 플러그인 프로젝트 생성 완료
- `Bundle-ActivationPolicy: lazy` 설정으로 인해 플러그인이 필요할 때까지 활성화되지 않음
- Activator의 `start()` 메서드가 호출되지 않아 콘솔에 시작 메시지 미표시

### 원인
- `lazy` 정책: 플러그인이 실제로 사용될 때까지 지연 활성화
- 현재는 사용자가 명령을 실행하거나 플러그인 기능을 호출해야 활성화됨

## 해결 방법

### 방법 1: org.eclipse.ui.startup 확장 포인트 추가 (권장)
Eclipse가 시작할 때 자동으로 플러그인을 활성화하는 확장 포인트 추가

**장점**:
- IDE 시작 시 자동 활성화
- 초기화 작업 수행 가능
- 명령 실행 전에도 활성화 보장

**단점**:
- IDE 시작 시간 약간 증가 (무시할 수 있는 수준)

### 방법 2: 테스트 명령 실행
Help > Cline Test 명령을 실행하여 플러그인 활성화

**장점**:
- 설정 변경 불필요

**단점**:
- 명령 실행 전까지 플러그인 비활성 상태
- 자동 초기화 불가능

## 작업 계획

1. `org.eclipse.ui.startup` 확장 포인트 추가
2. Startup 클래스 생성
3. 빌드 및 테스트
4. 콘솔에서 시작 메시지 확인

## 진행 상황

### 완료된 작업 ✅

1. **ClineStartup.java 생성**
   - `org.eclipse.ui.IStartup` 인터페이스 구현
   - `earlyStartup()` 메서드에서 Activator 강제 시작
   - 콘솔 메시지 출력

2. **plugin.xml 업데이트**
   - `org.eclipse.ui.startup` 확장 포인트 추가
   - ClineStartup 클래스 등록

3. **컴파일 에러 확인**
   - ✅ 에러 없음 확인

## 생성된 파일

### ClineStartup.java
```java
package com.cline.eclipse;

import org.eclipse.ui.IStartup;

public class ClineStartup implements IStartup {
    @Override
    public void earlyStartup() {
        ClineActivator.getDefault();
        System.out.println("Cline for Eclipse early startup executed!");
    }
}
```

### plugin.xml (업데이트)
- `org.eclipse.ui.startup` 확장 포인트 추가
- startup class: `com.cline.eclipse.ClineStartup`

## 테스트 방법

1. **Eclipse 플러그인 실행**
   ```
   Run As > Eclipse Application
   ```

2. **콘솔 확인**
   - "Cline for Eclipse plugin started!" 메시지 확인
   - "Cline for Eclipse early startup executed!" 메시지 확인

3. **테스트 명령 실행**
   - Help > Cline Test 메뉴 클릭
   - 메시지 다이얼로그 확인

## 결과

플러그인이 Eclipse 시작 시 자동으로 활성화되도록 설정 완료

**다음 세션에서**:
- 실행 테스트
- Phase 1 완료 확인
- Phase 2 시작 준비
