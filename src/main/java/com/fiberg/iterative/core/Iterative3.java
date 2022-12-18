package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative;
import com.fiberg.iterative.core.Iterative1;
import com.fiberg.iterative.core.Iterative1Args;
import com.fiberg.iterative.core.Iterative2;
import com.fiberg.iterative.core.Iterative2Args;
import com.fiberg.iterative.core.Iterative3Args;
import com.fiberg.iterative.core.Iterative3Cross;
import com.fiberg.iterative.core.Iterative3Getter;
import com.fiberg.iterative.core.Iterative3Inline;
import com.fiberg.iterative.core.Iterative4;
import com.fiberg.iterative.core.Iterative4Cross;
import com.fiberg.iterative.core.Iterative4Inline;
import com.fiberg.iterative.core.Iterative5;
import com.fiberg.iterative.core.Iterative5Cross;
import com.fiberg.iterative.core.Iterative5Inline;
import com.fiberg.iterative.core.Iterative6;
import com.fiberg.iterative.core.Iterative6Cross;
import com.fiberg.iterative.core.Iterative6Inline;
import com.fiberg.iterative.core.Iterative7;
import com.fiberg.iterative.core.Iterative7Cross;
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
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fn3;
import com.fiberg.iterative.function.Fnc3;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Pr3;
import com.fiberg.iterative.function.Rn;
import com.fiberg.iterative.function.Sp;
import io.vavr.Tuple;
import io.vavr.Tuple3;
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

public interface Iterative3<T1, T2, T3> extends IterativeConstructor {

    public static final int CARDINALITY = 3;

    public static <T1, T2, T3> Iterative3<T1, T2, T3> empty() {
        return Iterative.empty3();
    }

    public static <T1, T2, T3> Iterative3<T1, T2, T3> emptyNullable() {
        return Iterative.nullable().empty3();
    }

    public String toStringContent();

    public Stream<Tuple3<Iterable<T1>, Iterable<T2>, Iterable<T3>>> toTupleStream();

    public Stream<Tuple3<T1, T2, T3>> toStream();

    public Iterative3<T1, T2, T3> nonNullable();

    public Iterative3<T1, T2, T3> nullable();

    public Iterable<T1> iterable1();

    public Iterable<T2> iterable2();

    public Iterable<T3> iterable3();

    public Iterable<Stream<T1>> iterableStream1();

    public Iterable<Stream<T2>> iterableStream2();

    public Iterable<Stream<T3>> iterableStream3();

    public Iterative2<T1, T2> innerIterative();

    public Iterative1<T1> splitLt1();

    public Iterative2<T1, T2> splitLt2();

    public Iterative1<T3> splitRt1();

    public Iterative2<T2, T3> splitRt2();

    public Iterative3<T1, T2, T3> forceCross2();

    public Iterative3Cross<T1, T2, T3> forceCross3();

    public Iterative3Cross<T1, T2, T3> forceCrossAll();

    public Iterative3<T1, T2, T3> forceInline2();

    public Iterative3Inline<T1, T2, T3> forceInline3();

    public Iterative3Inline<T1, T2, T3> forceInlineAll();

    public Iterative3<T1, T2, T3> forceCleanEmpty1();

    public Iterative3<T1, T2, T3> forceCleanEmpty2();

    public Iterative3<T1, T2, T3> forceCleanEmpty3();

    public Iterative3<T1, T2, T3> forceCleanEmptyAll();

    public <T4> Iterative4<T1, T2, T3, T4> pushBackBy(Iterable<? extends Stream<? extends T4>> var1);

    public <T4> Iterative4Cross<T1, T2, T3, T4> pushBackCrossBy(Iterable<? extends Stream<? extends T4>> var1);

    public <T4> Iterative4Inline<T1, T2, T3, T4> pushBackInlineBy(Iterable<? extends Stream<? extends T4>> var1);

    public <T0> Iterative4<T0, T1, T2, T3> pushFrontBy(Iterable<? extends Stream<? extends T0>> var1);

    public <T0> Iterative4<T0, T1, T2, T3> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> var1);

    public <T0> Iterative4<T0, T1, T2, T3> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> var1);

    public Iterative2<T1, T2> popBack(Cs1<? super T3> var1);

    public Iterative2<T1, T2> popBackChain(Cs1<? super T3> var1);

    public Iterative2<T2, T3> popFront(Cs1<? super T1> var1);

    default public Iterative2<T1, T2> popBack() {
        return this.popBack(Cs1.empty());
    }

    default public Iterative2<T2, T3> popFront() {
        return this.popFront(Cs1.empty());
    }

    public Iterative1<T1> popBack2(Cs2<? super T2, ? super T3> var1);

    public Iterative1<T1> popBackChain2(Cs2<? super T2, ? super T3> var1);

    public Iterative1<T3> popFront2(Cs2<? super T1, ? super T2> var1);

    default public Iterative1<T1> popBack2(Cs1<? super T2> c2, Cs1<? super T3> c3) {
        return this.popBack(c3).popBack(c2);
    }

    default public Iterative1<T3> popFront2(Cs1<? super T1> c1, Cs1<? super T2> c2) {
        return this.popFront(c1).popFront(c2);
    }

    default public Iterative1<T1> popBack2() {
        return this.popBack2(Cs1.empty(), Cs1.empty());
    }

    default public Iterative1<T3> popFront2() {
        return this.popFront2(Cs1.empty(), Cs1.empty());
    }

    public <R1, R2, R3> Iterative3<R1, R2, R3> map(Fn1<? super T1, ? extends R1> var1, Fn1<? super T2, ? extends R2> var2, Fn1<? super T3, ? extends R3> var3);

    public <R1, R2, R3> Iterative3<R1, R2, R3> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> var1, Fn1<? super T2, ? extends Iterable<? extends R2>> var2, Fn1<? super T3, ? extends Iterable<? extends R3>> var3);

    public Iterative3<T1, T2, T3> filter(Pr1<? super T1> var1, Pr1<? super T2> var2, Pr1<? super T3> var3);

    default public <R1, R2, R3> Iterative3<R1, R2, R3> flatMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3) {
        return this.inlineMap(f1, f2, f3).forceFlatAll();
    }

    @Override
    default public Iterative3<T1, T2, T3> onSuccess(Rn r) {
        return this.onSuccess(r.ignoring1());
    }

    @Override
    default public Iterative3<T1, T2, T3> onFailure(Rn r) {
        return this.onFailure(r.ignoring1());
    }

    default public Iterative3<T1, T2, T3> execute(Cs1<? super Iterative3<? extends T1, ? extends T2, ? extends T3>> c) {
        Objects.requireNonNull(c, "c is null");
        c.accept(this);
        return this;
    }

    default public Iterative3<T1, T2, T3> onFailure(Cs1<? super Iterative3<? extends T1, ? extends T2, ? extends T3>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().toTry().recover(t -> null).filter(Objects::isNull).forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative3<T1, T2, T3> onSuccess(Cs1<? super Iterative3<? extends T1, ? extends T2, ? extends T3>> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().headOption().forEach(tuple -> c.accept(this));
        return this;
    }

    default public Iterative3<T1, T2, T3> onSuccessful(Cs3<? super T1, ? super T2, ? super T3> c) {
        return this.forEach(c);
    }

    default public Iterative3<T1, T2, T3> recover1(T1 t1) {
        return this.splitLt2().recover1(t1).pushBackBy(this.iterableStream3());
    }

    default public Iterative3<T1, T2, T3> recover1Of(Iterable<? extends T1> t1) {
        return this.splitLt2().recover1Of(t1).pushBackBy(this.iterableStream3());
    }

    default public Iterative3<T1, T2, T3> recover1By(Iterable<? extends Stream<? extends T1>> t1) {
        return this.splitLt2().recover1By(t1).pushBackBy(this.iterableStream3());
    }

    default public Iterative3<T1, T2, T3> recover2(T2 t2) {
        return this.splitLt2().recover2(t2).pushBackBy(this.iterableStream3());
    }

    default public Iterative3<T1, T2, T3> recover2Of(Iterable<? extends T2> t2) {
        return this.splitLt2().recover2Of(t2).pushBackBy(this.iterableStream3());
    }

    default public Iterative3<T1, T2, T3> recover2By(Iterable<? extends Stream<? extends T2>> t2) {
        return this.splitLt2().recover2By(t2).pushBackBy(this.iterableStream3());
    }

    default public Iterative3<T1, T2, T3> recover3(T3 t3) {
        return this.splitRt1().isFailure() ? this.splitLt2().pushBack(t3) : this;
    }

    default public Iterative3<T1, T2, T3> recover3Of(Iterable<? extends T3> t3) {
        return this.splitRt1().isFailure() ? this.splitLt2().pushBackOf(t3) : this;
    }

    default public Iterative3<T1, T2, T3> recover3By(Iterable<? extends Stream<? extends T3>> t3) {
        return this.splitRt1().isFailure() ? this.splitLt2().pushBackBy(t3) : this;
    }

    default public Iterative3<T1, T2, T3> replace1When(Fn1<? super T1, ? extends T1> f, Pr1<? super T1> p) {
        return this.map1((Fn1 & Serializable)t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative3<T1, T2, T3> replace1When(Sp<? extends T1> s, Pr1<? super T1> p) {
        return this.replace1When((T1)s.toFunction().ignoring1(), p);
    }

    default public Iterative3<T1, T2, T3> replace1When(T1 t, Pr1<? super T1> p) {
        return this.replace1When((T1)Fn1.value(t), p);
    }

    default public Iterative3<T1, T2, T3> replace2When(Fn1<? super T2, ? extends T2> f, Pr1<? super T2> p) {
        return this.map2((Fn1 & Serializable)t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative3<T1, T2, T3> replace2When(Sp<? extends T2> s, Pr1<? super T2> p) {
        return this.replace2When((T2)s.toFunction().ignoring1(), p);
    }

    default public Iterative3<T1, T2, T3> replace2When(T2 t, Pr1<? super T2> p) {
        return this.replace2When((T2)Fn1.value(t), p);
    }

    default public Iterative3<T1, T2, T3> replace3When(Fn1<? super T3, ? extends T3> f, Pr1<? super T3> p) {
        return this.map3((Fn1 & Serializable)t -> p.test(t) ? f.apply(t) : t);
    }

    default public Iterative3<T1, T2, T3> replace3When(Sp<? extends T3> s, Pr1<? super T3> p) {
        return this.replace3When((T3)s.toFunction().ignoring1(), p);
    }

    default public Iterative3<T1, T2, T3> replace3When(T3 t, Pr1<? super T3> p) {
        return this.replace3When((T3)Fn1.value(t), p);
    }

    default public Iterative3<T1, T2, T3> forEach(Cs3<? super T1, ? super T2, ? super T3> c) {
        Objects.requireNonNull(c, "c is null");
        this.toStream().forEach(Cs3.tuple(c));
        return this;
    }

    default public Iterative3<T1, T2, T3> forEach(Rn r) {
        return this.forEach(r.ignoring3());
    }

    default public Iterative3<T1, T2, T3> forEach1(Cs1<? super T1> c) {
        return this.forEach(c.ignoring2Rt());
    }

    default public Iterative3<T1, T2, T3> forEach2(Cs1<? super T2> c) {
        return this.forEach(c.ignoring1Rt().ignoring1Lt());
    }

    default public Iterative3<T1, T2, T3> forEach3(Cs1<? super T3> c) {
        return this.forEach(c.ignoring2Lt());
    }

    default public Iterative3<T1, T2, T3> forEachWhen1(Cs3<? super T1, ? super T2, ? super T3> c, Pr1<? super T1> p) {
        return this.forEachWhen(c, p, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative3<T1, T2, T3> forEachWhen2(Cs3<? super T1, ? super T2, ? super T3> c, Pr1<? super T2> p) {
        return this.forEachWhen(c, Pr1.value(true), p, Pr1.value(true));
    }

    default public Iterative3<T1, T2, T3> forEachWhen3(Cs3<? super T1, ? super T2, ? super T3> c, Pr1<? super T3> p) {
        return this.forEachWhen(c, Pr1.value(true), Pr1.value(true), p);
    }

    default public Iterative3<T1, T2, T3> forEachWhen(Cs3<? super T1, ? super T2, ? super T3> c, Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3) {
        Objects.requireNonNull(c, "c is null");
        Objects.requireNonNull(p1, "p1 is null");
        Objects.requireNonNull(p2, "p2 is null");
        Objects.requireNonNull(p3, "p3 is null");
        this.filter(p1, p2, p3).toStream().forEach(Cs3.tuple(c));
        return this;
    }

    default public Iterative3<T1, T2, T3> forEachWhen(Cs3<? super T1, ? super T2, ? super T3> c, Pr3<? super T1, ? super T2, ? super T3> p) {
        Objects.requireNonNull(c, "c is null");
        Objects.requireNonNull(p, "p is null");
        this.toStream().filter(Pr3.tuple(p)).forEach(Cs3.tuple(c));
        return this;
    }

    default public Iterative3<T1, T2, T3> forEach1When(Cs1<? super T1> c, Pr1<? super T1> p) {
        return this.forEachWhen1(c.ignoring2Rt(), p);
    }

    default public Iterative3<T1, T2, T3> forEach2When(Cs1<? super T2> c, Pr1<? super T2> p) {
        return this.forEachWhen2(c.ignoring1Rt().ignoring1Lt(), p);
    }

    default public Iterative3<T1, T2, T3> forEach3When(Cs1<? super T3> c, Pr1<? super T3> p) {
        return this.forEachWhen3(c.ignoring2Lt(), p);
    }

    default public Iterable<Tuple3<T1, T2, T3>> yield() {
        return this.yield(Tuple::of);
    }

    default public <R> Iterable<R> yield(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn3.tuple(f)).flatMap(this::wrap);
    }

    default public Stream<Tuple3<T1, T2, T3>> yieldStream() {
        return this.yieldStream(Tuple::of);
    }

    default public <R> Stream<R> yieldStream(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().map(Fn3.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Stream<R> yieldFlatStream(Fn3<? super T1, ? super T2, ? super T3, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldStream(f).flatMap(IterativeInternals::entity).flatMap(this::wrap);
    }

    default public Option<Tuple3<T1, T2, T3>> yieldOption() {
        return this.yieldOption(Tuple::of);
    }

    default public <R> Option<R> yieldOption(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().map(Fn3.tuple(f)).flatMap(this::wrap);
    }

    default public <R> Option<R> yieldFlatOption(Fn3<? super T1, ? super T2, ? super T3, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldOption(f).flatMap(IterativeInternals::entity).flatMap(this::wrap);
    }

    default public Try<Tuple3<T1, T2, T3>> yieldTry() {
        return this.yieldTry(Tuple::of);
    }

    default public <R> Try<R> yieldTry(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.toStream().headOption().toTry().mapTry(Fnc3.tuple(f)).flatMap(this::wrapTry);
    }

    default public <R> Try<R> yieldFlatTry(Fnc3<? super T1, ? super T2, ? super T3, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        return this.yieldTry(f).flatMap(IterativeInternals::entity).flatMap(this::wrapTry);
    }

    default public Validation<Seq<Throwable>, Stream<Tuple3<T1, T2, T3>>> validateStream() {
        return this.validateStream(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateStream(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldStream(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Stream<R>> validateFlatStream(Fn3<? super T1, ? super T2, ? super T3, ? extends Iterable<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatStream(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Option<Tuple3<T1, T2, T3>>> validateOption() {
        return this.validateOption(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateOption(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldOption(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Option<R>> validateFlatOption(Fn3<? super T1, ? super T2, ? super T3, ? extends Option<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatOption(f));
        }
        return Validation.invalid(failures);
    }

    default public Validation<Seq<Throwable>, Try<Tuple3<T1, T2, T3>>> validateTry() {
        return this.validateTry(Tuple::of);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateTry(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Validation<Seq<Throwable>, Try<R>> validateFlatTry(Fnc3<? super T1, ? super T2, ? super T3, ? extends Try<? extends R>> f) {
        Objects.requireNonNull(f, "f is null");
        Stream<Throwable> failures = this.failures();
        if (failures.isEmpty()) {
            return Validation.valid(this.yieldFlatTry(f));
        }
        return Validation.invalid(failures);
    }

    default public <R> Iterative3<R, T2, T3> map1(Fn1<? super T1, ? extends R> f) {
        return this.map(f, IterativeInternals::entity, IterativeInternals::entity);
    }

    default public <R> Iterative3<T1, R, T3> map2(Fn1<? super T2, ? extends R> f) {
        return this.map(IterativeInternals::entity, f, IterativeInternals::entity);
    }

    default public <R> Iterative3<T1, T2, R> map3(Fn1<? super T3, ? extends R> f) {
        return this.map(IterativeInternals::entity, IterativeInternals::entity, f);
    }

    default public <R2, R3> Iterative3<T1, R2, R3> mapRt2(Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3) {
        return this.map(IterativeInternals::entity, f2, f3);
    }

    default public <R1, R2> Iterative3<R1, R2, T3> mapLt2(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2) {
        return this.map(f1, f2, IterativeInternals::entity);
    }

    default public <R> Iterative3<R, T2, T3> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return this.inlineMap(f, this::wrap, this::wrap);
    }

    default public <R> Iterative3<T1, R, T3> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return this.inlineMap(this::wrap, f, this::wrap);
    }

    default public <R> Iterative3<T1, T2, R> inlineMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return this.inlineMap(this::wrap, this::wrap, f);
    }

    default public <R2, R3> Iterative3<T1, R2, R3> inlineMapRt2(Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3) {
        return this.inlineMap(this::wrap, f2, f3);
    }

    default public <R1, R2> Iterative3<R1, R2, T3> inlineMapLt2(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
        return this.inlineMap(f1, f2, this::wrap);
    }

    default public <R> Iterative3<R, T2, T3> flatMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return this.inlineMap1(f).forceFlat1();
    }

    default public <R> Iterative3<T1, R, T3> flatMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return this.inlineMap2(f).forceFlat2();
    }

    default public <R> Iterative3<T1, T2, R> flatMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return this.inlineMap3(f).forceFlat3();
    }

    default public <R2, R3> Iterative3<T1, R2, R3> flatMapRt2(Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3) {
        return this.inlineMapRt2(f2, f3).forceFlat2();
    }

    default public <R1, R2> Iterative3<R1, R2, T3> flatMapLt2(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2) {
        return this.inlineMapLt2(f1, f2).forceFlat2();
    }

    default public Iterative3<T1, T2, T3> filter1(Pr1<? super T1> p) {
        return this.filter(p, Pr1.value(true), Pr1.value(true));
    }

    default public Iterative3<T1, T2, T3> filter2(Pr1<? super T2> p) {
        return this.filter(Pr1.value(true), p, Pr1.value(true));
    }

    default public Iterative3<T1, T2, T3> filter3(Pr1<? super T3> p) {
        return this.filter(Pr1.value(true), Pr1.value(true), p);
    }

    default public Iterative3<T1, T2, T3> filterRt2(Pr1<? super T2> p2, Pr1<? super T3> p3) {
        return this.filter(Pr1.value(true), p2, p3);
    }

    default public Iterative3<T1, T2, T3> filterLt2(Pr1<? super T1> p1, Pr1<? super T2> p2) {
        return this.filter(p1, p2, Pr1.value(true));
    }

    default public <T4> Iterative4<T1, T2, T3, T4> pushBackOf(Iterable<? extends T4> t4) {
        return this.pushBackBy(IterativeHandler.streamWrap(t4));
    }

    default public <T4> Iterative4Cross<T1, T2, T3, T4> pushBackCrossOf(Iterable<? extends T4> t4) {
        return this.pushBackCrossBy(IterativeHandler.streamWrap(t4));
    }

    default public <T4> Iterative4Inline<T1, T2, T3, T4> pushBackInlineOf(Iterable<? extends T4> t4) {
        return this.pushBackInlineBy(IterativeHandler.streamWrap(t4));
    }

    default public <T0> Iterative4<T0, T1, T2, T3> pushFrontOf(Iterable<? extends T0> t0) {
        return this.pushFrontBy(IterativeHandler.streamWrap(t0));
    }

    default public <T0> Iterative4<T0, T1, T2, T3> pushFrontCrossOf(Iterable<? extends T0> t0) {
        return this.pushFrontCrossBy(IterativeHandler.streamWrap(t0));
    }

    default public <T0> Iterative4<T0, T1, T2, T3> pushFrontInlineOf(Iterable<? extends T0> t0) {
        return this.pushFrontInlineBy(IterativeHandler.streamWrap(t0));
    }

    default public <T4> Iterative4<T1, T2, T3, T4> pushBack(T4 t4) {
        return this.pushBackOf((Iterable<? extends T4>)this.wrap(t4));
    }

    default public <T4> Iterative4Cross<T1, T2, T3, T4> pushBackCross(T4 t4) {
        return this.pushBackCrossOf((Iterable<? extends T4>)this.wrap(t4));
    }

    default public <T4> Iterative4Inline<T1, T2, T3, T4> pushBackInline(T4 t4) {
        return this.pushBackInlineOf((Iterable<? extends T4>)this.wrap(t4));
    }

    default public <T0> Iterative4<T0, T1, T2, T3> pushFront(T0 t0) {
        return this.pushFrontOf((Iterable<? extends T0>)this.wrap(t0));
    }

    default public <T0> Iterative4<T0, T1, T2, T3> pushFrontCross(T0 t0) {
        return this.pushFrontCrossOf((Iterable<? extends T0>)this.wrap(t0));
    }

    default public <T0> Iterative4<T0, T1, T2, T3> pushFrontInline(T0 t0) {
        return this.pushFrontInlineOf((Iterable<? extends T0>)this.wrap(t0));
    }

    default public <B1, B2> Iterative5<T1, T2, T3, B1, B2> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.pushBackBy(b1).pushBackBy(b2);
    }

    default public <B1, B2> Iterative5Cross<T1, T2, T3, B1, B2> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2);
    }

    default public <B1, B2> Iterative5Inline<T1, T2, T3, B1, B2> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2);
    }

    default public <F1, F2> Iterative5<F1, F2, T1, T2, T3> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2> Iterative5<F1, F2, T1, T2, T3> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2> Iterative5<F1, F2, T1, T2, T3> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2) {
        return this.pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2> Iterative5<T1, T2, T3, B1, B2> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.pushBackOf(b1).pushBackOf(b2);
    }

    default public <B1, B2> Iterative5Cross<T1, T2, T3, B1, B2> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2);
    }

    default public <B1, B2> Iterative5Inline<T1, T2, T3, B1, B2> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2);
    }

    default public <F1, F2> Iterative5<F1, F2, T1, T2, T3> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2> Iterative5<F1, F2, T1, T2, T3> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2> Iterative5<F1, F2, T1, T2, T3> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2) {
        return this.pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2> Iterative5<T1, T2, T3, B1, B2> pushBack(B1 b1, B2 b2) {
        return this.pushBack(b1).pushBack(b2);
    }

    default public <B1, B2> Iterative5Cross<T1, T2, T3, B1, B2> pushBackCross(B1 b1, B2 b2) {
        return this.pushBackCross(b1).pushBackCross(b2);
    }

    default public <B1, B2> Iterative5Inline<T1, T2, T3, B1, B2> pushBackInline(B1 b1, B2 b2) {
        return this.pushBackInline(b1).pushBackInline(b2);
    }

    default public <F1, F2> Iterative5<F1, F2, T1, T2, T3> pushFront(F1 f1, F2 f2) {
        return this.pushFront(f2).pushFront(f1);
    }

    default public <F1, F2> Iterative5<F1, F2, T1, T2, T3> pushFrontCross(F1 f1, F2 f2) {
        return this.pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2> Iterative5<F1, F2, T1, T2, T3> pushFrontInline(F1 f1, F2 f2) {
        return this.pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3> Iterative6<T1, T2, T3, B1, B2, B3> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.pushBackBy(b1).pushBackBy(b2).pushBackBy(b3);
    }

    default public <B1, B2, B3> Iterative6Cross<T1, T2, T3, B1, B2, B3> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3);
    }

    default public <B1, B2, B3> Iterative6Inline<T1, T2, T3, B1, B2, B3> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3);
    }

    default public <F1, F2, F3> Iterative6<F1, F2, F3, T1, T2, T3> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3> Iterative6<F1, F2, F3, T1, T2, T3> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3> Iterative6<F1, F2, F3, T1, T2, T3> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3) {
        return this.pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3> Iterative6<T1, T2, T3, B1, B2, B3> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.pushBackOf(b1).pushBackOf(b2).pushBackOf(b3);
    }

    default public <B1, B2, B3> Iterative6Cross<T1, T2, T3, B1, B2, B3> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3);
    }

    default public <B1, B2, B3> Iterative6Inline<T1, T2, T3, B1, B2, B3> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3);
    }

    default public <F1, F2, F3> Iterative6<F1, F2, F3, T1, T2, T3> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3> Iterative6<F1, F2, F3, T1, T2, T3> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3> Iterative6<F1, F2, F3, T1, T2, T3> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3) {
        return this.pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3> Iterative6<T1, T2, T3, B1, B2, B3> pushBack(B1 b1, B2 b2, B3 b3) {
        return this.pushBack(b1).pushBack(b2).pushBack(b3);
    }

    default public <B1, B2, B3> Iterative6Cross<T1, T2, T3, B1, B2, B3> pushBackCross(B1 b1, B2 b2, B3 b3) {
        return this.pushBackCross(b1).pushBackCross(b2).pushBackCross(b3);
    }

    default public <B1, B2, B3> Iterative6Inline<T1, T2, T3, B1, B2, B3> pushBackInline(B1 b1, B2 b2, B3 b3) {
        return this.pushBackInline(b1).pushBackInline(b2).pushBackInline(b3);
    }

    default public <F1, F2, F3> Iterative6<F1, F2, F3, T1, T2, T3> pushFront(F1 f1, F2 f2, F3 f3) {
        return this.pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3> Iterative6<F1, F2, F3, T1, T2, T3> pushFrontCross(F1 f1, F2 f2, F3 f3) {
        return this.pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3> Iterative6<F1, F2, F3, T1, T2, T3> pushFrontInline(F1 f1, F2 f2, F3 f3) {
        return this.pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4> Iterative7<T1, T2, T3, B1, B2, B3, B4> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.pushBackBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4);
    }

    default public <B1, B2, B3, B4> Iterative7Cross<T1, T2, T3, B1, B2, B3, B4> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4);
    }

    default public <B1, B2, B3, B4> Iterative7Inline<T1, T2, T3, B1, B2, B3, B4> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4);
    }

    default public <F1, F2, F3, F4> Iterative7<F1, F2, F3, F4, T1, T2, T3> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.pushFrontBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4> Iterative7<F1, F2, F3, F4, T1, T2, T3> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.pushFrontCrossBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4> Iterative7<F1, F2, F3, F4, T1, T2, T3> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4) {
        return this.pushFrontInlineBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4> Iterative7<T1, T2, T3, B1, B2, B3, B4> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.pushBackOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4);
    }

    default public <B1, B2, B3, B4> Iterative7Cross<T1, T2, T3, B1, B2, B3, B4> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4);
    }

    default public <B1, B2, B3, B4> Iterative7Inline<T1, T2, T3, B1, B2, B3, B4> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4);
    }

    default public <F1, F2, F3, F4> Iterative7<F1, F2, F3, F4, T1, T2, T3> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.pushFrontOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4> Iterative7<F1, F2, F3, F4, T1, T2, T3> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.pushFrontCrossOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4> Iterative7<F1, F2, F3, F4, T1, T2, T3> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4) {
        return this.pushFrontInlineOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4> Iterative7<T1, T2, T3, B1, B2, B3, B4> pushBack(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.pushBack(b1).pushBack(b2).pushBack(b3).pushBack(b4);
    }

    default public <B1, B2, B3, B4> Iterative7Cross<T1, T2, T3, B1, B2, B3, B4> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.pushBackCross(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4);
    }

    default public <B1, B2, B3, B4> Iterative7Inline<T1, T2, T3, B1, B2, B3, B4> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4) {
        return this.pushBackInline(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4);
    }

    default public <F1, F2, F3, F4> Iterative7<F1, F2, F3, F4, T1, T2, T3> pushFront(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.pushFront(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4> Iterative7<F1, F2, F3, F4, T1, T2, T3> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.pushFrontCross(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4> Iterative7<F1, F2, F3, F4, T1, T2, T3> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4) {
        return this.pushFrontInline(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public <B1, B2, B3, B4, B5> Iterative8<T1, T2, T3, B1, B2, B3, B4, B5> pushBackBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return this.pushBackBy(b1).pushBackBy(b2).pushBackBy(b3).pushBackBy(b4).pushBackBy(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative8Cross<T1, T2, T3, B1, B2, B3, B4, B5> pushBackCrossBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return this.pushBackCrossBy(b1).pushBackCrossBy(b2).pushBackCrossBy(b3).pushBackCrossBy(b4).pushBackCrossBy(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative8Inline<T1, T2, T3, B1, B2, B3, B4, B5> pushBackInlineBy(Iterable<? extends Stream<? extends B1>> b1, Iterable<? extends Stream<? extends B2>> b2, Iterable<? extends Stream<? extends B3>> b3, Iterable<? extends Stream<? extends B4>> b4, Iterable<? extends Stream<? extends B5>> b5) {
        return this.pushBackInlineBy(b1).pushBackInlineBy(b2).pushBackInlineBy(b3).pushBackInlineBy(b4).pushBackInlineBy(b5);
    }

    default public <F1, F2, F3, F4, F5> Iterative8<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return this.pushFrontBy(f5).pushFrontBy(f4).pushFrontBy(f3).pushFrontBy(f2).pushFrontBy(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative8<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontCrossBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return this.pushFrontCrossBy(f5).pushFrontCrossBy(f4).pushFrontCrossBy(f3).pushFrontCrossBy(f2).pushFrontCrossBy(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative8<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontInlineBy(Iterable<? extends Stream<? extends F1>> f1, Iterable<? extends Stream<? extends F2>> f2, Iterable<? extends Stream<? extends F3>> f3, Iterable<? extends Stream<? extends F4>> f4, Iterable<? extends Stream<? extends F5>> f5) {
        return this.pushFrontInlineBy(f5).pushFrontInlineBy(f4).pushFrontInlineBy(f3).pushFrontInlineBy(f2).pushFrontInlineBy(f1);
    }

    default public <B1, B2, B3, B4, B5> Iterative8<T1, T2, T3, B1, B2, B3, B4, B5> pushBackOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return this.pushBackOf(b1).pushBackOf(b2).pushBackOf(b3).pushBackOf(b4).pushBackOf(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative8Cross<T1, T2, T3, B1, B2, B3, B4, B5> pushBackCrossOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return this.pushBackCrossOf(b1).pushBackCrossOf(b2).pushBackCrossOf(b3).pushBackCrossOf(b4).pushBackCrossOf(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative8Inline<T1, T2, T3, B1, B2, B3, B4, B5> pushBackInlineOf(Iterable<? extends B1> b1, Iterable<? extends B2> b2, Iterable<? extends B3> b3, Iterable<? extends B4> b4, Iterable<? extends B5> b5) {
        return this.pushBackInlineOf(b1).pushBackInlineOf(b2).pushBackInlineOf(b3).pushBackInlineOf(b4).pushBackInlineOf(b5);
    }

    default public <F1, F2, F3, F4, F5> Iterative8<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return this.pushFrontOf(f5).pushFrontOf(f4).pushFrontOf(f3).pushFrontOf(f2).pushFrontOf(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative8<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontCrossOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return this.pushFrontCrossOf(f5).pushFrontCrossOf(f4).pushFrontCrossOf(f3).pushFrontCrossOf(f2).pushFrontCrossOf(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative8<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontInlineOf(Iterable<? extends F1> f1, Iterable<? extends F2> f2, Iterable<? extends F3> f3, Iterable<? extends F4> f4, Iterable<? extends F5> f5) {
        return this.pushFrontInlineOf(f5).pushFrontInlineOf(f4).pushFrontInlineOf(f3).pushFrontInlineOf(f2).pushFrontInlineOf(f1);
    }

    default public <B1, B2, B3, B4, B5> Iterative8<T1, T2, T3, B1, B2, B3, B4, B5> pushBack(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return this.pushBack(b1).pushBack(b2).pushBack(b3).pushBack(b4).pushBack(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative8Cross<T1, T2, T3, B1, B2, B3, B4, B5> pushBackCross(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return this.pushBackCross(b1).pushBackCross(b2).pushBackCross(b3).pushBackCross(b4).pushBackCross(b5);
    }

    default public <B1, B2, B3, B4, B5> Iterative8Inline<T1, T2, T3, B1, B2, B3, B4, B5> pushBackInline(B1 b1, B2 b2, B3 b3, B4 b4, B5 b5) {
        return this.pushBackInline(b1).pushBackInline(b2).pushBackInline(b3).pushBackInline(b4).pushBackInline(b5);
    }

    default public <F1, F2, F3, F4, F5> Iterative8<F1, F2, F3, F4, F5, T1, T2, T3> pushFront(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return this.pushFront(f5).pushFront(f4).pushFront(f3).pushFront(f2).pushFront(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative8<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontCross(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return this.pushFrontCross(f5).pushFrontCross(f4).pushFrontCross(f3).pushFrontCross(f2).pushFrontCross(f1);
    }

    default public <F1, F2, F3, F4, F5> Iterative8<F1, F2, F3, F4, F5, T1, T2, T3> pushFrontInline(F1 f1, F2 f2, F3 f3, F4 f4, F5 f5) {
        return this.pushFrontInline(f5).pushFrontInline(f4).pushFrontInline(f3).pushFrontInline(f2).pushFrontInline(f1);
    }

    default public Iterative3<T1, T2, T3> forceInlineFlat() {
        return Iterative.ofTuple3(this.yieldStream());
    }

    default public Iterative3<T1, T2, T3> forceFlat1() {
        return this.create(this.splitLt2().forceFlat1(), this.iterableStream3());
    }

    default public Iterative3<T1, T2, T3> forceFlat2() {
        return this.create(this.splitLt2().forceFlat2(), this.iterableStream3());
    }

    default public Iterative3<T1, T2, T3> forceFlat3() {
        return this.create(this.splitLt2(), IterativeHandler.streamWrap(this.iterable3()));
    }

    default public Iterative3<T1, T2, T3> forceFlatAll() {
        return this.create(this.splitLt2().forceFlatAll(), IterativeHandler.streamWrap(this.iterable3()));
    }

    default public <R> R getOnSuccessOrNull(Fn1<? super Iterative3<? extends T1, ? extends T2, ? extends T3>, ? extends R> f) {
        return (R)this.getterOnSuccess(f).onFailure(Sp.empty());
    }

    default public <R> R getOnSuccessOrThrow(Fn1<? super Iterative3<? extends T1, ? extends T2, ? extends T3>, ? extends R> f) {
        return (R)this.getterOnSuccess(Fn1.narrow(f)).onFailure(Fn0.pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public Tuple3<T1, T2, T3> getOrElse(Sp<? extends Tuple3<? extends T1, ? extends T2, ? extends T3>> s) {
        return (Tuple3)this.getterOnSuccess().onFailure((Tuple3<T1, T2, T3>)s.afterApply(Tuple::narrow));
    }

    default public Tuple3<T1, T2, T3> getOrElse(Tuple3<? extends T1, ? extends T2, ? extends T3> t) {
        return (Tuple3)this.getterOnSuccess().onFailure((Tuple3<T1, T2, T3>)Sp.value(Tuple.narrow(t)));
    }

    default public Tuple3<T1, T2, T3> getOrNull() {
        return (Tuple3)this.getterOnSuccess().onFailure((Tuple3<T1, T2, T3>)Sp.empty());
    }

    default public Tuple3<T1, T2, T3> getOrThrow() {
        return (Tuple3)this.getterOnSuccess().onFailure((Tuple3<T1, T2, T3>)Fn0.pass(IterativeGetter::throwableSupplier, "tuple").toSupplier());
    }

    default public Iterative3Getter<T1, T2, T3> getter() {
        return new Iterative3Getter.Iterative3GetterImpl(this);
    }

    default public Iterative3Getter.Iterative3Fail<T1, T2, T3, Tuple3<T1, T2, T3>> getterOnSuccess() {
        return this.getter().onSuccess();
    }

    default public <R> Iterative3Getter.Iterative3Fail<T1, T2, T3, R> getterOnSuccess(R r) {
        return this.getter().onSuccess(r);
    }

    default public <R> Iterative3Getter.Iterative3Fail<T1, T2, T3, R> getterOnSuccess(Sp<? extends R> s) {
        return this.getter().onSuccess(s);
    }

    default public <R> Iterative3Getter.Iterative3Fail<T1, T2, T3, R> getterOnSuccess(Fn1<? super Iterative3<? extends T1, ? extends T2, ? extends T3>, ? extends R> f) {
        return this.getter().onSuccess(f);
    }

    default public <R> Iterative3Getter.Iterative3Success<T1, T2, T3, R> getterOnFailure(R r) {
        return this.getter().onFailure(r);
    }

    default public <R> Iterative3Getter.Iterative3Success<T1, T2, T3, R> getterOnFailure(Sp<? extends R> s) {
        return this.getter().onFailure(s);
    }

    default public <R> Iterative3Getter.Iterative3Success<T1, T2, T3, R> getterOnFailure(Fn1<? super Iterative3<? extends T1, ? extends T2, ? extends T3>, ? extends R> f) {
        return this.getter().onFailure(f);
    }

    default public Iterative1<Tuple3<T1, T2, T3>> reduce() {
        return this.reduce(Tuple::of);
    }

    default public <R> Iterative1<R> reduce(Fn3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.toTupleStream().map(Fn3.tuple(IterativeHandler::cross)).map(stream -> stream.map(Fn3.tuple(f))));
    }

    default public <R> Iterative2<T1, R> reduceSimpleRt(Fn2<? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt2().create(this.splitLt1(), this.splitRt2().reduce(f).iterableStream1());
    }

    default public <R> Iterative2<T1, R> reduceChainRt(Fn2<? super T2, ? super T3, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.splitLt2().create(this.splitLt1(), this.reduce((Fn3 & Serializable)(a1, a2, a3) -> f.apply(a2, a3)).iterableStream1());
    }

    default public <R> Iterative2<R, T3> reduceSimpleLt(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.create(this.splitLt2().reduce(f), this.iterableStream3());
    }

    default public <R> Iterative2<R, T3> reduceChainLt(Fn2<? super T1, ? super T2, ? extends R> f) {
        return this.reduceSimpleLt(f);
    }

    default public <A1> Iterative3Args.Iterative3Args1<T1, T2, T3, A1> crossArgs(A1 a1) {
        return this.crossArgsOf((Iterable<? extends A1>)this.wrap(a1));
    }

    default public <A1> Iterative3Args.Iterative3Args1<T1, T2, T3, A1> crossArgsOf(Iterable<? extends A1> a1) {
        return new Iterative3Args.Iterative3Args1.Iterative3Args1Impl(this, this.accessBuilder().cross().of(a1), true);
    }

    default public <A1, A2> Iterative3Args.Iterative3Args2<T1, T2, T3, A1, A2> crossArgs(A1 a1, A2 a2) {
        return this.crossArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2));
    }

    default public <A1, A2> Iterative3Args.Iterative3Args2<T1, T2, T3, A1, A2> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2) {
        return new Iterative3Args.Iterative3Args2.Iterative3Args2Impl(this, this.accessBuilder().cross().of(a1, (Iterable)a2), true);
    }

    default public <A1, A2, A3> Iterative3Args.Iterative3Args3<T1, T2, T3, A1, A2, A3> crossArgs(A1 a1, A2 a2, A3 a3) {
        return this.crossArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3));
    }

    default public <A1, A2, A3> Iterative3Args.Iterative3Args3<T1, T2, T3, A1, A2, A3> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
        return new Iterative3Args.Iterative3Args3.Iterative3Args3Impl(this, this.accessBuilder().cross().of(a1, a2, a3), true);
    }

    default public <A1, A2, A3, A4> Iterative3Args.Iterative3Args4<T1, T2, T3, A1, A2, A3, A4> crossArgs(A1 a1, A2 a2, A3 a3, A4 a4) {
        return this.crossArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3), (Iterable<? extends A4>)this.wrap(a4));
    }

    default public <A1, A2, A3, A4> Iterative3Args.Iterative3Args4<T1, T2, T3, A1, A2, A3, A4> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
        return new Iterative3Args.Iterative3Args4.Iterative3Args4Impl(this, this.accessBuilder().cross().of(a1, a2, a3, a4), true);
    }

    default public <A1, A2, A3, A4, A5> Iterative3Args.Iterative3Args5<T1, T2, T3, A1, A2, A3, A4, A5> crossArgs(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5) {
        return this.crossArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3), (Iterable<? extends A4>)this.wrap(a4), (Iterable<? extends A5>)this.wrap(a5));
    }

    default public <A1, A2, A3, A4, A5> Iterative3Args.Iterative3Args5<T1, T2, T3, A1, A2, A3, A4, A5> crossArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
        return new Iterative3Args.Iterative3Args5.Iterative3Args5Impl(this, this.accessBuilder().cross().of(a1, a2, a3, a4, a5), true);
    }

    default public <A1> Iterative3Args.Iterative3Args1<T1, T2, T3, A1> inlineArgs(A1 a1) {
        return this.inlineArgsOf((Iterable<? extends A1>)this.wrap(a1));
    }

    default public <A1> Iterative3Args.Iterative3Args1<T1, T2, T3, A1> inlineArgsOf(Iterable<? extends A1> a1) {
        return new Iterative3Args.Iterative3Args1.Iterative3Args1Impl(this, this.accessBuilder().inline().of(a1), false);
    }

    default public <A1, A2> Iterative3Args.Iterative3Args2<T1, T2, T3, A1, A2> inlineArgs(A1 a1, A2 a2) {
        return this.inlineArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2));
    }

    default public <A1, A2> Iterative3Args.Iterative3Args2<T1, T2, T3, A1, A2> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2) {
        return new Iterative3Args.Iterative3Args2.Iterative3Args2Impl(this, this.accessBuilder().inline().of(a1, (Iterable)a2), false);
    }

    default public <A1, A2, A3> Iterative3Args.Iterative3Args3<T1, T2, T3, A1, A2, A3> inlineArgs(A1 a1, A2 a2, A3 a3) {
        return this.inlineArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3));
    }

    default public <A1, A2, A3> Iterative3Args.Iterative3Args3<T1, T2, T3, A1, A2, A3> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3) {
        return new Iterative3Args.Iterative3Args3.Iterative3Args3Impl(this, this.accessBuilder().inline().of(a1, a2, a3), false);
    }

    default public <A1, A2, A3, A4> Iterative3Args.Iterative3Args4<T1, T2, T3, A1, A2, A3, A4> inlineArgs(A1 a1, A2 a2, A3 a3, A4 a4) {
        return this.inlineArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3), (Iterable<? extends A4>)this.wrap(a4));
    }

    default public <A1, A2, A3, A4> Iterative3Args.Iterative3Args4<T1, T2, T3, A1, A2, A3, A4> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4) {
        return new Iterative3Args.Iterative3Args4.Iterative3Args4Impl(this, this.accessBuilder().inline().of(a1, a2, a3, a4), false);
    }

    default public <A1, A2, A3, A4, A5> Iterative3Args.Iterative3Args5<T1, T2, T3, A1, A2, A3, A4, A5> inlineArgs(A1 a1, A2 a2, A3 a3, A4 a4, A5 a5) {
        return this.inlineArgsOf((Iterable<? extends A1>)this.wrap(a1), (Iterable<? extends A2>)this.wrap(a2), (Iterable<? extends A3>)this.wrap(a3), (Iterable<? extends A4>)this.wrap(a4), (Iterable<? extends A5>)this.wrap(a5));
    }

    default public <A1, A2, A3, A4, A5> Iterative3Args.Iterative3Args5<T1, T2, T3, A1, A2, A3, A4, A5> inlineArgsOf(Iterable<? extends A1> a1, Iterable<? extends A2> a2, Iterable<? extends A3> a3, Iterable<? extends A4> a4, Iterable<? extends A5> a5) {
        return new Iterative3Args.Iterative3Args5.Iterative3Args5Impl(this, this.accessBuilder().inline().of(a1, a2, a3, a4, a5), false);
    }

    default public Iterative2Args.Iterative2Args1<T1, T2, T3> inlineArgsRt1() {
        return new Iterative2Args.Iterative2Args1.Iterative2Args1Impl<T1, T2, T3>(this.splitLt2(), this.splitRt1(), false);
    }

    default public Iterative2Args.Iterative2Args1<T2, T3, T1> inlineArgsLt1() {
        return new Iterative2Args.Iterative2Args1.Iterative2Args1Impl<T2, T3, T1>(this.splitRt2(), this.splitLt1(), false);
    }

    default public Iterative2Args.Iterative2Args1<T1, T2, T3> crossArgsRt1() {
        return new Iterative2Args.Iterative2Args1.Iterative2Args1Impl<T1, T2, T3>(this.splitLt2(), this.splitRt1(), true);
    }

    default public Iterative2Args.Iterative2Args1<T2, T3, T1> crossArgsLt1() {
        return new Iterative2Args.Iterative2Args1.Iterative2Args1Impl<T2, T3, T1>(this.splitRt2(), this.splitLt1(), true);
    }

    default public Iterative1Args.Iterative1Args2<T1, T2, T3> inlineArgsRt2() {
        return new Iterative1Args.Iterative1Args2.Iterative1Args2Impl<T1, T2, T3>(this.splitLt1(), this.splitRt2(), false);
    }

    default public Iterative1Args.Iterative1Args2<T3, T1, T2> inlineArgsLt2() {
        return new Iterative1Args.Iterative1Args2.Iterative1Args2Impl<T3, T1, T2>(this.splitRt1(), this.splitLt2(), false);
    }

    default public Iterative1Args.Iterative1Args2<T1, T2, T3> crossArgsRt2() {
        return new Iterative1Args.Iterative1Args2.Iterative1Args2Impl<T1, T2, T3>(this.splitLt1(), this.splitRt2(), true);
    }

    default public Iterative1Args.Iterative1Args2<T3, T1, T2> crossArgsLt2() {
        return new Iterative1Args.Iterative1Args2.Iterative1Args2Impl<T3, T1, T2>(this.splitRt1(), this.splitLt2(), true);
    }

    default public IterativeSupplier.Iterative1Supplier2.TransformSupplier<T1, T2, T3> iterativeSupplier() {
        return new IterativeSupplier.Iterative1Supplier2.Iterative1Supplier2Impl(this);
    }

    default public IterativeSupplier.Iterative1Supplier2.TransformSupplier<T1, T2, T3> crossSupplierAllLt() {
        return new IterativeSupplier.Iterative1Supplier2.Iterative1Supplier2Impl<T1, T2, T3>(this.forceCrossAll());
    }

    default public IterativeSupplier.Iterative1Supplier2.TransformSupplier<T1, T2, T3> inlineSupplierAllLt() {
        return new IterativeSupplier.Iterative1Supplier2.Iterative1Supplier2Impl<T1, T2, T3>(this.forceInlineAll());
    }

    default public IterativeSupplier.Iterative1Supplier2.TransformSupplier<T3, T1, T2> crossSupplierAllRt() {
        return new IterativeSupplier.Iterative1Supplier2.Iterative1Supplier2Impl<T3, T1, T2>(this.forceCrossAll().popBack().pushFrontCrossBy(this.iterableStream3()));
    }

    default public IterativeSupplier.Iterative1Supplier2.TransformSupplier<T3, T1, T2> inlineSupplierAllRt() {
        return new IterativeSupplier.Iterative1Supplier2.Iterative1Supplier2Impl<T3, T1, T2>(this.forceInlineAll().popBack().pushFrontInlineBy(this.iterableStream3()));
    }

    default public IterativeSupplier.Iterative1Supplier2.TransformSupplier<T1, T2, T3> crossSupplierLt() {
        return new IterativeSupplier.Iterative1Supplier2.Iterative1Supplier2Impl<T1, T2, T3>(this.forceCross2());
    }

    default public IterativeSupplier.Iterative1Supplier2.TransformSupplier<T1, T2, T3> inlineSupplierLt() {
        return new IterativeSupplier.Iterative1Supplier2.Iterative1Supplier2Impl<T1, T2, T3>(this.forceInline2());
    }

    default public IterativeSupplier.Iterative1Supplier2.TransformSupplier<T3, T1, T2> crossSupplierRt() {
        return new IterativeSupplier.Iterative1Supplier2.Iterative1Supplier2Impl<T3, T1, T2>(this.popBack().pushFrontCrossBy(this.iterableStream3()));
    }

    default public IterativeSupplier.Iterative1Supplier2.TransformSupplier<T3, T1, T2> inlineSupplierRt() {
        return new IterativeSupplier.Iterative1Supplier2.Iterative1Supplier2Impl<T3, T1, T2>(this.popBack().pushFrontInlineBy(this.iterableStream3()));
    }

    default public <A1> Iterative4<T1, T2, T3, A1> crossJoinRt(Iterative1<? extends A1> iterative) {
        return this.createCross(this, iterative.iterableStream1());
    }

    default public <A1> Iterative4<A1, T1, T2, T3> crossJoinLt(Iterative1<? extends A1> iterative) {
        return this.pushFrontCrossBy(iterative.iterableStream1());
    }

    default public <A1, A2> Iterative5<T1, T2, T3, A1, A2> crossJoinRt(Iterative2<? extends A1, ? extends A2> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt()), iterative.iterableStream2(), iterative.isCross());
    }

    default public <A1, A2> Iterative5<A1, A2, T1, T2, T3> crossJoinLt(Iterative2<? extends A1, ? extends A2> iterative) {
        return iterative.isCross() ? this.crossJoinLt(iterative.splitRt()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3> Iterative6<T1, T2, T3, A1, A2, A3> crossJoinRt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt2()), iterative.iterableStream3(), iterative.isCross());
    }

    default public <A1, A2, A3> Iterative6<A1, A2, A3, T1, T2, T3> crossJoinLt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return iterative.splitLt2().isCross() ? this.crossJoinLt(iterative.splitRt2()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt2()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4> Iterative7<T1, T2, T3, A1, A2, A3, A4> crossJoinRt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt3()), iterative.iterableStream4(), iterative.isCross());
    }

    default public <A1, A2, A3, A4> Iterative7<A1, A2, A3, A4, T1, T2, T3> crossJoinLt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return iterative.splitLt2().isCross() ? this.crossJoinLt(iterative.splitRt3()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt3()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4, A5> Iterative8<T1, T2, T3, A1, A2, A3, A4, A5> crossJoinRt(Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> iterative) {
        return this.create(this.crossJoinRt(iterative.splitLt4()), iterative.iterableStream5(), iterative.isCross());
    }

    default public <A1, A2, A3, A4, A5> Iterative8<A1, A2, A3, A4, A5, T1, T2, T3> crossJoinLt(Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> iterative) {
        return iterative.splitLt2().isCross() ? this.crossJoinLt(iterative.splitRt4()).pushFrontCrossBy(iterative.iterableStream1()) : this.crossJoinLt(iterative.splitRt4()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1> Iterative4<T1, T2, T3, A1> inlineJoinRt(Iterative1<? extends A1> iterative) {
        return this.createInline(this, iterative.iterableStream1());
    }

    default public <A1> Iterative4<A1, T1, T2, T3> inlineJoinLt(Iterative1<? extends A1> iterative) {
        return this.pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2> Iterative5<T1, T2, T3, A1, A2> inlineJoinRt(Iterative2<? extends A1, ? extends A2> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt()), iterative.iterableStream2(), iterative.isCross());
    }

    default public <A1, A2> Iterative5<A1, A2, T1, T2, T3> inlineJoinLt(Iterative2<? extends A1, ? extends A2> iterative) {
        return iterative.isCross() ? this.inlineJoinLt(iterative.splitRt()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3> Iterative6<T1, T2, T3, A1, A2, A3> inlineJoinRt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt2()), iterative.iterableStream3(), iterative.isCross());
    }

    default public <A1, A2, A3> Iterative6<A1, A2, A3, T1, T2, T3> inlineJoinLt(Iterative3<? extends A1, ? extends A2, ? extends A3> iterative) {
        return iterative.splitLt2().isCross() ? this.inlineJoinLt(iterative.splitRt2()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt2()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4> Iterative7<T1, T2, T3, A1, A2, A3, A4> inlineJoinRt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt3()), iterative.iterableStream4(), iterative.isCross());
    }

    default public <A1, A2, A3, A4> Iterative7<A1, A2, A3, A4, T1, T2, T3> inlineJoinLt(Iterative4<? extends A1, ? extends A2, ? extends A3, ? extends A4> iterative) {
        return iterative.splitLt2().isCross() ? this.inlineJoinLt(iterative.splitRt3()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt3()).pushFrontInlineBy(iterative.iterableStream1());
    }

    default public <A1, A2, A3, A4, A5> Iterative8<T1, T2, T3, A1, A2, A3, A4, A5> inlineJoinRt(Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> iterative) {
        return this.create(this.inlineJoinRt(iterative.splitLt4()), iterative.iterableStream5(), iterative.isCross());
    }

    default public <A1, A2, A3, A4, A5> Iterative8<A1, A2, A3, A4, A5, T1, T2, T3> inlineJoinLt(Iterative5<? extends A1, ? extends A2, ? extends A3, ? extends A4, ? extends A5> iterative) {
        return iterative.splitLt2().isCross() ? this.inlineJoinLt(iterative.splitRt4()).pushFrontCrossBy(iterative.iterableStream1()) : this.inlineJoinLt(iterative.splitRt4()).pushFrontInlineBy(iterative.iterableStream1());
    }

    public static abstract class Iterative3Abst<T1, T2, T3> implements Iterative3<T1, T2, T3> {

        protected final Iterative2<T1, T2> iterative;
        protected final Iterable<Stream<T3>> right;

        Iterative3Abst(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends T3> right) {
            Objects.requireNonNull(iterative, "iterative is null");
            Objects.requireNonNull(right, "right is null");
            this.iterative = iterative;
            this.right = SimpleIterative.of(right).inlineMap(this::wrap).map(Stream::of).toIterable();
        }

        Iterative3Abst(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends Stream<? extends T3>> right, boolean ign) {
            Objects.requireNonNull(iterative, "iterative is null");
            Objects.requireNonNull(right, "right is null");
            this.iterative = iterative;
            this.right = SimpleIterative.of(right).map((Fn1 & Serializable)iter -> iter.flatMap(this::wrap));
        }

        @Override
        public Stream<Tuple3<T1, T2, T3>> toStream() {
            return this.toTupleStream().map(Fn3.tuple(IterativeHandler::cross)).flatMap(IterativeInternals::entityIterable);
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
            return this.right;
        }

        @Override
        public Iterative2<T1, T2> innerIterative() {
            return this.iterative;
        }

        @Override
        public Iterative1<T1> splitLt1() {
            return this.splitLt2().splitLt();
        }

        @Override
        public Iterative2<T1, T2> splitLt2() {
            return this.innerIterative();
        }

        @Override
        public Iterative1<T3> splitRt1() {
            return this.splitRt2().splitRt();
        }

        @Override
        public Iterative2<T2, T3> splitRt2() {
            return this.popFront();
        }

        @Override
        public Iterative3<T1, T2, T3> forceCross2() {
            return this.create(this.iterative.forceCross2(), this.right);
        }

        @Override
        public Iterative3Cross<T1, T2, T3> forceCross3() {
            return this.createCross(this.iterative, this.right);
        }

        @Override
        public Iterative3Cross<T1, T2, T3> forceCrossAll() {
            return this.createCross(this.iterative.forceCrossAll(), this.right);
        }

        @Override
        public Iterative3<T1, T2, T3> forceInline2() {
            return this.createInline(this.iterative.forceInline2(), this.right);
        }

        @Override
        public Iterative3Inline<T1, T2, T3> forceInline3() {
            return this.createInline(this.iterative, this.right);
        }

        @Override
        public Iterative3Inline<T1, T2, T3> forceInlineAll() {
            return this.createInline(this.iterative.forceInlineAll(), this.right);
        }

        @Override
        public <T4> Iterative4<T1, T2, T3, T4> pushBackBy(Iterable<? extends Stream<? extends T4>> t4) {
            return this.create(this, t4);
        }

        @Override
        public <T4> Iterative4Cross<T1, T2, T3, T4> pushBackCrossBy(Iterable<? extends Stream<? extends T4>> t4) {
            return this.createCross(this, t4);
        }

        @Override
        public <T4> Iterative4Inline<T1, T2, T3, T4> pushBackInlineBy(Iterable<? extends Stream<? extends T4>> t4) {
            return this.createInline(this, t4);
        }

        @Override
        public <T0> Iterative4<T0, T1, T2, T3> pushFrontBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.pushFrontBy(t0), this.right);
        }

        @Override
        public <T0> Iterative4<T0, T1, T2, T3> pushFrontCrossBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.pushFrontCrossBy(t0), this.right);
        }

        @Override
        public <T0> Iterative4<T0, T1, T2, T3> pushFrontInlineBy(Iterable<? extends Stream<? extends T0>> t0) {
            return this.create(this.iterative.pushFrontInlineBy(t0), this.right);
        }

        @Override
        public Iterative2<T1, T2> popBack(Cs1<? super T3> c) {
            Objects.requireNonNull(c, "c is null");
            SimpleIterative.of(this.iterable3()).toIterable().forEach(c);
            return this.iterative;
        }

        @Override
        public Iterative2<T1, T2> popBackChain(Cs1<? super T3> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs3.tuple(c.ignoring2Lt()));
            return this.splitLt2();
        }

        @Override
        public Iterative2<T2, T3> popFront(Cs1<? super T1> c) {
            Objects.requireNonNull(c, "c is null");
            return this.create(this.iterative.popFront(c), this.iterableStream3());
        }

        @Override
        public Iterative1<T1> popBack2(Cs2<? super T2, ? super T3> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitRt2().forEach(c);
            return this.splitLt1();
        }

        @Override
        public Iterative1<T1> popBackChain2(Cs2<? super T2, ? super T3> c) {
            Objects.requireNonNull(c, "c is null");
            this.toStream().forEach(Cs3.tuple(c.ignoring1Lt()));
            return this.splitLt1();
        }

        @Override
        public Iterative1<T3> popFront2(Cs2<? super T1, ? super T2> c) {
            Objects.requireNonNull(c, "c is null");
            this.splitLt2().forEach(c);
            return this.splitRt1();
        }

        @Override
        public Iterative3<T1, T2, T3> nonNullable() {
            return this.isNullable() ? this.create(this.iterative, this.right) : this;
        }

        @Override
        public Iterative3<T1, T2, T3> nullable() {
            return this.isNullable() ? this : this.create(this.iterative, this.right);
        }

        @Override
        public Iterative3<T1, T2, T3> forceCleanEmpty1() {
            return this.create(this.iterative.forceCleanEmpty1(), this.right);
        }

        @Override
        public Iterative3<T1, T2, T3> forceCleanEmpty2() {
            return this.create(this.iterative.forceCleanEmpty2(), this.right);
        }

        @Override
        public Iterative3<T1, T2, T3> forceCleanEmpty3() {
            return this.create(this.iterative, IterativeHandler.clean(this.right));
        }

        @Override
        public Iterative3<T1, T2, T3> forceCleanEmptyAll() {
            return this.create(this.iterative.forceCleanEmptyAll(), IterativeHandler.clean(this.right));
        }

        @Override
        public <R1, R2, R3> Iterative3<R1, R2, R3> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3) {
            Objects.requireNonNull(f1, "f1 is null");
            Objects.requireNonNull(f2, "f2 is null");
            Objects.requireNonNull(f3, "f3 is null");
            return this.create(this.iterative.map(f1, f2), SimpleIterative.of(this.iterableStream3()).map((Fn1 & Serializable)iter -> iter.map((Function)((Object)f3)).flatMap(this::wrap)).toIterable());
        }

        @Override
        public <R1, R2, R3> Iterative3<R1, R2, R3> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3) {
            Objects.requireNonNull(f1, "f1 is null");
            Objects.requireNonNull(f2, "f2 is null");
            Objects.requireNonNull(f3, "f3 is null");
            return this.create(this.iterative.inlineMap(f1, f2), SimpleIterative.of(this.iterableStream3()).map((Fn1 & Serializable)iter -> iter.flatMap((Function)((Object)f3)).flatMap(this::wrap)).toIterable());
        }

        @Override
        public Iterative3<T1, T2, T3> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3) {
            Objects.requireNonNull(p1, "p1 is null");
            Objects.requireNonNull(p2, "p2 is null");
            Objects.requireNonNull(p3, "p3 is null");
            return this.create(this.iterative.filter(p1, p2), SimpleIterative.of(this.iterableStream3()).map((Fn1 & Serializable)iter -> iter.filter((Predicate)p3).flatMap(this::wrap)).toIterable());
        }

        @Override
        public String toStringContent() {
            return Stream.of((Object[])new String[]{this.innerIterative().toStringContent(), IterativeHandler.typeIndicator(this.isCross()), IterativeHandler.iterableStreamToString(this.iterableStream3(), 3)}).mkString();
        }

        public String toString() {
            return IterativeHandler.iterativeHeader(3) + this.toStringContent();
        }

    }

}