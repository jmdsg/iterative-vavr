package com.fiberg.iterative.core;

import com.fiberg.iterative.function.*;
import io.vavr.Tuple;
import io.vavr.Tuple5;
import io.vavr.collection.Iterator;
import io.vavr.collection.Seq;
import io.vavr.collection.Stream;
import io.vavr.control.Option;
import io.vavr.control.Try;
import io.vavr.control.Validation;

import java.util.Objects;

public interface Iterative5<T1, T2, T3, T4, T5> extends IterativeConstructor {

    public static final int CARDINALITY = 5;

    public static <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> empty() {
        return Iterative.empty5();
    }

    public static <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> emptyNullable() {
        return Iterative.nullable().empty5();
    }

    public static <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> narrow(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative) {
        @SuppressWarnings("unchecked")
        final Iterative5<T1, T2, T3, T4, T5> iter = (Iterative5<T1, T2, T3, T4, T5>) iterative;
        return iter;
    }

    public String toStringContent();

    public Stream<Tuple5<Iterable<T1>, Iterable<T2>, Iterable<T3>, Iterable<T4>, Iterable<T5>>> toTupleStream();

    public Stream<Tuple5<T1, T2, T3, T4, T5>> toStream();

    public Iterative5<T1, T2, T3, T4, T5> nonNullable();

    public Iterative5<T1, T2, T3, T4, T5> nullable();

    public Iterable<T1> iterable1();

    public Iterable<T2> iterable2();

    public Iterable<T3> iterable3();

    public Iterable<T4> iterable4();

    public Iterable<T5> iterable5();

    public Iterable<Stream<T1>> iterableStream1();

    public Iterable<Stream<T2>> iterableStream2();

    public Iterable<Stream<T3>> iterableStream3();

    public Iterable<Stream<T4>> iterableStream4();

    public Iterable<Stream<T5>> iterableStream5();

    public Iterative4<T1, T2, T3, T4> innerIterative();

    public Iterative1<T1> splitLt1();

    public Iterative2<T1, T2> splitLt2();

    public Iterative3<T1, T2, T3> splitLt3();

    public Iterative4<T1, T2, T3, T4> splitLt4();

    public Iterative1<T5> splitRt1();

    public Iterative2<T4, T5> splitRt2();

    public Iterative3<T3, T4, T5> splitRt3();

    public Iterative4<T2, T3, T4, T5> splitRt4();

    public Iterative5<T1, T2, T3, T4, T5> forceCross2();

    public Iterative5<T1, T2, T3, T4, T5> forceCross3();

    public Iterative5<T1, T2, T3, T4, T5> forceCross4();

    public Iterative5Cross<T1, T2, T3, T4, T5> forceCross5();

    public Iterative5Cross<T1, T2, T3, T4, T5> forceCrossAll();

    public Iterative5<T1, T2, T3, T4, T5> forceInline2();

    public Iterative5<T1, T2, T3, T4, T5> forceInline3();

    public Iterative5<T1, T2, T3, T4, T5> forceInline4();

    public Iterative5Inline<T1, T2, T3, T4, T5> forceInline5();

    public Iterative5Inline<T1, T2, T3, T4, T5> forceInlineAll();

    public Iterative5<T1, T2, T3, T4, T5> forceCleanEmpty1();

    public Iterative5<T1, T2, T3, T4, T5> forceCleanEmpty2();

    public Iterative5<T1, T2, T3, T4, T5> forceCleanEmpty3();

    public Iterative5<T1, T2, T3, T4, T5> forceCleanEmpty4();

    public Iterative5<T1, T2, T3, T4, T5> forceCleanEmpty5();

    public Iterative5<T1, T2, T3, T4, T5> forceCleanEmptyAll();

    public <T6> Iterative6<T1, T2, T3, T4, T5, T6> pushBackBy(Iterable<? extends Stream<? extends T6>> i1);

    public <T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> pushBackCrossBy(Iterable<? extends Stream<? extends T6>> i1);

    public <T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> pushBackInlineBy(Iterable<? extends Stream<? extends T6>> i1);

    public <T0> Iterative6<T0, T1, T2, T3, T4, T5> pushFrontBy(Iterable<? extends Stream<? extends T0>> i1);

    public <T0> Iterative6<T0, T1, T2, T3, T4, T5> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> i1);

    public <T0> Iterative6<T0, T1, T2, T3, T4, T5> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> i1);

    public Iterative4<T1, T2, T3, T4> popBack(Cs1<? super T5> c1);

    public Iterative4<T1, T2, T3, T4> popBackChain(Cs1<? super T5> c1);

    public Iterative4<T2, T3, T4, T5> popFront(Cs1<? super T1> c1);

    default public Iterative4<T1, T2, T3, T4> popBack() {
        return this.popBack(Cs1.empty());
    }

    default public Iterative4<T2, T3, T4, T5> popFront() {
        return this.popFront(Cs1.empty());
    }

    public Iterative3<T1, T2, T3> popBack2(Cs2<? super T4, ? super T5> c1);

    public Iterative3<T1, T2, T3> popBackChain2(Cs2<? super T4, ? super T5> c1);

    public Iterative3<T3, T4, T5> popFront2(Cs2<? super T1, ? super T2> c1);

    default public Iterative3<T1, T2, T3> popBack2(Cs1<? super T4> c4, Cs1<? super T5> c5) {
        return this.popBack(c5).popBack(c4);
    }

    default public Iterative3<T3, T4, T5> popFront2(Cs1<? super T1> c1, Cs1<? super T2> c2) {
        return this.popFront(c1).popFront(c2);
    }

    default public Iterative3<T1, T2, T3> popBack2() {
        return this.popBack2(Cs1.empty(), Cs1.empty());
    }

    default public Iterative3<T3, T4, T5> popFront2() {
        return this.popFront2(Cs1.empty(), Cs1.empty());
    }

    public Iterative2<T1, T2> popBack3(Cs3<? super T3, ? super T4, ? super T5> c1);

    public Iterative2<T1, T2> popBackChain3(Cs3<? super T3, ? super T4, ? super T5> c1);

    public Iterative2<T4, T5> popFront3(Cs3<? super T1, ? super T2, ? super T3> c1);

    default public Iterative2<T1, T2> popBack3(Cs1<? super T3> c3, Cs1<? super T4> c4, Cs1<? super T5> c5) {
        return this.popBack(c5).popBack(c4).popBack(c3);
    }

    default public Iterative2<T4, T5> popFront3(Cs1<? super T1> c1, Cs1<? super T2> c2, Cs1<? super T3> c3) {
        return this.popFront(c1).popFront(c2).popFront(c3);
    }

    default public Iterative2<T1, T2> popBack3() {
        return this.popBack3(Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    default public Iterative2<T4, T5> popFront3() {
        return this.popFront3(Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    public Iterative1<T1> popBack4(Cs4<? super T2, ? super T3, ? super T4, ? super T5> c1);

    public Iterative1<T1> popBackChain4(Cs4<? super T2, ? super T3, ? super T4, ? super T5> c1);

    public Iterative1<T5> popFront4(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c1);

    default public Iterative1<T1> popBack4(Cs1<? super T2> c2, Cs1<? super T3> c3, Cs1<? super T4> c4, Cs1<? super T5> c5) {
        return this.popBack(c5).popBack(c4).popBack(c3).popBack(c2);
    }

    default public Iterative1<T5> popFront4(Cs1<? super T1> c1, Cs1<? super T2> c2, Cs1<? super T3> c3, Cs1<? super T4> c4) {
        return this.popFront(c1).popFront(c2).popFront(c3).popFront(c4);
    }

    default public Iterative1<T1> popBack4() {
        return this.popBack4(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    default public Iterative1<T5> popFront4() {
        return this.popFront4(Cs1.empty(), Cs1.empty(), Cs1.empty(), Cs1.empty());
    }

    public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5);

    public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> i2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> i4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5);

    public Iterative5<T1, T2, T3, T4, T5> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5);

    default public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> flatMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5) {
        return this.inlineMap(f1, f2, f3, f4, f5).forceFlatAll();
    }

    @Override
    default public Iterative5<T1, T2, T3, T4, T5> onSuccess(Rn r) {
        return this.onSuccess(r.ignoring1());
    }

    @Override
    default public Iterative5<T1, T2, T3, T4, T5> onFailure(Rn r) {
        return this.onFailure(r.ignoring1());
    }

    default public Iterative5<T1, T2, T3, T4, T5> execute(Cs1<? super Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> c) {
        Objects.requireNonNull(c, "c is null");
        c.accept(this);
        return this;
    }

    default public Iterative5<T1, T2, T3, T4, T5> onFailure(Cs1<? super Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().toTry().recover(t -> null).filter(Objects::isNull).forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative5<T1, T2, T3, T4, T5> onSuccess(Cs1<? super Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().headOption().forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative5<T1, T2, T3, T4, T5> onSuccessful(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        return this.forEach(c);
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover1(T1 t1) {
        return this.splitLt4().recover1(t1).pushBackBy(this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover1Of(Iterable<? extends T1> t1) {
        return this.splitLt4().recover1Of(t1).pushBackBy(this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover1By(Iterable<? extends Stream<? extends T1>> t1) {
        return this.splitLt4().recover1By(t1).pushBackBy(this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover2(T2 t2) {
        return this.splitLt4().recover2(t2).pushBackBy(this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover2Of(Iterable<? extends T2> t2) {
        return this.splitLt4().recover2Of(t2).pushBackBy(this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover2By(Iterable<? extends Stream<? extends T2>> t2) {
        return this.splitLt4().recover2By(t2).pushBackBy(this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover3(T3 t3) {
        return this.splitLt4().recover3(t3).pushBackBy(this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover3Of(Iterable<? extends T3> t3) {
        return this.splitLt4().recover3Of(t3).pushBackBy(this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover3By(Iterable<? extends Stream<? extends T3>> t3) {
        return this.splitLt4().recover3By(t3).pushBackBy(this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover4(T4 t4) {
        return this.splitLt4().recover4(t4).pushBackBy(this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover4Of(Iterable<? extends T4> t4) {
        return this.splitLt4().recover4Of(t4).pushBackBy(this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover4By(Iterable<? extends Stream<? extends T4>> t4) {
        return this.splitLt4().recover4By(t4).pushBackBy(this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover5(T5 t5) {
        return this.splitRt1().isFailure() ? this.splitLt4().<T5>pushBack(t5) : this;
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover5Of(Iterable<? extends T5> t5) {
        return this.splitRt1().isFailure() ? this.splitLt4().<T5>pushBackOf(t5) : this;
    }

    default public Iterative5<T1, T2, T3, T4, T5> recover5By(Iterable<? extends Stream<? extends T5>> t5) {
        return this.splitRt1().isFailure() ? this.splitLt4().<T5>pushBackBy(t5) : this;
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEach(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().forEach(Cs5.tuple(c));
        return this;
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEach(Rn r) {
        return this.forEach(r.ignoring5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEach1(Cs1<? super T1> c) {
        return this.forEach(c.ignoring4Rt());
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEach2(Cs1<? super T2> c) {
        return this.forEach(c.ignoring3Rt().ignoring1Lt());
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEach3(Cs1<? super T3> c) {
        return this.forEach(c.ignoring2Rt().ignoring2Lt());
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEach4(Cs1<? super T4> c) {
        return this.forEach(c.ignoring1Rt().ignoring3Lt());
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEach5(Cs1<? super T5> c) {
        return this.forEach(c.ignoring4Lt());
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEachWhen1(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, Pr1<? super T1> p) {
        return this.forEachWhen(c, p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEachWhen2(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, Pr1<? super T2> p) {
        return this.forEachWhen(c, Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEachWhen3(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, Pr1<? super T3> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEachWhen4(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, Pr1<? super T4> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true));
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEachWhen5(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, Pr1<? super T5> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEachWhen(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5) {
        Objects.requireNonNull(c, "c is null");
        Objects.requireNonNull(p1, "p1 is null");
        Objects.requireNonNull(p2, "p2 is null");
        Objects.requireNonNull(p3, "p3 is null");
        Objects.requireNonNull(p4, "p4 is null");
        Objects.requireNonNull(p5, "p5 is null");
        this.filter(p1, p2, p3, p4, p5).toStream().forEach(Cs5.tuple(c));
        return this;
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEachWhen(Cs5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(c, "c is null");
        Objects.requireNonNull(p, "p is null");
        this.toStream().filter(Pr5.tuple(p)).forEach(Cs5.tuple(c));
        return this;
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEach1When(Cs1<? super T1> c, Pr1<? super T1> p) {
        return this.forEachWhen1(c.ignoring4Rt(), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEach2When(Cs1<? super T2> c, Pr1<? super T2> p) {
        return this.forEachWhen2(c.ignoring3Rt().ignoring1Lt(), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEach3When(Cs1<? super T3> c, Pr1<? super T3> p) {
        return this.forEachWhen3(c.ignoring2Rt().ignoring2Lt(), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEach4When(Cs1<? super T4> c, Pr1<? super T4> p) {
        return this.forEachWhen4(c.ignoring1Rt().ignoring3Lt(), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> forEach5When(Cs1<? super T5> c, Pr1<? super T5> p) {
        return this.forEachWhen5(c.ignoring4Lt(), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace1When(Fn1<? super T1, ? extends T1> f, Pr1<? super T1> p) {
        return this.map1(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace1When(Sp<? extends T1> s, Pr1<? super T1> p) {
        return this.replace1When(s.toFunction().ignoring1(), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace1When(T1 t, Pr1<? super T1> p) {
        return this.replace1When(Fn1.value(t), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace2When(Fn1<? super T2, ? extends T2> f, Pr1<? super T2> p) {
        return this.map2(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace2When(Sp<? extends T2> s, Pr1<? super T2> p) {
        return this.replace2When(s.toFunction().ignoring1(), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace2When(T2 t, Pr1<? super T2> p) {
        return this.replace2When(Fn1.value(t), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace3When(Fn1<? super T3, ? extends T3> f, Pr1<? super T3> p) {
        return this.map3(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace3When(Sp<? extends T3> s, Pr1<? super T3> p) {
        return this.replace3When(s.toFunction().ignoring1(), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace3When(T3 t, Pr1<? super T3> p) {
        return this.replace3When(Fn1.value(t), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace4When(Fn1<? super T4, ? extends T4> f, Pr1<? super T4> p) {
        return this.map4(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace4When(Sp<? extends T4> s, Pr1<? super T4> p) {
        return this.replace4When(s.toFunction().ignoring1(), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace4When(T4 t, Pr1<? super T4> p) {
        return this.replace4When(Fn1.value(t), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace5When(Fn1<? super T5, ? extends T5> f, Pr1<? super T5> p) {
        return this.map5(t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace5When(Sp<? extends T5> s, Pr1<? super T5> p) {
        return this.replace5When(s.toFunction().ignoring1(), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> replace5When(T5 t, Pr1<? super T5> p) {
        return this.replace5When(Fn1.value(t), p);
    }

    default public Iterable<Tuple5<T1, T2, T3, T4, T5>> yield() {
        return this.yield(Tuple::of);
    }

    default public <R> Iterable<R> yield(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn5.tuple(f)).flatMap(this::wrap);
    }

    default public Stream<Tuple5<T1, T2, T3, T4, T5>> yieldStream() {
        return this.yieldStream(Tuple::of);
    }

    default public <R> Stream<R> yieldStream(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn5.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Stream<R> yieldFlatStream(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldStream(f).flatMap(IterativeInternals::identity).flatMap(this::wrap);
    }

    default public Option<Tuple5<T1, T2, T3, T4, T5>> yieldOption() {
        return this.yieldOption(Tuple::of);
    }

    default public <R> Option<R> yieldOption(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().map(Fn5.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Option<R> yieldFlatOption(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldOption(f).flatMap(IterativeInternals::identity).flatMap(this::wrap);
    }

    default public Try<Tuple5<T1, T2, T3, T4, T5>> yieldTry() {
        return this.yieldTry(Tuple::of);
    }

    default public <R> Try<R> yieldTry(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().toTry().mapTry(Fnc5.tuple(f)).flatMap(this::wrapTry);
    }

    default public <R> Try<R> yieldFlatTry(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldTry(f).flatMap(IterativeInternals::identity).flatMap(this::wrapTry);
    }

    default public Validation<Seq<Throwable>, Stream<Tuple5<T1, T2, T3, T4, T5>>> validateStream() {
        return this.validateStream(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateStream(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldStream(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateFlatStream(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatStream(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Option<Tuple5<T1, T2, T3, T4, T5>>> validateOption() {
        return this.validateOption(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateOption(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldOption(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateFlatOption(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatOption(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Try<Tuple5<T1, T2, T3, T4, T5>>> validateTry() {
        return this.validateTry(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateTry(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateFlatTry(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Iterative5<R, T2, T3, T4, T5> map1(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(f, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R> Iterative5<T1, R, T3, T4, T5> map2(Fn1<? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::identity, f, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R> Iterative5<T1, T2, R, T4, T5> map3(Fn1<? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::identity, IterativeInternals::identity, f, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R> Iterative5<T1, T2, T3, R, T5> map4(Fn1<? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, f, IterativeInternals::identity);
    }

    default public <R> Iterative5<T1, T2, T3, T4, R> map5(Fn1<? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.map(IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, f);
    }

    default public <R4, R5> Iterative5<T1, T2, T3, R4, R5> mapRt2(Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5) {
        return this.map(IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity, f4, f5);
    }

    default public <R1, R2> Iterative5<R1, R2, T3, T4, T5> mapLt2(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2) {
        return this.map(f1, f2, IterativeInternals::identity, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R3, R4, R5> Iterative5<T1, T2, R3, R4, R5> mapRt3(Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5) {
        return this.map(IterativeInternals::identity, IterativeInternals::identity, f3, f4, f5);
    }

    default public <R1, R2, R3> Iterative5<R1, R2, R3, T4, T5> mapLt3(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3) {
        return this.map(f1, f2, f3, IterativeInternals::identity, IterativeInternals::identity);
    }

    default public <R2, R3, R4, R5> Iterative5<T1, R2, R3, R4, R5> mapRt4(Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5) {
        return this.map(IterativeInternals::identity, f2, f3, f4, f5);
    }

    default public <R1, R2, R3, R4> Iterative5<R1, R2, R3, R4, T5> mapLt4(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4) {
        return this.map(f1, f2, f3, f4, IterativeInternals::identity);
    }

    default public <R> Iterative5<R, T2, T3, T4, T5> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(f, this::wrap, this::wrap, this::wrap, this::wrap);
    }

    default public <R> Iterative5<T1, R, T3, T4, T5> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, f, this::wrap, this::wrap, this::wrap);
    }

    default public <R> Iterative5<T1, T2, R, T4, T5> inlineMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, f, this::wrap, this::wrap);
    }

    default public <R> Iterative5<T1, T2, T3, R, T5> inlineMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, this::wrap, f, this::wrap);
    }

    default public <R> Iterative5<T1, T2, T3, T4, R> inlineMap5(Fn1<? super T5, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.inlineMap(this::wrap, this::wrap, this::wrap, this::wrap, f);
    }

    default public <R4, R5> Iterative5<T1, T2, T3, R4, R5> inlineMapRt2(Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5) {
        return this.inlineMap(this::wrap, this::wrap, this::wrap, f4, f5);
    }

    default public <R1, R2> Iterative5<R1, R2, T3, T4, T5> inlineMapLt2(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
        return this.inlineMap(f1, f2, this::wrap, this::wrap, this::wrap);
    }

    default public <R3, R4, R5> Iterative5<T1, T2, R3, R4, R5> inlineMapRt3(Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5) {
        return this.inlineMap(this::wrap, this::wrap, f3, f4, f5);
    }

    default public <R1, R2, R3> Iterative5<R1, R2, R3, T4, T5> inlineMapLt3(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3) {
        return this.inlineMap(f1, f2, f3, this::wrap, this::wrap);
    }

    default public <R2, R3, R4, R5> Iterative5<T1, R2, R3, R4, R5> inlineMapRt4(Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5) {
        return this.inlineMap(this::wrap, f2, f3, f4, f5);
    }

    default public <R1, R2, R3, R4> Iterative5<R1, R2, R3, R4, T5> inlineMapLt4(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
        return this.inlineMap(f1, f2, f3, f4, this::wrap);
    }

    default public <R> Iterative5<R, T2, T3, T4, T5> flatMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return this.inlineMap1(f).forceFlat1();
    }

    default public <R> Iterative5<T1, R, T3, T4, T5> flatMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return this.inlineMap2(f).forceFlat2();
    }

    default public <R> Iterative5<T1, T2, R, T4, T5> flatMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return this.inlineMap3(f).forceFlat3();
    }

    default public <R> Iterative5<T1, T2, T3, R, T5> flatMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        return this.inlineMap4(f).forceFlat4();
    }

    default public <R> Iterative5<T1, T2, T3, T4, R> flatMap5(Fn1<? super T5, ? extends Iterable<? extends R>> f) {
        return this.inlineMap5(f).forceFlat5();
    }

    default public <R4, R5> Iterative5<T1, T2, T3, R4, R5> flatMapRt2(Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5) {
        return this.flatMapRt2(f4, f5).forceFlat2();
    }

    default public <R1, R2> Iterative5<R1, R2, T3, T4, T5> flatMapLt2(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
        return this.inlineMapLt2(f1, f2).forceFlat2();
    }

    default public <R3, R4, R5> Iterative5<T1, T2, R3, R4, R5> flatMapRt3(Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5) {
        return this.inlineMapRt3(f3, f4, f5).forceFlat3();
    }

    default public <R1, R2, R3> Iterative5<R1, R2, R3, T4, T5> flatMapLt3(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3) {
        return this.inlineMapLt3(f1, f2, f3).forceFlat3();
    }

    default public <R2, R3, R4, R5> Iterative5<T1, R2, R3, R4, R5> flatMapRt4(Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5) {
        return this.inlineMapRt4(f2, f3, f4, f5).forceFlat4();
    }

    default public <R1, R2, R3, R4> Iterative5<R1, R2, R3, R4, T5> flatMapLt4(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4) {
        return this.inlineMapLt4(f1, f2, f3, f4).forceFlat4();
    }

    default public Iterative5<T1, T2, T3, T4, T5> filter1(Pr1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(p, Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative5<T1, T2, T3, T4, T5> filter2(Pr1<? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), p, Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative5<T1, T2, T3, T4, T5> filter3(Pr1<? super T3> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), p, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative5<T1, T2, T3, T4, T5> filter4(Pr1<? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), p, Pr1.value(true));
    }

    default public Iterative5<T1, T2, T3, T4, T5> filter5(Pr1<? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return this.filter(Pr1.value(true), Pr1.value(true), Pr1.value(true), Pr1.value(true), p);
    }

    default public Iterative5<T1, T2, T3, T4, T5> filterLt2(Pr1<? super T1> p1, Pr1<? super T2> p2) {
        return this.filter(p1, p2, Pr1.value(true), Pr1.value(true), Pr1.value(true));
    }

    default public Iterative5<T1, T2, T3, T4, T5> filterRt3(Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5) {
        return this.filter(Pr1.value(true), Pr1.value(true), p3, p4, p5);
    }

    default public Iterative5<T1, T2, T3, T4, T5> filterLt3(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3) {
        return this.filter(p1, p2, p3, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative5<T1, T2, T3, T4, T5> filterRt4(Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5) {
        return this.filter(Pr1.value(true), p2, p3, p4, p5);
    }

    default public Iterative5<T1, T2, T3, T4, T5> filterLt4(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4) {
        return this.filter(p1, p2, p3, p4, Pr1.value(true));
    }

    default public <T6> Iterative6<T1, T2, T3, T4, T5, T6> pushBackOf(Iterable<? extends T6> t6) {
        return this.pushBackBy(IterativeHandler.streamWrap(t6));
    }

    default public <T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> pushBackCrossOf(Iterable<? extends T6> t6) {
        return this.pushBackCrossBy(IterativeHandler.streamWrap(t6));
    }

    default public <T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> pushBackInlineOf(Iterable<? extends T6> t6) {
        return this.pushBackInlineBy(IterativeHandler.streamWrap(t6));
    }

    default public <T0> Iterative6<T0, T1, T2, T3, T4, T5> pushFrontOf(Iterable<? extends T0> t0) {
        return this.pushFrontBy(IterativeHandler.streamWrap(t0));
    }

    default public <T0> Iterative6<T0, T1, T2, T3, T4, T5> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return this.pushFrontCrossBy(IterativeHandler.streamWrap(t0));
    }

    default public <T0> Iterative6<T0, T1, T2, T3, T4, T5> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return this.pushFrontInlineBy(IterativeHandler.streamWrap(t0));
    }

    default public <T6> Iterative6<T1, T2, T3, T4, T5, T6> pushBack(T6 t6) {
        return this.pushBackOf(this.wrap(t6));
    }

    default public <T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> pushBackCross(T6 t6) {
        return this.pushBackCrossOf(this.wrap(t6));
    }

    default public <T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> pushBackInline(T6 t6) {
        return this.pushBackInlineOf(this.wrap(t6));
    }

    default public <T0> Iterative6<T0, T1, T2, T3, T4, T5> pushFront(T0 t0) {
        return this.pushFrontOf(this.wrap(t0));
    }

    default public <T0> Iterative6<T0, T1, T2, T3, T4, T5> pushFrontCross(T0 t0) {
        return this.pushFrontCrossOf(this.wrap(t0));
    }

    default public <T0> Iterative6<T0, T1, T2, T3, T4, T5> pushFrontInline(T0 t0) {
        return this.pushFrontInlineOf(this.wrap(t0));
    }

    default public <B1, B2> Iterative7<T1, T2, T3, T4, T5, B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.<B1>pushBackBy(b1).<B2>pushBackBy(b2);
    }

    default public <B1, B2> Iterative7Cross<T1, T2, T3, T4, T5, B1, B2> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.<B1>pushBackCrossBy(b1).<B2>pushBackCrossBy(b2);
    }

    default public <B1, B2> Iterative7Inline<T1, T2, T3, T4, T5, B1, B2> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.<B1>pushBackInlineBy(b1).<B2>pushBackInlineBy(b2);
    }

    default public <F1, F2> Iterative7<F1, F2, T1, T2, T3, T4, T5> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.<F2>pushFrontBy(f2).<F1>pushFrontBy(f1);
    }

    default public <F1, F2> Iterative7<F1, F2, T1, T2, T3, T4, T5> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.<F2>pushFrontCrossBy(f2).<F1>pushFrontCrossBy(f1);
    }

    default public <F1, F2> Iterative7<F1, F2, T1, T2, T3, T4, T5> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.<F2>pushFrontInlineBy(f2).<F1>pushFrontInlineBy(f1);
    }

    default public <B1, B2> Iterative7<T1, T2, T3, T4, T5, B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.<B1>pushBackOf(b1).<B2>pushBackOf(b2);
    }

    default public <B1, B2> Iterative7Cross<T1, T2, T3, T4, T5, B1, B2> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.<B1>pushBackCrossOf(b1).<B2>pushBackCrossOf(b2);
    }

    default public <B1, B2> Iterative7Inline<T1, T2, T3, T4, T5, B1, B2> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.<B1>pushBackInlineOf(b1).<B2>pushBackInlineOf(b2);
    }

    default public <F1, F2> Iterative7<F1, F2, T1, T2, T3, T4, T5> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.<F2>pushFrontOf(f2).<F1>pushFrontOf(f1);
    }

    default public <F1, F2> Iterative7<F1, F2, T1, T2, T3, T4, T5> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.<F2>pushFrontCrossOf(f2).<F1>pushFrontCrossOf(f1);
    }

    default public <F1, F2> Iterative7<F1, F2, T1, T2, T3, T4, T5> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.<F2>pushFrontInlineOf(f2).<F1>pushFrontInlineOf(f1);
    }

    default public <B1, B2> Iterative7<T1, T2, T3, T4, T5, B1, B2> pushBack(B1 b1, B2 b2) {
        return this.<B1>pushBack(b1).<B2>pushBack(b2);
    }

    default public <B1, B2> Iterative7Cross<T1, T2, T3, T4, T5, B1, B2> pushBackCross(B1 b1, B2 b2) {
        return this.<B1>pushBackCross(b1).<B2>pushBackCross(b2);
    }

    default public <B1, B2> Iterative7Inline<T1, T2, T3, T4, T5, B1, B2> pushBackInline(B1 b1, B2 b2) {
        return this.<B1>pushBackInline(b1).<B2>pushBackInline(b2);
    }

    default public <F1, F2> Iterative7<F1, F2, T1, T2, T3, T4, T5> pushFront(F1 f1, F2 f2) {
        return this.<F2>pushFront(f2).<F1>pushFront(f1);
    }

    default public <F1, F2> Iterative7<F1, F2, T1, T2, T3, T4, T5> pushFrontCross(F1 f1, F2 f2) {
        return this.<F2>pushFrontCross(f2).<F1>pushFrontCross(f1);
    }

    default public <F1, F2> Iterative7<F1, F2, T1, T2, T3, T4, T5> pushFrontInline(F1 f1, F2 f2) {
        return this.<F2>pushFrontInline(f2).<F1>pushFrontInline(f1);
    }

    default public <B1, B2, B3> Iterative8<T1, T2, T3, T4, T5, B1, B2, B3> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.<B1>pushBackBy(b1).<B2>pushBackBy(b2).<B3>pushBackBy(b3);
    }

    default public <B1, B2, B3> Iterative8Cross<T1, T2, T3, T4, T5, B1, B2, B3> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.<B1>pushBackCrossBy(b1).<B2>pushBackCrossBy(b2).<B3>pushBackCrossBy(b3);
    }

    default public <B1, B2, B3> Iterative8Inline<T1, T2, T3, T4, T5, B1, B2, B3> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.<B1>pushBackInlineBy(b1).<B2>pushBackInlineBy(b2).<B3>pushBackInlineBy(b3);
    }

    default public <F1, F2, F3> Iterative8<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.<F3>pushFrontBy(f3).<F2>pushFrontBy(f2).<F1>pushFrontBy(f1);
    }

    default public <F1, F2, F3> Iterative8<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.<F3>pushFrontCrossBy(f3).<F2>pushFrontCrossBy(f2).<F1>pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3> Iterative8<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.<F3>pushFrontInlineBy(f3).<F2>pushFrontInlineBy(f2).<F1>pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3> Iterative8<T1, T2, T3, T4, T5, B1, B2, B3> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.<B1>pushBackOf(b1).<B2>pushBackOf(b2).<B3>pushBackOf(b3);
    }

    default public <B1, B2, B3> Iterative8Cross<T1, T2, T3, T4, T5, B1, B2, B3> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.<B1>pushBackCrossOf(b1).<B2>pushBackCrossOf(b2).<B3>pushBackCrossOf(b3);
    }

    default public <B1, B2, B3> Iterative8Inline<T1, T2, T3, T4, T5, B1, B2, B3> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.<B1>pushBackInlineOf(b1).<B2>pushBackInlineOf(b2).<B3>pushBackInlineOf(b3);
    }

    default public <F1, F2, F3> Iterative8<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.<F3>pushFrontOf(f3).<F2>pushFrontOf(f2).<F1>pushFrontOf(f1);
    }

    default public <F1, F2, F3> Iterative8<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.<F3>pushFrontCrossOf(f3).<F2>pushFrontCrossOf(f2).<F1>pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3> Iterative8<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.<F3>pushFrontInlineOf(f3).<F2>pushFrontInlineOf(f2).<F1>pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3> Iterative8<T1, T2, T3, T4, T5, B1, B2, B3> pushBack(B1 b1, B2 b2, B3 b3) {
        return this.<B1>pushBack(b1).<B2>pushBack(b2).<B3>pushBack(b3);
    }

    default public <B1, B2, B3> Iterative8Cross<T1, T2, T3, T4, T5, B1, B2, B3> pushBackCross(B1 b1, B2 b2, B3 b3) {
        return this.<B1>pushBackCross(b1).<B2>pushBackCross(b2).<B3>pushBackCross(b3);
    }

    default public <B1, B2, B3> Iterative8Inline<T1, T2, T3, T4, T5, B1, B2, B3> pushBackInline(B1 b1, B2 b2, B3 b3) {
        return this.<B1>pushBackInline(b1).<B2>pushBackInline(b2).<B3>pushBackInline(b3);
    }

    default public <F1, F2, F3> Iterative8<F1, F2, F3, T1, T2, T3, T4, T5> pushFront(F1 f1, F2 f2, F3 f3) {
        return this.<F3>pushFront(f3).<F2>pushFront(f2).<F1>pushFront(f1);
    }

    default public <F1, F2, F3> Iterative8<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontCross(F1 f1, F2 f2, F3 f3) {
        return this.<F3>pushFrontCross(f3).<F2>pushFrontCross(f2).<F1>pushFrontCross(f1);
    }

    default public <F1, F2, F3> Iterative8<F1, F2, F3, T1, T2, T3, T4, T5> pushFrontInline(F1 f1, F2 f2, F3 f3) {
        return this.<F3>pushFrontInline(f3).<F2>pushFrontInline(f2).<F1>pushFrontInline(f1);
    }

    default public Iterative5<T1, T2, T3, T4, T5> forceInlineFlat() {
        return Iterative.ofTuple5(this.yieldStream());
    }

    default public Iterative5<T1, T2, T3, T4, T5> forceFlat1() {
        return this.create(this.splitLt4().forceFlat1(), this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> forceFlat2() {
        return this.create(this.splitLt4().forceFlat2(), this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> forceFlat3() {
        return this.create(this.splitLt4().forceFlat3(), this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> forceFlat4() {
        return this.create(this.splitLt4().forceFlat4(), this.iterableStream5());
    }

    default public Iterative5<T1, T2, T3, T4, T5> forceFlat5() {
        return this.create(this.splitLt4(), IterativeHandler.streamWrap(this.iterable5()));
    }

    default public Iterative5<T1, T2, T3, T4, T5> forceFlatAll() {
        return this.create(this.splitLt4().forceFlatAll(), IterativeHandler.streamWrap(this.iterable5()));
    }

    default public <R> R getOnSuccessOrNull(Fn1<? super Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>, ? extends R> f) {
        return this.getterOnSuccess(f).onFailure(Sp.empty());
    }

    default public <R> R getOnSuccessOrThrow(Fn1<? super Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>, ? extends R> f) {
        return this.<R>getterOnSuccess(Fn1.narrow(f)).onFailure(Fn0.<String, R>pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public Tuple5<T1, T2, T3, T4, T5> getOrElse(Sp<? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> s) {
        return this.getterOnSuccess().onFailure(s.afterApply(Tuple::narrow));
    }

    default public Tuple5<T1, T2, T3, T4, T5> getOrElse(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> t) {
        return this.getterOnSuccess().onFailure(Sp.value(Tuple.narrow(t)));
    }

    default public Tuple5<T1, T2, T3, T4, T5> getOrNull() {
        return this.getterOnSuccess().onFailure(Sp.empty());
    }

    default public Tuple5<T1, T2, T3, T4, T5> getOrThrow() {
        return this.getterOnSuccess().onFailure(Fn0.<String, Tuple5<T1, T2, T3, T4, T5>>pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public Iterative5Getter<T1, T2, T3, T4, T5> getter() {
        return new Iterative5Getter.Iterative5GetterImpl<>(this);
    }

    default public Iterative5Getter.Iterative5Fail<T1, T2, T3, T4, T5, Tuple5<T1, T2, T3, T4, T5>> getterOnSuccess() {
        return this.getter().onSuccess();
    }

    default public <R> Iterative5Getter.Iterative5Fail<T1, T2, T3, T4, T5, R> getterOnSuccess(R r) {
        return this.getter().onSuccess(r);
    }

    default public <R> Iterative5Getter.Iterative5Fail<T1, T2, T3, T4, T5, R> getterOnSuccess(Sp<? extends R> s) {
        return this.getter().onSuccess(s);
    }

    default public <R> Iterative5Getter.Iterative5Fail<T1, T2, T3, T4, T5, R> getterOnSuccess(Fn1<? super Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>, ? extends R> f) {
        return this.getter().onSuccess(f);
    }

    default public <R> Iterative5Getter.Iterative5Success<T1, T2, T3, T4, T5, R> getterOnFailure(R r) {
        return this.getter().onFailure(r);
    }

    default public <R> Iterative5Getter.Iterative5Success<T1, T2, T3, T4, T5, R> getterOnFailure(Sp<? extends R> s) {
        return this.getter().onFailure(s);
    }

    default public <R> Iterative5Getter.Iterative5Success<T1, T2, T3, T4, T5, R> getterOnFailure(Fn1<? super Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>, ? extends R> f) {
        return this.getter().onFailure(f);
    }

    default public Iterative1<Tuple5<T1, T2, T3, T4, T5>> reduce() {
        return this.reduce(Tuple::of);
    }

    default public <R> Iterative1<R> reduce(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.toTupleStream().map(Fn5.tuple(IterativeHandler::cross)).map(stream -> stream.map(Fn5.tuple(f))));
    }

    default public <R> Iterative4<T1, T2, T3, R> reduceSimpleRt2(Fn2<? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt4().create(this.splitLt3(), this.splitRt2().reduce(f).iterableStream1());
    }

    default public <R> Iterative4<T1, T2, T3, R> reduceChainRt2(Fn2<? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt4().create(this.splitLt3(), this.reduce((a1, a2, a3, a4, a5) -> f.apply(a4, a5)).iterableStream1());
    }

    default public <R> Iterative4<R, T3, T4, T5> reduceSimpleLt2(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt4().reduceSimpleLt2(f), this.iterableStream5());
    }

    default public <R> Iterative4<R, T3, T4, T5> reduceChainLt2(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.reduceSimpleLt2(f);
    }

    default public <R> Iterative3<T1, T2, R> reduceSimpleRt3(Fn3<? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt4().create(this.splitLt2(), this.splitRt3().reduce(f).iterableStream1());
    }

    default public <R> Iterative3<T1, T2, R> reduceChainRt3(Fn3<? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt4().create(this.splitLt2(), this.reduce((a1, a2, a3, a4, a5) -> f.apply(a3, a4, a5)).iterableStream1());
    }

    default public <R> Iterative3<R, T4, T5> reduceSimpleLt3(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt4().reduceSimpleLt3(f), this.iterableStream5());
    }

    default public <R> Iterative3<R, T4, T5> reduceChainLt3(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return this.reduceSimpleLt3(f);
    }

    default public <R> Iterative2<T1, R> reduceSimpleRt4(Fn4<? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt4().create(this.splitLt1(), this.splitRt4().reduce(f).iterableStream1());
    }

    default public <R> Iterative2<T1, R> reduceChainRt4(Fn4<? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt4().create(this.splitLt1(), this.reduce((a1, a2, a3, a4, a5) -> f.apply(a2, a3, a4, a5)).iterableStream1());
    }

    default public <R> Iterative2<R, T5> reduceSimpleLt4(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt4().reduce(f), this.iterableStream5());
    }

    default public <R> Iterative2<R, T5> reduceChainLt4(Fn4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return this.reduceSimpleLt4(f);
    }

    default public <A1> Iterative5Args.Iterative5Args1<T1, T2, T3, T4, T5, A1> crossArgs(A1 a1) {
        return this.crossArgsOf(this.wrap(a1));
    }

    default public <A1> Iterative5Args.Iterative5Args1<T1, T2, T3, T4, T5, A1> crossArgsOf(Iterable<? extends A1> a1) {
        return new Iterative5Args.Iterative5Args1.Iterative5Args1Impl<>(this, this.accessBuilder().cross().of(a1), true);
    }

    default public <A1, A2> Iterative5Args.Iterative5Args2<T1, T2, T3, T4, T5, A1, A2> crossArgs(A1 a1, A2 a2) {
        return this.crossArgsOf(this.wrap(a1), this.wrap(a2));
    }

    default public <A1, A2> Iterative5Args.Iterative5Args2<T1, T2, T3, T4, T5, A1, A2> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2) {
        return new Iterative5Args.Iterative5Args2.Iterative5Args2Impl<>(this, this.accessBuilder().cross().of(a1, a2), true);
    }

    default public <A1, A2, A3> Iterative5Args.Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> crossArgs(A1 a1, A2 a2, A3 a3) {
        return this.crossArgsOf(this.wrap(a1), this.wrap(a2), this.wrap(a3));
    }

    default public <A1, A2, A3> Iterative5Args.Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
        return new Iterative5Args.Iterative5Args3.Iterative5Args3Impl<>(this, this.accessBuilder().cross().of(a1, a2, a3), true);
    }

    default public <A1> Iterative5Args.Iterative5Args1<T1, T2, T3, T4, T5, A1> inlineArgs(A1 a1) {
        return this.inlineArgsOf(this.wrap(a1));
    }

    default public <A1> Iterative5Args.Iterative5Args1<T1, T2, T3, T4, T5, A1> inlineArgsOf(Iterable<? extends A1> a1) {
        return new Iterative5Args.Iterative5Args1.Iterative5Args1Impl<>(this, this.accessBuilder().inline().of(a1), false);
    }

    default public <A1, A2> Iterative5Args.Iterative5Args2<T1, T2, T3, T4, T5, A1, A2> inlineArgs(A1 a1, A2 a2) {
        return this.inlineArgsOf(this.wrap(a1), this.wrap(a2));
    }

    default public <A1, A2> Iterative5Args.Iterative5Args2<T1, T2, T3, T4, T5, A1, A2> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2) {
        return new Iterative5Args.Iterative5Args2.Iterative5Args2Impl<>(this, this.accessBuilder().inline().of(a1, a2), false);
    }

    default public <A1, A2, A3> Iterative5Args.Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> inlineArgs(A1 a1, A2 a2, A3 a3) {
        return this.inlineArgsOf(this.wrap(a1), this.wrap(a2), this.wrap(a3));
    }

    default public <A1, A2, A3> Iterative5Args.Iterative5Args3<T1, T2, T3, T4, T5, A1, A2, A3> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
        return new Iterative5Args.Iterative5Args3.Iterative5Args3Impl<>(this, this.accessBuilder().inline().of(a1, a2, a3), false);
    }

    default public Iterative4Args.Iterative4Args1<T1, T2, T3, T4, T5> inlineArgsRt1() {
        return new Iterative4Args.Iterative4Args1.Iterative4Args1Impl<>(this.splitLt4(), this.splitRt1(), false);
    }

    default public Iterative4Args.Iterative4Args1<T2, T3, T4, T5, T1> inlineArgsLt1() {
        return new Iterative4Args.Iterative4Args1.Iterative4Args1Impl<>(this.splitRt4(), this.splitLt1(), false);
    }

    default public Iterative4Args.Iterative4Args1<T1, T2, T3, T4, T5> crossArgsRt1() {
        return new Iterative4Args.Iterative4Args1.Iterative4Args1Impl<>(this.splitLt4(), this.splitRt1(), true);
    }

    default public Iterative4Args.Iterative4Args1<T2, T3, T4, T5, T1> crossArgsLt1() {
        return new Iterative4Args.Iterative4Args1.Iterative4Args1Impl<>(this.splitRt4(), this.splitLt1(), true);
    }

    default public Iterative3Args.Iterative3Args2<T1, T2, T3, T4, T5> inlineArgsRt2() {
        return new Iterative3Args.Iterative3Args2.Iterative3Args2Impl<>(this.splitLt3(), this.splitRt2(), false);
    }

    default public Iterative3Args.Iterative3Args2<T3, T4, T5, T1, T2> inlineArgsLt2() {
        return new Iterative3Args.Iterative3Args2.Iterative3Args2Impl<>(this.splitRt3(), this.splitLt2(), false);
    }

    default public Iterative3Args.Iterative3Args2<T1, T2, T3, T4, T5> crossArgsRt2() {
        return new Iterative3Args.Iterative3Args2.Iterative3Args2Impl<>(this.splitLt3(), this.splitRt2(), true);
    }

    default public Iterative3Args.Iterative3Args2<T3, T4, T5, T1, T2> crossArgsLt2() {
        return new Iterative3Args.Iterative3Args2.Iterative3Args2Impl<>(this.splitRt3(), this.splitLt2(), true);
    }

    default public Iterative2Args.Iterative2Args3<T1, T2, T3, T4, T5> inlineArgsRt3() {
        return new Iterative2Args.Iterative2Args3.Iterative2Args3Impl<>(this.splitLt2(), this.splitRt3(), false);
    }

    default public Iterative2Args.Iterative2Args3<T4, T5, T1, T2, T3> inlineArgsLt3() {
        return new Iterative2Args.Iterative2Args3.Iterative2Args3Impl<>(this.splitRt2(), this.splitLt3(), false);
    }

    default public Iterative2Args.Iterative2Args3<T1, T2, T3, T4, T5> crossArgsRt3() {
        return new Iterative2Args.Iterative2Args3.Iterative2Args3Impl<>(this.splitLt2(), this.splitRt3(), true);
    }

    default public Iterative2Args.Iterative2Args3<T4, T5, T1, T2, T3> crossArgsLt3() {
        return new Iterative2Args.Iterative2Args3.Iterative2Args3Impl<>(this.splitRt2(), this.splitLt3(), true);
    }

    default public Iterative1Args.Iterative1Args4<T1, T2, T3, T4, T5> inlineArgsRt4() {
        return new Iterative1Args.Iterative1Args4.Iterative1Args4Impl<>(this.splitLt1(), this.splitRt4(), false);
    }

    default public Iterative1Args.Iterative1Args4<T5, T1, T2, T3, T4> inlineArgsLt4() {
        return new Iterative1Args.Iterative1Args4.Iterative1Args4Impl<>(this.splitRt1(), this.splitLt4(), false);
    }

    default public Iterative1Args.Iterative1Args4<T1, T2, T3, T4, T5> crossArgsRt4() {
        return new Iterative1Args.Iterative1Args4.Iterative1Args4Impl<>(this.splitLt1(), this.splitRt4(), true);
    }

    default public Iterative1Args.Iterative1Args4<T5, T1, T2, T3, T4> crossArgsLt4() {
        return new Iterative1Args.Iterative1Args4.Iterative1Args4Impl<>(this.splitRt1(), this.splitLt4(), true);
    }

    default public IterativeSupplier.Iterative1Supplier4.TransformSupplier<T1, T2, T3, T4, T5> iterativeSupplier() {
        return new IterativeSupplier.Iterative1Supplier4.Iterative1Supplier4Impl<>(this);
    }

    default public IterativeSupplier.Iterative1Supplier4.TransformSupplier<T1, T2, T3, T4, T5> crossSupplierAllLt() {
        return new IterativeSupplier.Iterative1Supplier4.Iterative1Supplier4Impl<>(this.forceCrossAll());
    }

    default public IterativeSupplier.Iterative1Supplier4.TransformSupplier<T1, T2, T3, T4, T5> inlineSupplierAllLt() {
        return new IterativeSupplier.Iterative1Supplier4.Iterative1Supplier4Impl<>(this.forceInlineAll());
    }

    default public IterativeSupplier.Iterative1Supplier4.TransformSupplier<T5, T1, T2, T3, T4> crossSupplierAllRt() {
        return new IterativeSupplier.Iterative1Supplier4.Iterative1Supplier4Impl<>(this.forceCrossAll().popBack().pushFrontCrossBy(this.iterableStream5()));
    }

    default public IterativeSupplier.Iterative1Supplier4.TransformSupplier<T5, T1, T2, T3, T4> inlineSupplierAllRt() {
        return new IterativeSupplier.Iterative1Supplier4.Iterative1Supplier4Impl<>(this.forceInlineAll().popBack().pushFrontInlineBy(this.iterableStream5()));
    }

    default public IterativeSupplier.Iterative1Supplier4.TransformSupplier<T1, T2, T3, T4, T5> crossSupplierLt() {
        return new IterativeSupplier.Iterative1Supplier4.Iterative1Supplier4Impl<>(this.forceCross2());
    }

    default public IterativeSupplier.Iterative1Supplier4.TransformSupplier<T1, T2, T3, T4, T5> inlineSupplierLt() {
        return new IterativeSupplier.Iterative1Supplier4.Iterative1Supplier4Impl<>(this.forceInline2());
    }

    default public IterativeSupplier.Iterative1Supplier4.TransformSupplier<T5, T1, T2, T3, T4> crossSupplierRt() {
        return new IterativeSupplier.Iterative1Supplier4.Iterative1Supplier4Impl<>(this.popBack().pushFrontCrossBy(this.iterableStream5()));
    }

    default public IterativeSupplier.Iterative1Supplier4.TransformSupplier<T5, T1, T2, T3, T4> inlineSupplierRt() {
        return new IterativeSupplier.Iterative1Supplier4.Iterative1Supplier4Impl<>(this.popBack().pushFrontInlineBy(this.iterableStream5()));
    }

    default public <A1> Iterative6<T1, T2, T3, T4, T5, A1> crossJoinRt(Iterative1<? extends A1> iterative) {
        return this.createCross(this, iterative.iterableStream1());
    }

    default public <A1> Iterative6<A1, T1, T2, T3, T4, T5> crossJoinLt(Iterative1<? extends A1> iterative) {
        return this.pushFrontCrossBy(iterative.iterableStream1());
    }

    default public <A1, A2> Iterative7<T1, T2, T3, T4, T5, A1, A2> crossJoinRt(Iterative2<? extends A1, ? extends A2> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt()), iterative.iterableStream2(), iterative.isCross());
    }

    default public <A1, A2> Iterative7<A1, A2, T1, T2, T3, T4, T5> crossJoinLt(Iterative2<? extends A1, ? extends A2> iterative) {
        return iterative.isCross() ? this.<A2>crossJoinLt(iterative.splitRt()).pushFrontCrossBy(iterative.iterableStream1()) : this.<A2>crossJoinLt(iterative.splitRt()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3> Iterative8<T1, T2, T3, T4, T5, A1, A2, A3> crossJoinRt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt2()), iterative.iterableStream3(), iterative.isCross());
    }

    default public <A1, A2, A3> Iterative8<A1, A2, A3, T1, T2, T3, T4, T5> crossJoinLt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return iterative.splitLt2().isCross() ? this.<A2, A3>crossJoinLt(iterative.splitRt2()).pushFrontCrossBy(iterative.iterableStream1()) : this.<A2, A3>crossJoinLt(iterative.splitRt2()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1> Iterative6<T1, T2, T3, T4, T5, A1> inlineJoinRt(Iterative1<? extends A1> iterative) {
        return this.createInline(this, iterative.iterableStream1());
    }

    default public <A1> Iterative6<A1, T1, T2, T3, T4, T5> inlineJoinLt(Iterative1<? extends A1> iterative) {
        return this.pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2> Iterative7<T1, T2, T3, T4, T5, A1, A2> inlineJoinRt(Iterative2<? extends A1, ? extends A2> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt()), iterative.iterableStream2(), iterative.isCross());
    }

    default public <A1, A2> Iterative7<A1, A2, T1, T2, T3, T4, T5> inlineJoinLt(Iterative2<? extends A1, ? extends A2> iterative) {
        return iterative.isCross() ? this.<A2>inlineJoinLt(iterative.splitRt()).pushFrontCrossBy(iterative.iterableStream1()) : this.<A2>inlineJoinLt(iterative.splitRt()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3> Iterative8<T1, T2, T3, T4, T5, A1, A2, A3> inlineJoinRt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt2()), iterative.iterableStream3(), iterative.isCross());
    }

    default public <A1, A2, A3> Iterative8<A1, A2, A3, T1, T2, T3, T4, T5> inlineJoinLt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return iterative.splitLt2().isCross() ? this.<A2, A3>inlineJoinLt(iterative.splitRt2()).pushFrontCrossBy(iterative.iterableStream1()) : this.<A2, A3>inlineJoinLt(iterative.splitRt2()).pushFrontInlineBy(iterative.iterableStream1());
    }

    public static abstract class Iterative5Abstract<T1, T2, T3, T4, T5> implements Iterative5<T1, T2, T3, T4, T5> {

        protected final Iterative4<T1, T2, T3, T4> iterative;
        protected final Iterable<Stream<T5>> right;

        Iterative5Abstract(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends T5> right) {
            Objects.requireNonNull(iterative, "iterative is null");
            Objects.requireNonNull(right, "right is null");
            this.iterative = Iterative.narrow(iterative);
            this.right = SimpleIterative.<T5>of(right).inlineMap(this::wrap).map(Stream::of).toIterable();
        }

        Iterative5Abstract(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends Stream<? extends T5>> right, boolean ign) {
            Objects.requireNonNull(iterative, "iterative is null");
            Objects.requireNonNull(right, "right is null");
            this.iterative = Iterative.narrow(iterative);
            this.right = SimpleIterative.of(right).map(iter -> iter.flatMap(this::wrap));
        }

        @Override
        public Stream<Tuple5<T1, T2, T3, T4, T5>> toStream() {
            return this.toTupleStream().map(Fn5.tuple(IterativeHandler::cross)).flatMap(IterativeInternals::identityIterable);
        }

        @Override
        public Iterator<Iterable<?>> iterators() {
            return Iterator.concat(Stream.of(this.iterative.iterators()).append(Iterator.of(SimpleIterative.of(this.right).inlineMap(IterativeInternals::identityIterable).toIterable())));
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
            return SimpleIterative.of(this.right).inlineMap(IterativeInternals::identityIterable);
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
            return this.right;
        }

        @Override
        public Iterative4<T1, T2, T3, T4> innerIterative() {
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
            return this.splitLt4().splitLt3();
        }

        @Override
        public Iterative4<T1, T2, T3, T4> splitLt4() {
            return this.innerIterative();
        }

        @Override
        public Iterative1<T5> splitRt1() {
            return this.splitRt2().splitRt();
        }

        @Override
        public Iterative2<T4, T5> splitRt2() {
            return this.splitRt3().splitRt2();
        }

        @Override
        public Iterative3<T3, T4, T5> splitRt3() {
            return this.splitRt4().splitRt3();
        }

        @Override
        public Iterative4<T2, T3, T4, T5> splitRt4() {
            return this.popFront();
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> forceCross2() {
            return this.create(this.iterative.forceCross2(), this.right);
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> forceCross3() {
            return this.create(this.iterative.forceCross3(), this.right);
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> forceCross4() {
            return this.create(this.iterative.forceCross4(), this.right);
        }

        @Override
        public Iterative5Cross<T1, T2, T3, T4, T5> forceCross5() {
            return this.createCross(this.iterative, this.right);
        }

        @Override
        public Iterative5Cross<T1, T2, T3, T4, T5> forceCrossAll() {
            return this.createCross(this.iterative.forceCrossAll(), this.right);
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> forceInline2() {
            return this.createInline(this.iterative.forceInline2(), this.right);
        }

        @Override
        public Iterative5Inline<T1, T2, T3, T4, T5> forceInline3() {
            return this.createInline(this.iterative.forceInline3(), this.right);
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> forceInline4() {
            return this.createInline(this.iterative.forceInline4(), this.right);
        }

        @Override
        public Iterative5Inline<T1, T2, T3, T4, T5> forceInline5() {
            return this.createInline(this.iterative, this.right);
        }

        @Override
        public Iterative5Inline<T1, T2, T3, T4, T5> forceInlineAll() {
            return this.createInline(this.iterative.forceInlineAll(), this.right);
        }

        @Override
        public <T6> Iterative6<T1, T2, T3, T4, T5, T6> pushBackBy(Iterable<? extends Stream<? extends T6>> t6) {
            return this.create(this, t6);
        }

        @Override
        public <T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> pushBackCrossBy(Iterable<? extends Stream<? extends T6>> t6) {
            return this.createCross(this, t6);
        }

        @Override
        public <T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> pushBackInlineBy(Iterable<? extends Stream<? extends T6>> t6) {
            return this.createInline(this, t6);
        }

        @Override
        public <T0> Iterative6<T0, T1, T2, T3, T4, T5> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.<T0>pushFrontBy(t0), this.right);
        }

        @Override
        public <T0> Iterative6<T0, T1, T2, T3, T4, T5> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.<T0>pushFrontCrossBy(t0), this.right);
        }

        @Override
        public <T0> Iterative6<T0, T1, T2, T3, T4, T5> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.<T0>pushFrontInlineBy(t0), this.right);
        }

        @Override
        public Iterative4<T1, T2, T3, T4> popBack(Cs1<? super T5> c) {
            Objects.requireNonNull(c, "c is null");
            SimpleIterative.of(this.iterable5()).toIterable().forEach(c);
            return this.iterative;
        }

        @Override
        public Iterative4<T1, T2, T3, T4> popBackChain(Cs1<? super T5> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs5.tuple(c.ignoring4Lt()));
            return this.splitLt4();
        }

        @Override
        public Iterative4<T2, T3, T4, T5> popFront(Cs1<? super T1> c) {
            Objects.requireNonNull(c, "c is null");
            return this.create(this.iterative.popFront(c), this.iterableStream5());
        }

        @Override
        public Iterative3<T1, T2, T3> popBack2(Cs2<? super T4, ? super T5> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt2().forEach(c);
            return this.splitLt3();
        }

        @Override
        public Iterative3<T1, T2, T3> popBackChain2(Cs2<? super T4, ? super T5> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs5.tuple(c.ignoring3Lt()));
            return this.splitLt3();
        }

        @Override
        public Iterative3<T3, T4, T5> popFront2(Cs2<? super T1, ? super T2> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt2().forEach(c);
            return this.splitRt3();
        }

        @Override
        public Iterative2<T1, T2> popBack3(Cs3<? super T3, ? super T4, ? super T5> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt3().forEach(c);
            return this.splitLt2();
        }

        @Override
        public Iterative2<T1, T2> popBackChain3(Cs3<? super T3, ? super T4, ? super T5> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs5.tuple(c.ignoring2Lt()));
            return this.splitLt2();
        }

        @Override
        public Iterative2<T4, T5> popFront3(Cs3<? super T1, ? super T2, ? super T3> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt3().forEach(c);
            return this.splitRt2();
        }

        @Override
        public Iterative1<T1> popBack4(Cs4<? super T2, ? super T3, ? super T4, ? super T5> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt4().forEach(c);
            return this.splitLt1();
        }

        @Override
        public Iterative1<T1> popBackChain4(Cs4<? super T2, ? super T3, ? super T4, ? super T5> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs5.tuple(c.ignoring1Lt()));
            return this.splitLt1();
        }

        @Override
        public Iterative1<T5> popFront4(Cs4<? super T1, ? super T2, ? super T3, ? super T4> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt4().forEach(c);
            return this.splitRt1();
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> nonNullable() {
            return this.isNullable() ? this.create(this.iterative, this.right) : this;
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> nullable() {
            return this.isNullable() ? this : this.create(this.iterative, this.right);
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> forceCleanEmpty1() {
            return this.create(this.iterative.forceCleanEmpty1(), this.right);
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> forceCleanEmpty2() {
            return this.create(this.iterative.forceCleanEmpty2(), this.right);
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> forceCleanEmpty3() {
            return this.create(this.iterative.forceCleanEmpty3(), this.right);
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> forceCleanEmpty4() {
            return this.create(this.iterative.forceCleanEmpty4(), this.right);
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> forceCleanEmpty5() {
            return this.create(this.iterative, IterativeHandler.clean(this.right));
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> forceCleanEmptyAll() {
            return this.create(this.iterative.forceCleanEmptyAll(), IterativeHandler.clean(this.right));
        }

        @Override
        public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5) {
            Objects.requireNonNull(f1, "f1 is null");
            Objects.requireNonNull(f2, "f2 is null");
            Objects.requireNonNull(f3, "f3 is null");
            Objects.requireNonNull(f4, "f4 is null");
            Objects.requireNonNull(f5, "f5 is null");
            return this.create(this.iterative.map(f1, f2, f3, f4), SimpleIterative.of(this.iterableStream5()).map(iter -> iter.<R5>map(f5).flatMap(this::wrap)).toIterable());
        }

        @Override
        public <R1, R2, R3, R4, R5> Iterative5<R1, R2, R3, R4, R5> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5) {
            Objects.requireNonNull(f1, "f1 is null");
            Objects.requireNonNull(f2, "f2 is null");
            Objects.requireNonNull(f3, "f3 is null");
            Objects.requireNonNull(f4, "f4 is null");
            Objects.requireNonNull(f5, "f5 is null");
            return this.create(this.iterative.inlineMap(f1, f2, f3, f4), SimpleIterative.of(this.iterableStream5()).map(iter -> iter.<R5>flatMap(f5).flatMap(this::wrap)).toIterable());
        }

        @Override
        public Iterative5<T1, T2, T3, T4, T5> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5) {
            Objects.requireNonNull(p1, "p1 is null");
            Objects.requireNonNull(p2, "p2 is null");
            Objects.requireNonNull(p3, "p3 is null");
            Objects.requireNonNull(p4, "p4 is null");
            Objects.requireNonNull(p5, "p5 is null");
            return this.create(this.iterative.filter(p1, p2, p3, p4), SimpleIterative.of(this.iterableStream5()).map(iter -> iter.<T5>filter(p5).flatMap(this::wrap)).toIterable());
        }

        @Override
        public String toStringContent() {
            return Stream.of(this.innerIterative().toStringContent(), IterativeHandler.typeIndicator(this.isCross()), IterativeHandler.iterableStreamToString(this.iterableStream5(), 5)).mkString();
        }

        public String toString() {
            return IterativeHandler.iterativeHeader(5) + this.toStringContent();
        }

    }

}
