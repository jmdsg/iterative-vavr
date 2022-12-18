package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative;
import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative1Args;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative2Args;
import com.fiberg.iterative.core.Iterative3;
import com.fiberg.iterative.core.Iterative3Args;
import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.Iterative4Args;
import com.fiberg.iterative.core.Iterative5;
import com.fiberg.iterative.core.Iterative5Args;
import com.fiberg.iterative.core.Iterative6;
import com.fiberg.iterative.core.Iterative6Args;
import com.fiberg.iterative.core.Iterative7Args;
import com.fiberg.iterative.core.Iterative7Cross;
import com.fiberg.iterative.core.Iterative7Getter;
import com.fiberg.iterative.core.Iterative7Inline;
import com.fiberg.iterative.core.Iterative8;
import com.fiberg.iterative.core.Iterative8Cross;
import com.fiberg.iterative.core.Iterative8Inline;
import com.fiberg.iterative.core.IterativeConstructor;
import com.fiberg.iterative.core.IterativeGetter;
import com.fiberg.iterative.core.IterativeHandler;
import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.core.IterativeSupplier;
import com.fiberg.iterative.core.SimpleIterative;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs2;
import com.fiberg.iterative.function.Cs3;
import com.fiberg.iterative.function.Cs4;
import com.fiberg.iterative.function.Cs5;
import com.fiberg.iterative.function.Cs6;
import com.fiberg.iterative.function.Cs7;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fn4;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fn6;
import com.fiberg.iterative.function.Fn7;
import com.fiberg.iterative.function.Fnc7;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Pr7;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple7;
import io.vavr.collection.Iterator;
import io.vavr.collection.Seq;
import io.vavr.collection.Stream;
import io.vavr.control.Option;
import io.vavr.control.Try;
import io.vavr.control.Validation;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public interface Iterative7<T1, T2, T3, T4, T5, T6, T7> extends IterativeConstructor {

    public static final int CARDINALITY = 7;

    public static <T1, T2, T3, T4, T5, T6, T7> Iterative7<T1, T2, T3, T4, T5, T6, T7> empty() {
        return Iterative.empty7();
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Iterative7<T1, T2, T3, T4, T5, T6, T7> emptyNullable() {
        return Iterative.nullable().empty7();
    }

    public String toStringContent();

    public Stream<Tuple7<Iterable<T1>, Iterable<T2>, Iterable<T3>, Iterable<T4>, Iterable<T5>, Iterable<T6>, Iterable<T7>>> toTupleStream();

    public Stream<Tuple7<T1, T2, T3, T4, T5, T6, T7>> toStream();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> nonNullable();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> nullable();

    public Iterable<T1> iterable1();

    public Iterable<T2> iterable2();

    public Iterable<T3> iterable3();

    public Iterable<T4> iterable4();

    public Iterable<T5> iterable5();

    public Iterable<T6> iterable6();

    public Iterable<T7> iterable7();

    public Iterable<Stream<T1>> iterableStream1();

    public Iterable<Stream<T2>> iterableStream2();

    public Iterable<Stream<T3>> iterableStream3();

    public Iterable<Stream<T4>> iterableStream4();

    public Iterable<Stream<T5>> iterableStream5();

    public Iterable<Stream<T6>> iterableStream6();

    public Iterable<Stream<T7>> iterableStream7();

    public Iterative6<T1, T2, T3, T4, T5, T6> innerIterative();

    public Iterative1<T1> splitLt1();

    public Iterative2<T1, T2> splitLt2();

    public Iterative3<T1, T2, T3> splitLt3();

    public Iterative4<T1, T2, T3, T4> splitLt4();

    public Iterative5<T1, T2, T3, T4, T5> splitLt5();

    public Iterative6<T1, T2, T3, T4, T5, T6> splitLt6();

    public Iterative1<T7> splitRt1();

    public Iterative2<T6, T7> splitRt2();

    public Iterative3<T5, T6, T7> splitRt3();

    public Iterative4<T4, T5, T6, T7> splitRt4();

    public Iterative5<T3, T4, T5, T6, T7> splitRt5();

    public Iterative6<T2, T3, T4, T5, T6, T7> splitRt6();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCross2();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCross3();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCross4();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCross5();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCross6();

    public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCross7();

    public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCrossAll();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceInline2();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceInline3();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceInline4();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceInline5();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceInline6();

    public Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> forceInline7();

    public Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> forceInlineAll();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty1();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty2();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty3();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty4();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty5();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty6();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty7();

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmptyAll();

    public <T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> pushBackBy(Iterable<? extends Stream<? extends T8>> var1);

    public <T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> pushBackCrossBy(Iterable<? extends Stream<? extends T8>> var1);

    public <T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> pushBackInlineBy(Iterable<? extends Stream<? extends T8>> var1);

    public <T0> Iterative8<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontBy(Iterable<? extends Stream<? extends T0>> var1);

    public <T0> Iterative8<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> var1);

    public <T0> Iterative8<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> var1);

    public Iterative6<T1, T2, T3, T4, T5, T6> popBack(Cs1<? super T7> var1);

    public Iterative6<T1, T2, T3, T4, T5, T6> popBackChain(Cs1<? super T7> var1);

    public Iterative6<T2, T3, T4, T5, T6, T7> popFront(Cs1<? super T1> var1);

    default public Iterative6<T1, T2, T3, T4, T5, T6> popBack() {
        return this.popBack(Cs1.empty());
    }

    default public Iterative6<T2, T3, T4, T5, T6, T7> popFront() {
        return this.popFront(Cs1.empty());
    }

    public Iterative5<T1, T2, T3, T4, T5> popBack2(Cs2<? super T6, ? super T7> var1);

    public Iterative5<T1, T2, T3, T4, T5> popBackChain2(Cs2<? super T6, ? super T7> var1);

    public Iterative5<T3, T4, T5, T6, T7> popFront2(Cs2<? super T1, ? super T2> var1);

    default public Iterative5<T1, T2, T3, T4, T5> popBack2(Cs1<? super T6> c6, Cs1<? super T7> c7) {
        return this.popBack(c7).popBack(c6);
    }

    default public Iterative5<T3, T4, T5, T6, T7> popFront2(Cs1<? super T1> c1, Cs1<? super T2> c2) {
        return this.popFront(c1).popFront(c2);
    }

    default public Iterative5<T1, T2, T3, T4, T5> popBack2() {
        return this.popBack2(Cs1.empty(), Cs1.empty());
    }

    default public Iterative5<T3, T4, T5, T6, T7> popFront2() {
        return this.popFront2(Cs1.empty(), Cs1.empty());
    }

    public Iterative4<T1, T2, T3, T4> popBack3(Cs3<? super T5, ? super T6, ? super T7> var1);

    public Iterative4<T1, T2, T3, T4> popBackChain3(Cs3<? super T5, ? super T6, ? super T7> var1);

    public Iterative4<T4, T5, T6, T7> popFront3(Cs3<? super T1, ? super T2, ? super T3> var1);

    default public Iterative4<T1, T2, T3, T4> popBack3(Cs1<? super T5> c5, Cs1<? super T6> c6, Cs1<? super T7> c7) {
        return this.popBack(c7).popBack(c6).popBack(c5);
    }

    default public Iterative4<T4, T5, T6, T7> popFront3(Cs1<? super T1> c1, Cs1<? super T2> c2, Cs1<? super T3> c3) {
        return this.popFront(c1).popFront(c2).popFront(c3);
    }

    default public Iterative4<T1, T2, T3, T4> popBack3() {
        return this.popBack3(Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    default public Iterative4<T4, T5, T6, T7> popFront3() {
        return this.popFront3(Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    public Iterative3<T1, T2, T3> popBack4(Cs4<? super T4, ? super T5, ? super T6, ? super T7> var1);

    public Iterative3<T1, T2, T3> popBackChain4(Cs4<? super T4, ? super T5, ? super T6, ? super T7> var1);

    public Iterative3<T5, T6, T7> popFront4(Cs4<? super T1, ? super T2, ? super T3, ? super T4> var1);

    default public Iterative3<T1, T2, T3> popBack4(Cs1<? super T4> c4, Cs1<? super T5> c5, Cs1<? super T6> c6, Cs1<? super T7> c7) {
        return this.popBack(c7).popBack(c6).popBack(c5).popBack(c4);
    }

    default public Iterative3<T5, T6, T7> popFront4(Cs1<? super T1> c1, Cs1<? super T2> c2, Cs1<? super T3> c3, Cs1<? super T4> c4) {
        return this.popFront(c1).popFront(c2).popFront(c3).popFront(c4);
    }

    default public Iterative3<T1, T2, T3> popBack4() {
        return this.popBack4(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    default public Iterative3<T5, T6, T7> popFront4() {
        return this.popFront4(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    public Iterative2<T1, T2> popBack5(Cs5<? super T3, ? super T4, ? super T5, ? super T6, ? super T7> var1);

    public Iterative2<T1, T2> popBackChain5(Cs5<? super T3, ? super T4, ? super T5, ? super T6, ? super T7> var1);

    public Iterative2<T6, T7> popFront5(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> var1);

    default public Iterative2<T1, T2> popBack5(Cs1<? super T3> c3, Cs1<? super T4> c4, Cs1<? super T5> c5, Cs1<? super T6> c6, Cs1<? super T7> c7) {
        return this.popBack(c7).popBack(c6).popBack(c5).popBack(c4).popBack(c3);
    }

    default public Iterative2<T6, T7> popFront5(Cs1<? super T1> c1, Cs1<? super T2> c2, Cs1<? super T3> c3, Cs1<? super T4> c4, Cs1<? super T5> c5) {
        return this.popFront(c1).popFront(c2).popFront(c3).popFront(c4).popFront(c5);
    }

    default public Iterative2<T1, T2> popBack5() {
        return this.popBack5(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    default public Iterative2<T6, T7> popFront5() {
        return this.popFront5(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    public Iterative1<T1> popBack6(Cs6<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> var1);

    public Iterative1<T1> popBackChain6(Cs6<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> var1);

    public Iterative1<T7> popFront6(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> var1);

    default public Iterative1<T1> popBack6(Cs1<? super T2> c2, Cs1<? super T3> c3, Cs1<? super T4> c4, Cs1<? super T5> c5, Cs1<? super T6> c6, Cs1<? super T7> c7) {
        return this.popBack(c7).popBack(c6).popBack(c5).popBack(c4).popBack(c3).popBack(c2);
    }

    default public Iterative1<T7> popFront6(Cs1<? super T1> c1, Cs1<? super T2> c2, Cs1<? super T3> c3, Cs1<? super T4> c4, Cs1<? super T5> c5, Cs1<? super T6> c6) {
        return this.popFront(c1).popFront(c2).popFront(c3).popFront(c4).popFront(c5).popFront(c6);
    }

    default public Iterative1<T1> popBack6() {
        return this.popBack6(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    default public Iterative1<T7> popFront6() {
        return this.popFront6(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    public <R1, R2, R3, R4, R5, R6, R7> Iterative7<R1, R2, R3, R4, R5, R6, R7> map(Fn1<? super T1, ? extends R1> var1, Fn1<? super T2, ? extends R2> var2, Fn1<? super T3, ? extends R3> var3, Fn1<? super T4, ? extends R4> var4, Fn1<? super T5, ? extends R5> var5, Fn1<? super T6, ? extends R6> var6, Fn1<? super T7, ? extends R7> var7);

    public <R1, R2, R3, R4, R5, R6, R7> Iterative7<R1, R2, R3, R4, R5, R6, R7> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> var1, Fn1<? super T2, ? extends Iterable<? extends R2>> var2, Fn1<? super T3, ? extends Iterable<? extends R3>> var3, Fn1<? super T4, ? extends Iterable<? extends R4>> var4, Fn1<? super T5, ? extends Iterable<? extends R5>> var5, Fn1<? super T6, ? extends Iterable<? extends R6>> var6, Fn1<? super T7, ? extends Iterable<? extends R7>> var7);

    public Iterative7<T1, T2, T3, T4, T5, T6, T7> filter(Pr1<? super T1> var1, Pr1<? super T2> var2, Pr1<? super T3> var3, Pr1<? super T4> var4, Pr1<? super T5> var5, Pr1<? super T6> var6, Pr1<? super T7> var7);

    default public <R1, R2, R3, R4, R5, R6, R7> Iterative7<R1, R2, R3, R4, R5, R6, R7> flatMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
        return this.inlineMap(f1, f2, f3, f4, f5, f6, f7).forceFlatAll();
    }

    @Override
    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> onSuccess(Rn r) {
        return this.onSuccess(r.ignoring1());
    }

    @Override
    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> onFailure(Rn r) {
        return this.onFailure(r.ignoring1());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> execute(Cs1<? super Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> c) {
        Objects.requireNonNull(c, "c is null");
        c.accept(this);
        return this;
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> onFailure(Cs1<? super Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().toTry().recover(t -> null).filter(Objects::isNull).forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> onSuccess(Cs1<? super Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().headOption().forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> onSuccessful(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        return this.forEach(c);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover1(T1 t1) {
        return this.splitLt6().recover1(t1).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover1Of(Iterable<? extends T1> t1) {
        return this.splitLt6().recover1Of(t1).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover1By(Iterable<? extends Stream<? extends T1>> t1) {
        return this.splitLt6().recover1By(t1).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover2(T2 t2) {
        return this.splitLt6().recover2(t2).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover2Of(Iterable<? extends T2> t2) {
        return this.splitLt6().recover2Of(t2).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover2By(Iterable<? extends Stream<? extends T2>> t2) {
        return this.splitLt6().recover2By(t2).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover3(T3 t3) {
        return this.splitLt6().recover3(t3).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover3Of(Iterable<? extends T3> t3) {
        return this.splitLt6().recover3Of(t3).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover3By(Iterable<? extends Stream<? extends T3>> t3) {
        return this.splitLt6().recover3By(t3).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover4(T4 t4) {
        return this.splitLt6().recover4(t4).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover4Of(Iterable<? extends T4> t4) {
        return this.splitLt6().recover4Of(t4).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover4By(Iterable<? extends Stream<? extends T4>> t4) {
        return this.splitLt6().recover4By(t4).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover5(T5 t5) {
        return this.splitLt6().recover5(t5).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover5Of(Iterable<? extends T5> t5) {
        return this.splitLt6().recover5Of(t5).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover5By(Iterable<? extends Stream<? extends T5>> t5) {
        return this.splitLt6().recover5By(t5).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover6(T6 t6) {
        return this.splitLt6().recover6(t6).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover6Of(Iterable<? extends T6> t6) {
        return this.splitLt6().recover6Of(t6).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover6By(Iterable<? extends Stream<? extends T6>> t6) {
        return this.splitLt6().recover6By(t6).pushBackBy(this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover7(T7 t7) {
        return this.splitRt1().isFailure() ? this.splitLt6().pushBack(t7) : this;
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover7Of(Iterable<? extends T7> t7) {
        return this.splitRt1().isFailure() ? this.splitLt6().pushBackOf(t7) : this;
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> recover7By(Iterable<? extends Stream<? extends T7>> t7) {
        return this.splitRt1().isFailure() ? this.splitLt6().pushBackBy(t7) : this;
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().forEach(Cs7.tuple(c));
        return this;
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach(Rn r) {
        return this.forEach(r.ignoring7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach1(Cs1<? super T1> c) {
        return this.forEach(c.ignoring6Rt());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach2(Cs1<? super T2> c) {
        return this.forEach(c.ignoring5Rt().ignoring1Lt());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach3(Cs1<? super T3> c) {
        return this.forEach(c.ignoring4Rt().ignoring2Lt());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach4(Cs1<? super T4> c) {
        return this.forEach(c.ignoring3Rt().ignoring3Lt());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach5(Cs1<? super T5> c) {
        return this.forEach(c.ignoring2Rt().ignoring4Lt());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach6(Cs1<? super T6> c) {
        return this.forEach(c.ignoring1Rt().ignoring5Lt());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach7(Cs1<? super T7> c) {
        return this.forEach(c.ignoring6Lt());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEachWhen1(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, Pr1<? super T1> p) {
        return this.forEachWhen(c, p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEachWhen2(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, Pr1<? super T2> p) {
        return this.forEachWhen(c, Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEachWhen3(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, Pr1<? super T3> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEachWhen4(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, Pr1<? super T4> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEachWhen5(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, Pr1<? super T5> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEachWhen6(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, Pr1<? super T6> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEachWhen7(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, Pr1<? super T7> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEachWhen(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7) {
        Objects.requireNonNull(c, "c is null");
        Objects.requireNonNull(p1, "p1 is null");
        Objects.requireNonNull(p2, "p2 is null");
        Objects.requireNonNull(p3, "p3 is null");
        Objects.requireNonNull(p4, "p4 is null");
        Objects.requireNonNull(p5, "p5 is null");
        Objects.requireNonNull(p6, "p6 is null");
        Objects.requireNonNull(p7, "p7 is null");
        this.filter(p1, p2, p3, p4, p5, p6, p7).toStream().forEach(Cs7.tuple(c));
        return this;
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEachWhen(Cs7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p) {
        Objects.requireNonNull(c, "c is null");
        Objects.requireNonNull(p, "p is null");
        this.toStream().filter(Pr7.tuple(p)).forEach(Cs7.tuple(c));
        return this;
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach1When(Cs1<? super T1> c, Pr1<? super T1> p) {
        return this.forEachWhen1(c.ignoring6Rt(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach2When(Cs1<? super T2> c, Pr1<? super T2> p) {
        return this.forEachWhen2(c.ignoring5Rt().ignoring1Lt(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach3When(Cs1<? super T3> c, Pr1<? super T3> p) {
        return this.forEachWhen3(c.ignoring4Rt().ignoring2Lt(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach4When(Cs1<? super T4> c, Pr1<? super T4> p) {
        return this.forEachWhen4(c.ignoring3Rt().ignoring3Lt(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach5When(Cs1<? super T5> c, Pr1<? super T5> p) {
        return this.forEachWhen5(c.ignoring2Rt().ignoring4Lt(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach6When(Cs1<? super T6> c, Pr1<? super T6> p) {
        return this.forEachWhen6(c.ignoring1Rt().ignoring5Lt(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forEach7When(Cs1<? super T7> c, Pr1<? super T7> p) {
        return this.forEachWhen7(c.ignoring6Lt(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace1When(Fn1<? super T1, ? extends T1> f, Pr1<? super T1> p) {
        return this.map1((Fn1 & Serializable)t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace1When(Sp<? extends T1> s, Pr1<? super T1> p) {
        return this.replace1When((T1)s.toFunction().ignoring1(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace1When(T1 t, Pr1<? super T1> p) {
        return this.replace1When((T1)Fn1.value(t), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace2When(Fn1<? super T2, ? extends T2> f, Pr1<? super T2> p) {
        return this.map2((Fn1 & Serializable)t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace2When(Sp<? extends T2> s, Pr1<? super T2> p) {
        return this.replace2When((T2)s.toFunction().ignoring1(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace2When(T2 t, Pr1<? super T2> p) {
        return this.replace2When((T2)Fn1.value(t), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace3When(Fn1<? super T3, ? extends T3> f, Pr1<? super T3> p) {
        return this.map3((Fn1 & Serializable)t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace3When(Sp<? extends T3> s, Pr1<? super T3> p) {
        return this.replace3When((T3)s.toFunction().ignoring1(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace3When(T3 t, Pr1<? super T3> p) {
        return this.replace3When((T3)Fn1.value(t), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace4When(Fn1<? super T4, ? extends T4> f, Pr1<? super T4> p) {
        return this.map4((Fn1 & Serializable)t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace4When(Sp<? extends T4> s, Pr1<? super T4> p) {
        return this.replace4When((T4)s.toFunction().ignoring1(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace4When(T4 t, Pr1<? super T4> p) {
        return this.replace4When((T4)Fn1.value(t), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace5When(Fn1<? super T5, ? extends T5> f, Pr1<? super T5> p) {
        return this.map5((Fn1 & Serializable)t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace5When(Sp<? extends T5> s, Pr1<? super T5> p) {
        return this.replace5When((T5)s.toFunction().ignoring1(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace5When(T5 t, Pr1<? super T5> p) {
        return this.replace5When((T5)Fn1.value(t), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace6When(Fn1<? super T6, ? extends T6> f, Pr1<? super T6> p) {
        return this.map6((Fn1 & Serializable)t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace6When(Sp<? extends T6> s, Pr1<? super T6> p) {
        return this.replace6When((T6)s.toFunction().ignoring1(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace6When(T6 t, Pr1<? super T6> p) {
        return this.replace6When((T6)Fn1.value(t), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace7When(Fn1<? super T7, ? extends T7> f, Pr1<? super T7> p) {
        return this.map7((Fn1 & Serializable)t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace7When(Sp<? extends T7> s, Pr1<? super T7> p) {
        return this.replace7When((T7)s.toFunction().ignoring1(), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> replace7When(T7 t, Pr1<? super T7> p) {
        return this.replace7When((T7)Fn1.value(t), p);
    }

    default public Iterable<Tuple7<T1, T2, T3, T4, T5, T6, T7>> yield() {
        return this.yield(Tuple::of);
    }

    default public <R> Iterable<R> yield(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn7.tuple(f)).flatMap(this::wrap);
    }

    default public Stream<Tuple7<T1, T2, T3, T4, T5, T6, T7>> yieldStream() {
        return this.yieldStream(Tuple::of);
    }

    default public <R> Stream<R> yieldStream(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn7.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Stream<R> yieldFlatStream(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldStream(f).flatMap(IterativeInternals::entity).flatMap(this::wrap);
    }

    default public Option<Tuple7<T1, T2, T3, T4, T5, T6, T7>> yieldOption() {
        return this.yieldOption(Tuple::of);
    }

    default public <R> Option<R> yieldOption(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().map(Fn7.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Option<R> yieldFlatOption(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldOption(f).flatMap(IterativeInternals::entity).flatMap(this::wrap);
    }

    default public Try<Tuple7<T1, T2, T3, T4, T5, T6, T7>> yieldTry() {
        return this.yieldTry(Tuple::of);
    }

    default public <R> Try<R> yieldTry(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().toTry().mapTry(Fnc7.tuple(f)).flatMap(this::wrapTry);
    }

    default public <R> Try<R> yieldFlatTry(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldTry(f).flatMap(IterativeInternals::entity).flatMap(this::wrapTry);
    }

    default public Validation<Seq<Throwable>, Stream<Tuple7<T1, T2, T3, T4, T5, T6, T7>>> validateStream() {
        return this.validateStream(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateStream(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldStream(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateFlatStream(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatStream(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Option<Tuple7<T1, T2, T3, T4, T5, T6, T7>>> validateOption() {
        return this.validateOption(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateOption(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldOption(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateFlatOption(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatOption(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Try<Tuple7<T1, T2, T3, T4, T5, T6, T7>>> validateTry() {
        return this.validateTry(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateTry(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateFlatTry(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Iterative7<R, T2, T3, T4, T5, T6, T7> map1(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(f, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity);
    }

    default public <R> Iterative7<T1, R, T3, T4, T5, T6, T7> map2(Fn1<? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::entity, f, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity);
    }

    default public <R> Iterative7<T1, T2, R, T4, T5, T6, T7> map3(Fn1<? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::entity, IterativeInternals::entity, f, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity);
    }

    default public <R> Iterative7<T1, T2, T3, R, T5, T6, T7> map4(Fn1<? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, f, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity);
    }

    default public <R> Iterative7<T1, T2, T3, T4, R, T6, T7> map5(Fn1<? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, f, IterativeInternals::entity, IterativeInternals::entity);
    }

    default public <R> Iterative7<T1, T2, T3, T4, T5, R, T7> map6(Fn1<? super T6, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, f, IterativeInternals::entity);
    }

    default public <R> Iterative7<T1, T2, T3, T4, T5, T6, R> map7(Fn1<? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, f);
    }

    default public <R6, R7> Iterative7<T1, T2, T3, T4, T5, R6, R7> mapRt2(Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7) {
        return this.map(IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, f6, f7);
    }

    default public <R1, R2> Iterative7<R1, R2, T3, T4, T5, T6, T7> mapLt2(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2) {
        return this.map(f1, f2, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity);
    }

    default public <R5, R6, R7> Iterative7<T1, T2, T3, T4, R5, R6, R7> mapRt3(Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7) {
        return this.map(IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, f5, f6, f7);
    }

    default public <R1, R2, R3> Iterative7<R1, R2, R3, T4, T5, T6, T7> mapLt3(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3) {
        return this.map(f1, f2, f3, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity);
    }

    default public <R4, R5, R6, R7> Iterative7<T1, T2, T3, R4, R5, R6, R7> mapRt4(Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7) {
        return this.map(IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity, f4, f5, f6, f7);
    }

    default public <R1, R2, R3, R4> Iterative7<R1, R2, R3, R4, T5, T6, T7> mapLt4(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4) {
        return this.map(f1, f2, f3, f4, IterativeInternals::entity, IterativeInternals::entity, IterativeInternals::entity);
    }

    default public <R3, R4, R5, R6, R7> Iterative7<T1, T2, R3, R4, R5, R6, R7> mapRt5(Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7) {
        return this.map(IterativeInternals::entity, IterativeInternals::entity, f3, f4, f5, f6, f7);
    }

    default public <R1, R2, R3, R4, R5> Iterative7<R1, R2, R3, R4, R5, T6, T7> mapLt5(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5) {
        return this.map(f1, f2, f3, f4, f5, IterativeInternals::entity, IterativeInternals::entity);
    }

    default public <R2, R3, R4, R5, R6, R7> Iterative7<T1, R2, R3, R4, R5, R6, R7> mapRt6(Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7) {
        return this.map(IterativeInternals::entity, f2, f3, f4, f5, f6, f7);
    }

    default public <R1, R2, R3, R4, R5, R6> Iterative7<R1, R2, R3, R4, R5, R6, T7> mapLt6(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6) {
        return this.map(f1, f2, f3, f4, f5, f6, IterativeInternals::entity);
    }

    default public <R> Iterative7<R, T2, T3, T4, T5, T6, T7> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(f, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap);
    }

    default public <R> Iterative7<T1, R, T3, T4, T5, T6, T7> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, f, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap);
    }

    default public <R> Iterative7<T1, T2, R, T4, T5, T6, T7> inlineMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, f, this::wrap, this::wrap, this::wrap, this::wrap);
    }

    default public <R> Iterative7<T1, T2, T3, R, T5, T6, T7> inlineMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, this::wrap, f, this::wrap, this::wrap, this::wrap);
    }

    default public <R> Iterative7<T1, T2, T3, T4, R, T6, T7> inlineMap5(Fn1<? super T5, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, this::wrap, this::wrap, f, this::wrap, this::wrap);
    }

    default public <R> Iterative7<T1, T2, T3, T4, T5, R, T7> inlineMap6(Fn1<? super T6, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, f, this::wrap);
    }

    default public <R> Iterative7<T1, T2, T3, T4, T5, T6, R> inlineMap7(Fn1<? super T7, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, f);
    }

    default public <R6, R7> Iterative7<T1, T2, T3, T4, T5, R6, R7> inlineMapRt2(Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
        return this.inlineMap(this::wrap, this::wrap, this::wrap, this::wrap, this::wrap, f6, f7);
    }

    default public <R1, R2> Iterative7<R1, R2, T3, T4, T5, T6, T7> inlineMapLt2(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
        return this.inlineMap(f1, f2, this::wrap, this::wrap, this::wrap, this::wrap, this::wrap);
    }

    default public <R5, R6, R7> Iterative7<T1, T2, T3, T4, R5, R6, R7> inlineMapRt3(Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
        return this.inlineMap(this::wrap, this::wrap, this::wrap, this::wrap, f5, f6, f7);
    }

    default public <R1, R2, R3> Iterative7<R1, R2, R3, T4, T5, T6, T7> inlineMapLt3(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3) {
        return this.inlineMap(f1, f2, f3, this::wrap, this::wrap, this::wrap, this::wrap);
    }

    default public <R4, R5, R6, R7> Iterative7<T1, T2, T3, R4, R5, R6, R7> inlineMapRt4(Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
        return this.inlineMap(this::wrap, this::wrap, this::wrap, f4, f5, f6, f7);
    }

    default public <R1, R2, R3, R4> Iterative7<R1, R2, R3, R4, T5, T6, T7> inlineMapLt4(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
        return this.inlineMap(f1, f2, f3, f4, this::wrap, this::wrap, this::wrap);
    }

    default public <R3, R4, R5, R6, R7> Iterative7<T1, T2, R3, R4, R5, R6, R7> inlineMapRt5(Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
        return this.inlineMap(this::wrap, this::wrap, f3, f4, f5, f6, f7);
    }

    default public <R1, R2, R3, R4, R5> Iterative7<R1, R2, R3, R4, R5, T6, T7> inlineMapLt5(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5) {
        return this.inlineMap(f1, f2, f3, f4, f5, this::wrap, this::wrap);
    }

    default public <R2, R3, R4, R5, R6, R7> Iterative7<T1, R2, R3, R4, R5, R6, R7> inlineMapRt6(Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
        return this.inlineMap(this::wrap, f2, f3, f4, f5, f6, f7);
    }

    default public <R1, R2, R3, R4, R5, R6> Iterative7<R1, R2, R3, R4, R5, R6, T7> inlineMapLt6(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6) {
        return this.inlineMap(f1, f2, f3, f4, f5, f6, this::wrap);
    }

    default public <R> Iterative7<R, T2, T3, T4, T5, T6, T7> flatMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return this.inlineMap1(f).forceFlat1();
    }

    default public <R> Iterative7<T1, R, T3, T4, T5, T6, T7> flatMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return this.inlineMap2(f).forceFlat2();
    }

    default public <R> Iterative7<T1, T2, R, T4, T5, T6, T7> flatMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return this.inlineMap3(f).forceFlat3();
    }

    default public <R> Iterative7<T1, T2, T3, R, T5, T6, T7> flatMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        return this.inlineMap4(f).forceFlat4();
    }

    default public <R> Iterative7<T1, T2, T3, T4, R, T6, T7> flatMap5(Fn1<? super T5, ? extends Iterable<? extends R>> f) {
        return this.inlineMap5(f).forceFlat5();
    }

    default public <R> Iterative7<T1, T2, T3, T4, T5, R, T7> flatMap6(Fn1<? super T6, ? extends Iterable<? extends R>> f) {
        return this.inlineMap6(f).forceFlat6();
    }

    default public <R> Iterative7<T1, T2, T3, T4, T5, T6, R> flatMap7(Fn1<? super T7, ? extends Iterable<? extends R>> f) {
        return this.inlineMap7(f).forceFlat7();
    }

    default public <R6, R7> Iterative7<T1, T2, T3, T4, T5, R6, R7> flatMapRt2(Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
        return this.inlineMapRt2(f6, f7).forceFlat2();
    }

    default public <R1, R2> Iterative7<R1, R2, T3, T4, T5, T6, T7> flatMapLt2(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
        return this.inlineMapLt2(f1, f2).forceFlat2();
    }

    default public <R5, R6, R7> Iterative7<T1, T2, T3, T4, R5, R6, R7> flatMapRt3(Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
        return this.inlineMapRt3(f5, f6, f7).forceFlat3();
    }

    default public <R1, R2, R3> Iterative7<R1, R2, R3, T4, T5, T6, T7> flatMapLt3(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3) {
        return this.inlineMapLt3(f1, f2, f3).forceFlat3();
    }

    default public <R4, R5, R6, R7> Iterative7<T1, T2, T3, R4, R5, R6, R7> flatMapRt4(Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
        return this.inlineMapRt4(f4, f5, f6, f7).forceFlat4();
    }

    default public <R1, R2, R3, R4> Iterative7<R1, R2, R3, R4, T5, T6, T7> flatMapLt4(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
        return this.inlineMapLt4(f1, f2, f3, f4).forceFlat4();
    }

    default public <R3, R4, R5, R6, R7> Iterative7<T1, T2, R3, R4, R5, R6, R7> flatMapRt5(Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
        return this.inlineMapRt5(f3, f4, f5, f6, f7).forceFlat5();
    }

    default public <R1, R2, R3, R4, R5> Iterative7<R1, R2, R3, R4, R5, T6, T7> flatMapLt5(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5) {
        return this.inlineMapLt5(f1, f2, f3, f4, f5).forceFlat5();
    }

    default public <R2, R3, R4, R5, R6, R7> Iterative7<T1, R2, R3, R4, R5, R6, R7> flatMapRt6(Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
        return this.inlineMapRt6(f2, f3, f4, f5, f6, f7).forceFlat6();
    }

    default public <R1, R2, R3, R4, R5, R6> Iterative7<R1, R2, R3, R4, R5, R6, T7> flatMapLt6(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6) {
        return this.inlineMapLt6(f1, f2, f3, f4, f5, f6).forceFlat6();
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filter1(Pr1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filter2(Pr1<? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filter3(Pr1<? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filter4(Pr1<? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filter5(Pr1<? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filter6(Pr1<? super T6> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filter7(Pr1<? super T7> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filterRt2(Pr1<? super T6> p6, Pr1<? super T7> p7) {
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p6, p7);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filterLt2(Pr1<? super T1> p1, Pr1<? super T2> p2) {
        return this.filter(p1, p2, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filterRt3(Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7) {
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p5, p6, p7);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filterLt3(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3) {
        return this.filter(p1, p2, p3, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filterRt4(Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7) {
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), p4, p5, p6, p7);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filterLt4(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4) {
        return this.filter(p1, p2, p3, p4, Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filterRt5(Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7) {
        return this.filter(Pr1.value(true), Pr1.value(true), p3, p4, p5, p6, p7);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filterLt5(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5) {
        return this.filter(p1, p2, p3, p4, p5, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filterRt6(Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7) {
        return this.filter(Pr1.value(true), p2, p3, p4, p5, p6, p7);
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> filterLt6(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6) {
        return this.filter(p1, p2, p3, p4, p5, p6, Pr1.value(true));
    }

    default public <T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> pushBackOf(Iterable<? extends T8> t8) {
        return this.pushBackBy(IterativeHandler.streamWrap(t8));
    }

    default public <T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> pushBackCrossOf(Iterable<? extends T8> t8) {
        return this.pushBackCrossBy(IterativeHandler.streamWrap(t8));
    }

    default public <T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> pushBackInlineOf(Iterable<? extends T8> t8) {
        return this.pushBackInlineBy(IterativeHandler.streamWrap(t8));
    }

    default public <T0> Iterative8<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontOf(Iterable<? extends T0> t0) {
        return this.pushFrontBy(IterativeHandler.streamWrap(t0));
    }

    default public <T0> Iterative8<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return this.pushFrontCrossBy(IterativeHandler.streamWrap(t0));
    }

    default public <T0> Iterative8<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return this.pushFrontInlineBy(IterativeHandler.streamWrap(t0));
    }

    default public <T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> pushBack(T8 t8) {
        return this.pushBackOf((Iterable<? extends T8>)this.wrap(t8));
    }

    default public <T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> pushBackCross(T8 t8) {
        return this.pushBackCrossOf((Iterable<? extends T8>)this.wrap(t8));
    }

    default public <T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> pushBackInline(T8 t8) {
        return this.pushBackInlineOf((Iterable<? extends T8>)this.wrap(t8));
    }

    default public <T0> Iterative8<T0, T1, T2, T3, T4, T5, T6, T7> pushFront(T0 t0) {
        return this.pushFrontOf((Iterable<? extends T0>)this.wrap(t0));
    }

    default public <T0> Iterative8<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontCross(T0 t0) {
        return this.pushFrontCrossOf((Iterable<? extends T0>)this.wrap(t0));
    }

    default public <T0> Iterative8<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontInline(T0 t0) {
        return this.pushFrontInlineOf((Iterable<? extends T0>)this.wrap(t0));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceInlineFlat() {
        return Iterative.ofTuple7(this.yieldStream());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceFlat1() {
        return this.create(this.splitLt6().forceFlat1(), this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceFlat2() {
        return this.create(this.splitLt6().forceFlat2(), this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceFlat3() {
        return this.create(this.splitLt6().forceFlat3(), this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceFlat4() {
        return this.create(this.splitLt6().forceFlat4(), this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceFlat5() {
        return this.create(this.splitLt6().forceFlat5(), this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceFlat6() {
        return this.create(this.splitLt6().forceFlat6(), this.iterableStream7());
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceFlat7() {
        return this.create(this.splitLt6(), IterativeHandler.streamWrap(this.iterable7()));
    }

    default public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceFlatAll() {
        return this.create(this.splitLt6().forceFlatAll(), IterativeHandler.streamWrap(this.iterable7()));
    }

    default public <R> R getOnSuccessOrNull(Fn1<? super Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>, ? extends R> f) {
        return (R)this.getterOnSuccess(f).onFailure(Sp.empty());
    }

    default public <R> R getOnSuccessOrThrow(Fn1<? super Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>, ? extends R> f) {
        return (R)this.getterOnSuccess(Fn1.narrow(f)).onFailure(Fn0.pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public Tuple7<T1, T2, T3, T4, T5, T6, T7> getOrElse(Sp<? extends Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>> s) {
        return (Tuple7)this.getterOnSuccess().onFailure((Tuple7<T1, T2, T3, T4, T5, T6, T7>)s.afterApply(Tuple::narrow));
    }

    default public Tuple7<T1, T2, T3, T4, T5, T6, T7> getOrElse(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> t) {
        return (Tuple7)this.getterOnSuccess().onFailure((Tuple7<T1, T2, T3, T4, T5, T6, T7>)Sp.value(Tuple.narrow(t)));
    }

    default public Tuple7<T1, T2, T3, T4, T5, T6, T7> getOrNull() {
        return (Tuple7)this.getterOnSuccess().onFailure((Tuple7<T1, T2, T3, T4, T5, T6, T7>)Sp.empty());
    }

    default public Tuple7<T1, T2, T3, T4, T5, T6, T7> getOrThrow() {
        return (Tuple7)this.getterOnSuccess().onFailure((Tuple7<T1, T2, T3, T4, T5, T6, T7>)Fn0.pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public Iterative7Getter<T1, T2, T3, T4, T5, T6, T7> getter() {
        return new Iterative7Getter.Iterative7GetterImpl(this);
    }

    default public Iterative7Getter.Iterative7Fail<T1, T2, T3, T4, T5, T6, T7, Tuple7<T1, T2, T3, T4, T5, T6, T7>> getterOnSuccess() {
        return this.getter().onSuccess();
    }

    default public <R> Iterative7Getter.Iterative7Fail<T1, T2, T3, T4, T5, T6, T7, R> getterOnSuccess(R r) {
        return this.getter().onSuccess(r);
    }

    default public <R> Iterative7Getter.Iterative7Fail<T1, T2, T3, T4, T5, T6, T7, R> getterOnSuccess(Sp<? extends R> s) {
        return this.getter().onSuccess(s);
    }

    default public <R> Iterative7Getter.Iterative7Fail<T1, T2, T3, T4, T5, T6, T7, R> getterOnSuccess(Fn1<? super Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>, ? extends R> f) {
        return this.getter().onSuccess(f);
    }

    default public <R> Iterative7Getter.Iterative7Success<T1, T2, T3, T4, T5, T6, T7, R> getterOnFailure(R r) {
        return this.getter().onFailure(r);
    }

    default public <R> Iterative7Getter.Iterative7Success<T1, T2, T3, T4, T5, T6, T7, R> getterOnFailure(Sp<? extends R> s) {
        return this.getter().onFailure(s);
    }

    default public <R> Iterative7Getter.Iterative7Success<T1, T2, T3, T4, T5, T6, T7, R> getterOnFailure(Fn1<? super Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7>, ? extends R> f) {
        return this.getter().onFailure(f);
    }

    default public Iterative1<Tuple7<T1, T2, T3, T4, T5, T6, T7>> reduce() {
        return this.reduce(Tuple::of);
    }

    default public <R> Iterative1<R> reduce(Fn7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.toTupleStream().map(Fn7.tuple(IterativeHandler::cross)).map(stream -> stream.map(Fn7.tuple(f))));
    }

    default public <R> Iterative6<T1, T2, T3, T4, T5, R> reduceSimpleRt2(Fn2<? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt6().create(this.splitLt5(), this.splitRt2().reduce(f).iterableStream1());
    }

    default public <R> Iterative6<T1, T2, T3, T4, T5, R> reduceChainRt2(Fn2<? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt6().create(this.splitLt5(), this.reduce((Fn7 & Serializable)(a1, a2, a3, a4, a5, a6, a7) -> f.apply(a6, a7)).iterableStream1());
    }

    default public <R> Iterative6<R, T3, T4, T5, T6, T7> reduceSimpleLt2(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt6().reduceSimpleLt2(f), this.iterableStream7());
    }

    default public <R> Iterative6<R, T3, T4, T5, T6, T7> reduceChainLt2(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.reduceSimpleLt2(f);
    }

    default public <R> Iterative5<T1, T2, T3, T4, R> reduceSimpleRt3(Fn3<? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt6().create(this.splitLt4(), this.splitRt3().reduce(f).iterableStream1());
    }

    default public <R> Iterative5<T1, T2, T3, T4, R> reduceChainRt3(Fn3<? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt6().create(this.splitLt4(), this.reduce((Fn7 & Serializable)(a1, a2, a3, a4, a5, a6, a7) -> f.apply(a5, a6, a7)).iterableStream1());
    }

    default public <R> Iterative5<R, T4, T5, T6, T7> reduceSimpleLt3(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt6().reduceSimpleLt3(f), this.iterableStream7());
    }

    default public <R> Iterative5<R, T4, T5, T6, T7> reduceChainLt3(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return this.reduceSimpleLt3(f);
    }

    default public <R> Iterative4<T1, T2, T3, R> reduceSimpleRt4(Fn4<? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt6().create(this.splitLt3(), this.splitRt4().reduce(f).iterableStream1());
    }

    default public <R> Iterative4<T1, T2, T3, R> reduceChainRt4(Fn4<? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt6().create(this.splitLt3(), this.reduce((Fn7 & Serializable)(a1, a2, a3, a4, a5, a6, a7) -> f.apply(a4, a5, a6, a7)).iterableStream1());
    }

    default public <R> Iterative4<R, T5, T6, T7> reduceSimpleLt4(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt6().reduceSimpleLt4(f), this.iterableStream7());
    }

    default public <R> Iterative4<R, T5, T6, T7> reduceChainLt4(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return this.reduceSimpleLt4(f);
    }

    default public <R> Iterative3<T1, T2, R> reduceSimpleRt5(Fn5<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt6().create(this.splitLt2(), this.splitRt5().reduce(f).iterableStream1());
    }

    default public <R> Iterative3<T1, T2, R> reduceChainRt5(Fn5<? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt6().create(this.splitLt2(), this.reduce((Fn7 & Serializable)(a1, a2, a3, a4, a5, a6, a7) -> f.apply(a3, a4, a5, a6, a7)).iterableStream1());
    }

    default public <R> Iterative3<R, T6, T7> reduceSimpleLt5(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt6().reduceSimpleLt5(f), this.iterableStream7());
    }

    default public <R> Iterative3<R, T6, T7> reduceChainLt5(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return this.reduceSimpleLt5(f);
    }

    default public <R> Iterative2<T1, R> reduceSimpleRt6(Fn6<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt6().create(this.splitLt1(), this.splitRt6().reduce(f).iterableStream1());
    }

    default public <R> Iterative2<T1, R> reduceChainRt6(Fn6<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt6().create(this.splitLt1(), this.reduce((Fn7 & Serializable)(a1, a2, a3, a4, a5, a6, a7) -> f.apply(a2, a3, a4, a5, a6, a7)).iterableStream1());
    }

    default public <R> Iterative2<R, T7> reduceSimpleLt6(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt6().reduce(f), this.iterableStream7());
    }

    default public <R> Iterative2<R, T7> reduceChainLt6(Fn6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f) {
        return this.reduceSimpleLt6(f);
    }

    default public <A1> Iterative7Args.Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, A1> crossArgs(A1 a1) {
        return this.crossArgsOf((Iterable<? extends A1>)this.wrap(a1));
    }

    default public <A1> Iterative7Args.Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, A1> crossArgsOf(Iterable<? extends A1> a1) {
        return new Iterative7Args.Iterative7Args1.Iterative7Args1Impl(this, this.accessBuilder().cross().of(a1), true);
    }

    default public <A1> Iterative7Args.Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, A1> inlineArgs(A1 a1) {
        return this.inlineArgsOf((Iterable<? extends A1>)this.wrap(a1));
    }

    default public <A1> Iterative7Args.Iterative7Args1<T1, T2, T3, T4, T5, T6, T7, A1> inlineArgsOf(Iterable<? extends A1> a1) {
        return new Iterative7Args.Iterative7Args1.Iterative7Args1Impl(this, this.accessBuilder().inline().of(a1), false);
    }

    default public Iterative6Args.Iterative6Args1<T1, T2, T3, T4, T5, T6, T7> inlineArgsRt1() {
        return new Iterative6Args.Iterative6Args1.Iterative6Args1Impl<T1, T2, T3, T4, T5, T6, T7>(this.splitLt6(), this.splitRt1(), false);
    }

    default public Iterative6Args.Iterative6Args1<T2, T3, T4, T5, T6, T7, T1> inlineArgsLt1() {
        return new Iterative6Args.Iterative6Args1.Iterative6Args1Impl<T2, T3, T4, T5, T6, T7, T1>(this.splitRt6(), this.splitLt1(), false);
    }

    default public Iterative6Args.Iterative6Args1<T1, T2, T3, T4, T5, T6, T7> crossArgsRt1() {
        return new Iterative6Args.Iterative6Args1.Iterative6Args1Impl<T1, T2, T3, T4, T5, T6, T7>(this.splitLt6(), this.splitRt1(), true);
    }

    default public Iterative6Args.Iterative6Args1<T2, T3, T4, T5, T6, T7, T1> crossArgsLt1() {
        return new Iterative6Args.Iterative6Args1.Iterative6Args1Impl<T2, T3, T4, T5, T6, T7, T1>(this.splitRt6(), this.splitLt1(), true);
    }

    default public Iterative5Args.Iterative5Args2<T1, T2, T3, T4, T5, T6, T7> inlineArgsRt2() {
        return new Iterative5Args.Iterative5Args2.Iterative5Args2Impl<T1, T2, T3, T4, T5, T6, T7>(this.splitLt5(), this.splitRt2(), false);
    }

    default public Iterative5Args.Iterative5Args2<T3, T4, T5, T6, T7, T1, T2> inlineArgsLt2() {
        return new Iterative5Args.Iterative5Args2.Iterative5Args2Impl<T3, T4, T5, T6, T7, T1, T2>(this.splitRt5(), this.splitLt2(), false);
    }

    default public Iterative5Args.Iterative5Args2<T1, T2, T3, T4, T5, T6, T7> crossArgsRt2() {
        return new Iterative5Args.Iterative5Args2.Iterative5Args2Impl<T1, T2, T3, T4, T5, T6, T7>(this.splitLt5(), this.splitRt2(), true);
    }

    default public Iterative5Args.Iterative5Args2<T3, T4, T5, T6, T7, T1, T2> crossArgsLt2() {
        return new Iterative5Args.Iterative5Args2.Iterative5Args2Impl<T3, T4, T5, T6, T7, T1, T2>(this.splitRt5(), this.splitLt2(), true);
    }

    default public Iterative4Args.Iterative4Args3<T1, T2, T3, T4, T5, T6, T7> inlineArgsRt3() {
        return new Iterative4Args.Iterative4Args3.Iterative4Args3Impl<T1, T2, T3, T4, T5, T6, T7>(this.splitLt4(), this.splitRt3(), false);
    }

    default public Iterative4Args.Iterative4Args3<T4, T5, T6, T7, T1, T2, T3> inlineArgsLt3() {
        return new Iterative4Args.Iterative4Args3.Iterative4Args3Impl<T4, T5, T6, T7, T1, T2, T3>(this.splitRt4(), this.splitLt3(), false);
    }

    default public Iterative4Args.Iterative4Args3<T1, T2, T3, T4, T5, T6, T7> crossArgsRt3() {
        return new Iterative4Args.Iterative4Args3.Iterative4Args3Impl<T1, T2, T3, T4, T5, T6, T7>(this.splitLt4(), this.splitRt3(), true);
    }

    default public Iterative4Args.Iterative4Args3<T4, T5, T6, T7, T1, T2, T3> crossArgsLt3() {
        return new Iterative4Args.Iterative4Args3.Iterative4Args3Impl<T4, T5, T6, T7, T1, T2, T3>(this.splitRt4(), this.splitLt3(), true);
    }

    default public Iterative3Args.Iterative3Args4<T1, T2, T3, T4, T5, T6, T7> inlineArgsRt4() {
        return new Iterative3Args.Iterative3Args4.Iterative3Args4Impl<T1, T2, T3, T4, T5, T6, T7>(this.splitLt3(), this.splitRt4(), false);
    }

    default public Iterative3Args.Iterative3Args4<T5, T6, T7, T1, T2, T3, T4> inlineArgsLt4() {
        return new Iterative3Args.Iterative3Args4.Iterative3Args4Impl<T5, T6, T7, T1, T2, T3, T4>(this.splitRt3(), this.splitLt4(), false);
    }

    default public Iterative3Args.Iterative3Args4<T1, T2, T3, T4, T5, T6, T7> crossArgsRt4() {
        return new Iterative3Args.Iterative3Args4.Iterative3Args4Impl<T1, T2, T3, T4, T5, T6, T7>(this.splitLt3(), this.splitRt4(), true);
    }

    default public Iterative3Args.Iterative3Args4<T5, T6, T7, T1, T2, T3, T4> crossArgsLt4() {
        return new Iterative3Args.Iterative3Args4.Iterative3Args4Impl<T5, T6, T7, T1, T2, T3, T4>(this.splitRt3(), this.splitLt4(), true);
    }

    default public Iterative2Args.Iterative2Args5<T1, T2, T3, T4, T5, T6, T7> inlineArgsRt5() {
        return new Iterative2Args.Iterative2Args5.Iterative2Args5Impl<T1, T2, T3, T4, T5, T6, T7>(this.splitLt2(), this.splitRt5(), false);
    }

    default public Iterative2Args.Iterative2Args5<T6, T7, T1, T2, T3, T4, T5> inlineArgsLt5() {
        return new Iterative2Args.Iterative2Args5.Iterative2Args5Impl<T6, T7, T1, T2, T3, T4, T5>(this.splitRt2(), this.splitLt5(), false);
    }

    default public Iterative2Args.Iterative2Args5<T1, T2, T3, T4, T5, T6, T7> crossArgsRt5() {
        return new Iterative2Args.Iterative2Args5.Iterative2Args5Impl<T1, T2, T3, T4, T5, T6, T7>(this.splitLt2(), this.splitRt5(), true);
    }

    default public Iterative2Args.Iterative2Args5<T6, T7, T1, T2, T3, T4, T5> crossArgsLt5() {
        return new Iterative2Args.Iterative2Args5.Iterative2Args5Impl<T6, T7, T1, T2, T3, T4, T5>(this.splitRt2(), this.splitLt5(), true);
    }

    default public Iterative1Args.Iterative1Args6<T1, T2, T3, T4, T5, T6, T7> inlineArgsRt6() {
        return new Iterative1Args.Iterative1Args6.Iterative1Args6Impl<T1, T2, T3, T4, T5, T6, T7>(this.splitLt1(), this.splitRt6(), false);
    }

    default public Iterative1Args.Iterative1Args6<T7, T1, T2, T3, T4, T5, T6> inlineArgsLt6() {
        return new Iterative1Args.Iterative1Args6.Iterative1Args6Impl<T7, T1, T2, T3, T4, T5, T6>(this.splitRt1(), this.splitLt6(), false);
    }

    default public Iterative1Args.Iterative1Args6<T1, T2, T3, T4, T5, T6, T7> crossArgsRt6() {
        return new Iterative1Args.Iterative1Args6.Iterative1Args6Impl<T1, T2, T3, T4, T5, T6, T7>(this.splitLt1(), this.splitRt6(), true);
    }

    default public Iterative1Args.Iterative1Args6<T7, T1, T2, T3, T4, T5, T6> crossArgsLt6() {
        return new Iterative1Args.Iterative1Args6.Iterative1Args6Impl<T7, T1, T2, T3, T4, T5, T6>(this.splitRt1(), this.splitLt6(), true);
    }

    default public IterativeSupplier.Iterative1Supplier6.TransformSupplier<T1, T2, T3, T4, T5, T6, T7> iterativeSupplier() {
        return new IterativeSupplier.Iterative1Supplier6.Iterative1Supplier6Impl(this);
    }

    default public IterativeSupplier.Iterative1Supplier6.TransformSupplier<T1, T2, T3, T4, T5, T6, T7> crossSupplierAllLt() {
        return new IterativeSupplier.Iterative1Supplier6.Iterative1Supplier6Impl<T1, T2, T3, T4, T5, T6, T7>(this.forceCrossAll());
    }

    default public IterativeSupplier.Iterative1Supplier6.TransformSupplier<T1, T2, T3, T4, T5, T6, T7> inlineSupplierAllLt() {
        return new IterativeSupplier.Iterative1Supplier6.Iterative1Supplier6Impl<T1, T2, T3, T4, T5, T6, T7>(this.forceInlineAll());
    }

    default public IterativeSupplier.Iterative1Supplier6.TransformSupplier<T7, T1, T2, T3, T4, T5, T6> crossSupplierAllRt() {
        return new IterativeSupplier.Iterative1Supplier6.Iterative1Supplier6Impl<T7, T1, T2, T3, T4, T5, T6>(this.forceCrossAll().popBack().pushFrontCrossBy(this.iterableStream7()));
    }

    default public IterativeSupplier.Iterative1Supplier6.TransformSupplier<T7, T1, T2, T3, T4, T5, T6> inlineSupplierAllRt() {
        return new IterativeSupplier.Iterative1Supplier6.Iterative1Supplier6Impl<T7, T1, T2, T3, T4, T5, T6>(this.forceInlineAll().popBack().pushFrontInlineBy(this.iterableStream7()));
    }

    default public IterativeSupplier.Iterative1Supplier6.TransformSupplier<T1, T2, T3, T4, T5, T6, T7> crossSupplierLt() {
        return new IterativeSupplier.Iterative1Supplier6.Iterative1Supplier6Impl<T1, T2, T3, T4, T5, T6, T7>(this.forceCross2());
    }

    default public IterativeSupplier.Iterative1Supplier6.TransformSupplier<T1, T2, T3, T4, T5, T6, T7> inlineSupplierLt() {
        return new IterativeSupplier.Iterative1Supplier6.Iterative1Supplier6Impl<T1, T2, T3, T4, T5, T6, T7>(this.forceInline2());
    }

    default public IterativeSupplier.Iterative1Supplier6.TransformSupplier<T7, T1, T2, T3, T4, T5, T6> crossSupplierRt() {
        return new IterativeSupplier.Iterative1Supplier6.Iterative1Supplier6Impl<T7, T1, T2, T3, T4, T5, T6>(this.popBack().pushFrontCrossBy(this.iterableStream7()));
    }

    default public IterativeSupplier.Iterative1Supplier6.TransformSupplier<T7, T1, T2, T3, T4, T5, T6> inlineSupplierRt() {
        return new IterativeSupplier.Iterative1Supplier6.Iterative1Supplier6Impl<T7, T1, T2, T3, T4, T5, T6>(this.popBack().pushFrontInlineBy(this.iterableStream7()));
    }

    default public <A1> Iterative8<T1, T2, T3, T4, T5, T6, T7, A1> crossJoinRt(Iterative1<? extends A1> iterative) {
        return this.createCross(this, iterative.iterableStream1());
    }

    default public <A1> Iterative8<A1, T1, T2, T3, T4, T5, T6, T7> crossJoinLt(Iterative1<? extends A1> iterative) {
        return this.pushFrontCrossBy(iterative.iterableStream1());
    }

    default public <A1> Iterative8<T1, T2, T3, T4, T5, T6, T7, A1> inlineJoinRt(Iterative1<? extends A1> iterative) {
        return this.createInline(this, iterative.iterableStream1());
    }

    default public <A1> Iterative8<A1, T1, T2, T3, T4, T5, T6, T7> inlineJoinLt(Iterative1<? extends A1> iterative) {
        return this.pushFrontInlineBy(iterative.iterableStream1());
    }

    public static abstract class Iterative7Abst<T1, T2, T3, T4, T5, T6, T7> implements Iterative7<T1, T2, T3, T4, T5, T6, T7> {

        protected final Iterative6<T1, T2, T3, T4, T5, T6> iterative;
        protected final Iterable<Stream<T7>> right;

        Iterative7Abst(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends T7> right) {
            Objects.requireNonNull(iterative, "iterative is null");
            Objects.requireNonNull(right, "right is null");
            this.iterative = iterative;
            this.right = SimpleIterative.of(right).inlineMap(this::wrap).map(Stream::of).toIterable();
        }

        Iterative7Abst(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends Stream<? extends T7>> right, boolean ign) {
            Objects.requireNonNull(iterative, "iterative is null");
            Objects.requireNonNull(right, "right is null");
            this.iterative = iterative;
            this.right = SimpleIterative.of(right).map((Fn1 & Serializable)iter -> iter.flatMap(this::wrap));
        }

        @Override
        public Stream<Tuple7<T1, T2, T3, T4, T5, T6, T7>> toStream() {
            return this.toTupleStream().map(Fn7.tuple(IterativeHandler::cross)).flatMap(IterativeInternals::entityIterable);
        }

        @Override
        public Iterator<Iterable<?>> iterators() {
            return Iterator.concat((Iterable)Stream.of(this.iterative.iterators()).append((Object)Iterator.of(SimpleIterative.of(this.right).inlineMap(IterativeInternals::entityIterable).toIterable())));
        }

        @Override
        public Iterable<T1> iterable1() {
            return this.iterative.iterable1();
        }

        @Override
        public Iterable<T2> iterable2() {
            return this.iterative.iterable2();
        }

        @Override
        public Iterable<T3> iterable3() {
            return this.iterative.iterable3();
        }

        @Override
        public Iterable<T4> iterable4() {
            return this.iterative.iterable4();
        }

        @Override
        public Iterable<T5> iterable5() {
            return this.iterative.iterable5();
        }

        @Override
        public Iterable<T6> iterable6() {
            return this.iterative.iterable6();
        }

        @Override
        public Iterable<T7> iterable7() {
            return SimpleIterative.of(this.right).inlineMap(IterativeInternals::entityIterable);
        }

        @Override
        public Iterable<Stream<T1>> iterableStream1() {
            return this.iterative.iterableStream1();
        }

        @Override
        public Iterable<Stream<T2>> iterableStream2() {
            return this.iterative.iterableStream2();
        }

        @Override
        public Iterable<Stream<T3>> iterableStream3() {
            return this.iterative.iterableStream3();
        }

        @Override
        public Iterable<Stream<T4>> iterableStream4() {
            return this.iterative.iterableStream4();
        }

        @Override
        public Iterable<Stream<T5>> iterableStream5() {
            return this.iterative.iterableStream5();
        }

        @Override
        public Iterable<Stream<T6>> iterableStream6() {
            return this.iterative.iterableStream6();
        }

        @Override
        public Iterable<Stream<T7>> iterableStream7() {
            return this.right;
        }

        @Override
        public Iterative6<T1, T2, T3, T4, T5, T6> innerIterative() {
            return this.iterative;
        }

        @Override
        public Iterative1<T1> splitLt1() {
            return this.splitLt2().splitLt();
        }

        @Override
        public Iterative2<T1, T2> splitLt2() {
            return this.splitLt3().splitLt2();
        }

        @Override
        public Iterative3<T1, T2, T3> splitLt3() {
            return this.splitLt5().splitLt3();
        }

        @Override
        public Iterative4<T1, T2, T3, T4> splitLt4() {
            return this.splitLt5().splitLt4();
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> splitLt5() {
            return this.splitLt6().splitLt5();
        }

        @Override
        public Iterative6<T1, T2, T3, T4, T5, T6> splitLt6() {
            return this.innerIterative();
        }

        @Override
        public Iterative1<T7> splitRt1() {
            return this.splitRt2().splitRt();
        }

        @Override
        public Iterative2<T6, T7> splitRt2() {
            return this.splitRt3().splitRt2();
        }

        @Override
        public Iterative3<T5, T6, T7> splitRt3() {
            return this.splitRt4().splitRt3();
        }

        @Override
        public Iterative4<T4, T5, T6, T7> splitRt4() {
            return this.splitRt5().splitRt4();
        }

        @Override
        public Iterative5<T3, T4, T5, T6, T7> splitRt5() {
            return this.splitRt6().splitRt5();
        }

        @Override
        public Iterative6<T2, T3, T4, T5, T6, T7> splitRt6() {
            return this.popFront();
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCross2() {
            return this.create(this.iterative.forceCross2(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCross3() {
            return this.create(this.iterative.forceCross3(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCross4() {
            return this.create(this.iterative.forceCross4(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCross5() {
            return this.create(this.iterative.forceCross5(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCross6() {
            return this.create(this.iterative.forceCross6(), this.right);
        }

        @Override
        public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCross7() {
            return this.createCross(this.iterative, this.right);
        }

        @Override
        public Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> forceCrossAll() {
            return this.createCross(this.iterative.forceCrossAll(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceInline2() {
            return this.createInline(this.iterative.forceInline2(), this.right);
        }

        @Override
        public Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> forceInline3() {
            return this.createInline(this.iterative.forceInline3(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceInline4() {
            return this.createInline(this.iterative.forceInline4(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceInline5() {
            return this.createInline(this.iterative.forceInline5(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceInline6() {
            return this.createInline(this.iterative.forceInline6(), this.right);
        }

        @Override
        public Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> forceInline7() {
            return this.createInline(this.iterative, this.right);
        }

        @Override
        public Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> forceInlineAll() {
            return this.createInline(this.iterative.forceInlineAll(), this.right);
        }

        @Override
        public <T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> pushBackBy(Iterable<? extends Stream<? extends T8>> t8) {
            return this.create(this, t8);
        }

        @Override
        public <T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> pushBackCrossBy(Iterable<? extends Stream<? extends T8>> t8) {
            return this.createCross(this, t8);
        }

        @Override
        public <T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> pushBackInlineBy(Iterable<? extends Stream<? extends T8>> t8) {
            return this.createInline(this, t8);
        }

        @Override
        public <T0> Iterative8<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.pushFrontBy(t0), this.right);
        }

        @Override
        public <T0> Iterative8<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.pushFrontCrossBy(t0), this.right);
        }

        @Override
        public <T0> Iterative8<T0, T1, T2, T3, T4, T5, T6, T7> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.pushFrontInlineBy(t0), this.right);
        }

        @Override
        public Iterative6<T1, T2, T3, T4, T5, T6> popBack(Cs1<? super T7> c) {
            Objects.requireNonNull(c, "c is null");
            SimpleIterative.of(this.iterable7()).toIterable().forEach(c);
            return this.iterative;
        }

        @Override
        public Iterative6<T1, T2, T3, T4, T5, T6> popBackChain(Cs1<? super T7> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs7.tuple(c.ignoring6Lt()));
            return this.splitLt6();
        }

        @Override
        public Iterative6<T2, T3, T4, T5, T6, T7> popFront(Cs1<? super T1> c) {
            Objects.requireNonNull(c, "c is null");
            return this.create(this.iterative.popFront(c), this.iterableStream7());
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> popBack2(Cs2<? super T6, ? super T7> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt2().forEach(c);
            return this.splitLt5();
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> popBackChain2(Cs2<? super T6, ? super T7> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs7.tuple(c.ignoring5Lt()));
            return this.splitLt5();
        }

        @Override
        public Iterative5<T3, T4, T5, T6, T7> popFront2(Cs2<? super T1, ? super T2> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt2().forEach(c);
            return this.splitRt5();
        }

        @Override
        public Iterative4<T1, T2, T3, T4> popBack3(Cs3<? super T5, ? super T6, ? super T7> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt3().forEach(c);
            return this.splitLt4();
        }

        @Override
        public Iterative4<T1, T2, T3, T4> popBackChain3(Cs3<? super T5, ? super T6, ? super T7> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs7.tuple(c.ignoring4Lt()));
            return this.splitLt4();
        }

        @Override
        public Iterative4<T4, T5, T6, T7> popFront3(Cs3<? super T1, ? super T2, ? super T3> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt3().forEach(c);
            return this.splitRt4();
        }

        @Override
        public Iterative3<T1, T2, T3> popBack4(Cs4<? super T4, ? super T5, ? super T6, ? super T7> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt4().forEach(c);
            return this.splitLt3();
        }

        @Override
        public Iterative3<T1, T2, T3> popBackChain4(Cs4<? super T4, ? super T5, ? super T6, ? super T7> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs7.tuple(c.ignoring3Lt()));
            return this.splitLt3();
        }

        @Override
        public Iterative3<T5, T6, T7> popFront4(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt4().forEach(c);
            return this.splitRt3();
        }

        @Override
        public Iterative2<T1, T2> popBack5(Cs5<? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt5().forEach(c);
            return this.splitLt2();
        }

        @Override
        public Iterative2<T1, T2> popBackChain5(Cs5<? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs7.tuple(c.ignoring2Lt()));
            return this.splitLt2();
        }

        @Override
        public Iterative2<T6, T7> popFront5(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt5().forEach(c);
            return this.splitRt2();
        }

        @Override
        public Iterative1<T1> popBack6(Cs6<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt6().forEach(c);
            return this.splitLt1();
        }

        @Override
        public Iterative1<T1> popBackChain6(Cs6<? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs7.tuple(c.ignoring1Lt()));
            return this.splitLt1();
        }

        @Override
        public Iterative1<T7> popFront6(Cs6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt6().forEach(c);
            return this.splitRt1();
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> nonNullable() {
            return this.isNullable() ? this.create(this.iterative, this.right) : this;
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> nullable() {
            return this.isNullable() ? this : this.create(this.iterative, this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty1() {
            return this.create(this.iterative.forceCleanEmpty1(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty2() {
            return this.create(this.iterative.forceCleanEmpty2(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty3() {
            return this.create(this.iterative.forceCleanEmpty3(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty4() {
            return this.create(this.iterative.forceCleanEmpty4(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty5() {
            return this.create(this.iterative.forceCleanEmpty5(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty6() {
            return this.create(this.iterative.forceCleanEmpty6(), this.right);
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmpty7() {
            return this.create(this.iterative, IterativeHandler.clean(this.right));
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> forceCleanEmptyAll() {
            return this.create(this.iterative.forceCleanEmptyAll(), IterativeHandler.clean(this.right));
        }

        @Override
        public <R1, R2, R3, R4, R5, R6, R7> Iterative7<R1, R2, R3, R4, R5, R6, R7> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7) {
            Objects.requireNonNull(f1, "f1 is null");
            Objects.requireNonNull(f2, "f2 is null");
            Objects.requireNonNull(f3, "f3 is null");
            Objects.requireNonNull(f4, "f4 is null");
            Objects.requireNonNull(f5, "f5 is null");
            Objects.requireNonNull(f6, "f6 is null");
            Objects.requireNonNull(f7, "f7 is null");
            return this.create(this.iterative.map(f1, f2, f3, f4, f5, f6), SimpleIterative.of(this.iterableStream7()).map((Fn1 & Serializable)iter -> iter.map((Function)((Object)f7)).flatMap(this::wrap)).toIterable());
        }

        @Override
        public <R1, R2, R3, R4, R5, R6, R7> Iterative7<R1, R2, R3, R4, R5, R6, R7> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7) {
            Objects.requireNonNull(f1, "f1 is null");
            Objects.requireNonNull(f2, "f2 is null");
            Objects.requireNonNull(f3, "f3 is null");
            Objects.requireNonNull(f4, "f4 is null");
            Objects.requireNonNull(f5, "f5 is null");
            Objects.requireNonNull(f6, "f6 is null");
            Objects.requireNonNull(f7, "f7 is null");
            return this.create(this.iterative.inlineMap(f1, f2, f3, f4, f5, f6), SimpleIterative.of(this.iterableStream7()).map((Fn1 & Serializable)iter -> iter.flatMap((Function)((Object)f7)).flatMap(this::wrap)).toIterable());
        }

        @Override
        public Iterative7<T1, T2, T3, T4, T5, T6, T7> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7) {
            Objects.requireNonNull(p1, "p1 is null");
            Objects.requireNonNull(p2, "p2 is null");
            Objects.requireNonNull(p3, "p3 is null");
            Objects.requireNonNull(p4, "p4 is null");
            Objects.requireNonNull(p5, "p5 is null");
            Objects.requireNonNull(p6, "p6 is null");
            Objects.requireNonNull(p7, "p7 is null");
            return this.create(this.iterative.filter(p1, p2, p3, p4, p5, p6), SimpleIterative.of(this.iterableStream7()).map((Fn1 & Serializable)iter -> iter.filter((Predicate)p7).flatMap(this::wrap)).toIterable());
        }

        @Override
        public String toStringContent() {
            return Stream.of((Object[])new String[]{this.innerIterative().toStringContent(), IterativeHandler.typeIndicator(this.isCross()), IterativeHandler.iterableStreamToString(this.iterableStream7(), 7)}).mkString();
        }

        public String toString() {
            return IterativeHandler.iterativeHeader(7) + this.toStringContent();
        }

    }

}