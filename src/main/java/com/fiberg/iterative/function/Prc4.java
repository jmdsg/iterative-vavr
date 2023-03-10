package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import io.vavr.CheckedFunction4;
import io.vavr.Tuple;
import io.vavr.Tuple4;

import java.util.Objects;

@FunctionalInterface
public interface Prc4<T1, T2, T3, T4> extends CheckedFunction4<T1, T2, T3, T4, Boolean> {

    default public Boolean apply(T1 t1, T2 t2, T3 t3, T4 t4) throws Throwable {
        return this.test(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> narrow(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        @SuppressWarnings("unchecked")
        final Prc4<T1, T2, T3, T4> prc = (Prc4<T1, T2, T3, T4>) p;
        return prc;
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> value(Boolean b) {
        return (t1, t2, t3, t4) -> b;
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> of(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Prc4.narrow(p);
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> of1(Prc1<? super T1> f) {
        return Prc4.<T1, T2, T3, T4>narrow(f.ignoring3Rt());
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> of2(Prc1<? super T2> f) {
        return Prc4.<T1, T2, T3, T4>narrow(f.ignoring2Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> of3(Prc1<? super T3> f) {
        return Prc4.<T1, T2, T3, T4>narrow(f.ignoring1Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> of4(Prc1<? super T4> f) {
        return Prc4.<T1, T2, T3, T4>narrow(f.ignoring3Lt());
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> fromFunction(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, Boolean> f) {
        return f::apply;
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> fromSupplier(Spc<? extends Boolean> s) {
        return Prc4.fromFunction(Spc.<Boolean>narrow(s).toFunction().ignoring4());
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> negate(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Prc4.<T1, T2, T3, T4>narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> and(Prc4<? super T1, ? super T2, ? super T3, ? super T4> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> and(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc4.narrow(p) : Prc4.<T1, T2, T3, T4>narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> or(Prc4<? super T1, ? super T2, ? super T3, ? super T4> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> or(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, Prc0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Prc4.narrow(p) : Prc4.<T1, T2, T3, T4>narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2, T3, T4> Prc1<Tuple4<T1, T2, T3, T4>> tuple(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Prc4.<T1, T2, T3, T4>of(p).tupled();
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> detuple(Prc1<? super Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> p) {
        return (t1, t2, t3, t4) -> p.test(Tuple.of(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> check(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return Pr4.<T1, T2, T3, T4>narrow(p).checked();
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> ignore(Prc0 p) {
        return p.ignoring4();
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> ignore3Rt(Prc1<? super T1> p) {
        return Prc1.<T1>narrow(p).ignoring3Rt();
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> ignore3Lt(Prc1<? super T4> p) {
        return Prc1.<T4>narrow(p).ignoring3Lt();
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> ignore2Rt(Prc2<? super T1, ? super T2> p) {
        return Prc2.<T1, T2>narrow(p).ignoring2Rt();
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> ignore2Lt(Prc2<? super T3, ? super T4> p) {
        return Prc2.<T3, T4>narrow(p).ignoring2Lt();
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> ignore1Rt(Prc3<? super T1, ? super T2, ? super T3> p) {
        return Prc3.<T1, T2, T3>narrow(p).ignoring1Rt();
    }

    public static <T1, T2, T3, T4> Prc4<T1, T2, T3, T4> ignore1Lt(Prc3<? super T2, ? super T3, ? super T4> p) {
        return Prc3.<T2, T3, T4>narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5> Prc4<T1, T2, T3, T4> passRt(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T5 t5) {
        return Prc4.narrow(p.testRt(t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Prc4<T1, T2, T3, T4> passRt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T5 t5, T6 t6) {
        return Prc4.narrow(p.testRt(t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc4<T1, T2, T3, T4> passRt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T5 t5, T6 t6, T7 t7) {
        return Prc4.narrow(p.testRt(t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc4<T1, T2, T3, T4> passRt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Prc4.narrow(p.testRt(t5, t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5> Prc4<T2, T3, T4, T5> passLt(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T1 t1) {
        return Prc4.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6> Prc4<T3, T4, T5, T6> passLt(Prc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1, T2 t2) {
        return Prc4.narrow(p.testLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Prc4<T4, T5, T6, T7> passLt(Prc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2, T3 t3) {
        return Prc4.narrow(p.testLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Prc4<T5, T6, T7, T8> passLt(Prc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Prc4.narrow(p.testLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4> Prc4<T4, T3, T2, T1> invert(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return Prc4.<T1, T2, T3, T4>narrow(p).inverted();
    }

    public boolean test(T1 t1, T2 t2, T3 t3, T4 t4) throws Throwable;

    default public Prc3<T2, T3, T4> testLt(T1 t1) {
        return (t2, t3, t4) -> this.test(t1, t2, t3, t4);
    }

    default public Prc2<T3, T4> testLt(T1 t1, T2 t2) {
        return (t3, t4) -> this.test(t1, t2, t3, t4);
    }

    default public Prc1<T4> testLt(T1 t1, T2 t2, T3 t3) {
        return t4 -> this.test(t1, t2, t3, t4);
    }

    default public Prc3<T1, T2, T3> testRt(T4 t4) {
        return (t1, t2, t3) -> this.test(t1, t2, t3, t4);
    }

    default public Prc2<T1, T2> testRt(T3 t3, T4 t4) {
        return (t1, t2) -> this.test(t1, t2, t3, t4);
    }

    default public Prc1<T1> testRt(T2 t2, T3 t3, T4 t4) {
        return t1 -> this.test(t1, t2, t3, t4);
    }

    default public Fnc4<T1, T2, T3, T4, Boolean> toFunction() {
        return this::test;
    }

    default public Csc4<T1, T2, T3, T4> toConsumer() {
        return this::test;
    }

    default public Prc0 toPredicate(T1 t1, T2 t2, T3 t3, T4 t4) {
        return () -> this.test(t1, t2, t3, t4);
    }

    default public Spc<Boolean> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toPredicate(t1, t2, t3, t4).toSupplier();
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3, T4 t4) {
        return this.toPredicate(t1, t2, t3, t4).toRunnable();
    }

    default public Prc4<T1, T2, T3, T4> afterRunOn(Rnc onSuccess, Rnc onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> {
            boolean result = this.test(t1, t2, t3, t4);
            (result ? onSuccess : onFailure).run();
            return result;
        };
    }

    default public Prc4<T1, T2, T3, T4> afterTestOn(Prc1<Boolean> onSuccess, Prc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Prc4<T1, T2, T3, T4> afterTestOn(Prc0 onSuccess, Prc0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc4<T1, T2, T3, T4> afterApplyOn(Fnc1<Boolean, Boolean> onSuccess, Fnc1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Prc4.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fnc4<T1, T2, T3, T4, R> afterApplyOnTo(Fnc1<Boolean, ? extends R> onSuccess, Fnc1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> {
            boolean result = this.test(t1, t2, t3, t4);
            return (result ? onSuccess : onFailure).apply(result);
        };
    }

    default public Prc4<T1, T2, T3, T4> afterApplyOn(Fnc0<Boolean> onSuccess, Fnc0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fnc4<T1, T2, T3, T4, R> afterApplyOnTo(Fnc0<? extends R> onSuccess, Fnc0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Prc4<T1, T2, T3, T4> afterGetOn(Spc<Boolean> onSuccess, Spc<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Csc4<T1, T2, T3, T4> afterAcceptOnTo(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Prc4<T1, T2, T3, T4> afterAcceptOn(Csc1<Boolean> onSuccess, Csc1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Prc4<T1, T2, T3, T4> afterRun(Rnc r) {
        return this.afterRunOn(r, r);
    }

    default public Prc4<T1, T2, T3, T4> afterTest(Prc1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Prc4<T1, T2, T3, T4> afterTest(Prc0 p) {
        return this.afterTestOn(p, p);
    }

    default public Prc4<T1, T2, T3, T4> afterApply(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc4<T1, T2, T3, T4, R> afterApplyTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc4<T1, T2, T3, T4> afterApply(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fnc4<T1, T2, T3, T4, R> afterApplyTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Prc4<T1, T2, T3, T4> afterGet(Spc<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Csc4<T1, T2, T3, T4> afterAcceptTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Prc4<T1, T2, T3, T4> afterAccept(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr4<T1, T2, T3, T4> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr4.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn4<T1, T2, T3, T4, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (t1, t2, t3, t4) -> wrap.apply(this.toSupplier(t1, t2, t3, t4));
    }

    default public Prc4<T1, T2, T3, T4> afterRunOnSuccess(Rnc r) {
        return this.afterRunOn(r, Rnc.empty());
    }

    default public Prc4<T1, T2, T3, T4> afterTestOnSuccess(Prc1<Boolean> p) {
        return this.afterTestOn(p, Prc1.empty());
    }

    default public Prc4<T1, T2, T3, T4> afterTestOnSuccess(Prc0 p) {
        return this.afterTestOn(p, Prc0.empty());
    }

    default public Prc4<T1, T2, T3, T4> afterApplyOnSuccess(Fnc1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fnc1.empty());
    }

    default public <R> Fnc4<T1, T2, T3, T4, R> afterApplyOnSuccessTo(Fnc1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fnc1.empty());
    }

    default public Prc4<T1, T2, T3, T4> afterApplyOnSuccess(Fnc0<Boolean> f) {
        return this.afterApplyOn(f, Fnc0.empty());
    }

    default public <R> Fnc4<T1, T2, T3, T4, R> afterApplyOnSuccessTo(Fnc0<? extends R> f) {
        return this.afterApplyOnTo(f, Fnc0.empty());
    }

    default public Prc4<T1, T2, T3, T4> afterGetOnSuccess(Spc<Boolean> s) {
        return this.afterGetOn(s, Spc.empty());
    }

    default public Csc4<T1, T2, T3, T4> afterAcceptOnSuccessTo(Csc1<Boolean> c) {
        return this.afterAcceptOnTo(c, Csc1.empty());
    }

    default public Prc4<T1, T2, T3, T4> afterAcceptOnSuccess(Csc1<Boolean> c) {
        return this.afterAcceptOn(c, Csc1.empty());
    }

    default public Prc4<T1, T2, T3, T4> afterRunOnFailure(Rnc r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Prc4<T1, T2, T3, T4> afterTestOnFailure(Prc1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc4<T1, T2, T3, T4> afterTestOnFailure(Prc0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Prc4<T1, T2, T3, T4> afterApplyOnFailure(Fnc1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc4<T1, T2, T3, T4, R> afterApplyOnFailureTo(Fnc1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc4<T1, T2, T3, T4> afterApplyOnFailure(Fnc0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fnc4<T1, T2, T3, T4, R> afterApplyOnFailureTo(Fnc0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Prc4<T1, T2, T3, T4> afterGetOnFailure(Spc<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Csc4<T1, T2, T3, T4> afterAcceptOnFailureTo(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Prc4<T1, T2, T3, T4> afterAcceptOnFailure(Csc1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Prc4<T1, T2, T3, T4> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2, t3, t4) -> {
            r.run();
            return this.test(t1, t2, t3, t4);
        };
    }

    default public <B1, B2, B3, B4> Prc4<B1, B2, B3, B4> beforeApply(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        return this.beforeApply4(f);
    }

    default public <B1> Prc1<B1> beforeApply1(Fnc1<? super B1, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().test(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Prc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Prc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Prc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Prc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Prc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Prc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Prc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Prc4<T1, T2, T3, T4> beforeTestOnSuccess(Prc0 p, Prc4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> p.test() ? this.test(t1, t2, t3, t4) : onFailure.test(t1, t2, t3, t4);
    }

    default public Prc4<T1, T2, T3, T4> beforeTestOnSuccess(Prc0 p, Spc<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Prc4.fromSupplier(onFailure));
    }

    default public Prc4<T1, T2, T3, T4> beforeTestOnSuccess(Prc0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Prc4.value(onFailure));
    }

    default public Prc4<T1, T2, T3, T4> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Prc4.empty());
    }

    default public Prc4<T1, T2, T3, T4> beforeTestOnFailure(Prc0 p, Prc4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Prc4<T1, T2, T3, T4> beforeTestOnFailure(Prc0 p, Spc<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Prc4.fromSupplier(onSuccess));
    }

    default public Prc4<T1, T2, T3, T4> beforeTestOnFailure(Prc0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Prc4.value(onSuccess));
    }

    default public Prc4<T1, T2, T3, T4> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Prc4.empty());
    }

    default public Prc0 beforeGet(Spc<? extends Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().test(Tuple.narrow((s.get())));
    }

    default public Prc4<T4, T3, T2, T1> inverted() {
        return (t4, t3, t2, t1) -> this.test(t1, t2, t3, t4);
    }

    default public <S> Prc4<T1, T2, T3, T4> afterPassingThroughApplyOn(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onSuccess, Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> {
            boolean result = this.test(t1, t2, t3, t4);
            Fnc4.narrow(result ? onSuccess : onFailure).apply(t1, t2, t3, t4);
            return result;
        };
    }

    default public <S> Fnc4<T1, T2, T3, T4, S> afterPassingThroughApplyOnTo(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onSuccess, Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> Fnc4.narrow(this.test(t1, t2, t3, t4) ? onSuccess : onFailure).apply(t1, t2, t3, t4);
    }

    default public Prc4<T1, T2, T3, T4> afterPassingThroughAcceptOn(Csc4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess, Csc4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> {
            boolean result = this.test(t1, t2, t3, t4);
            Csc4.narrow(result ? onSuccess : onFailure).accept(t1, t2, t3, t4);
            return result;
        };
    }

    default public Csc4<T1, T2, T3, T4> afterPassingThroughAcceptOnTo(Csc4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess, Csc4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> Csc4.narrow(this.test(t1, t2, t3, t4) ? onSuccess : onFailure).accept(t1, t2, t3, t4);
    }

    default public Prc4<T1, T2, T3, T4> afterPassingThroughTestOn(Prc4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess, Prc4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> Prc4.narrow(this.test(t1, t2, t3, t4) ? onSuccess : onFailure).test(t1, t2, t3, t4);
    }

    default public <S> Prc4<T1, T2, T3, T4> afterPassingThroughApply(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fnc4<T1, T2, T3, T4, S> afterPassingThroughApplyTo(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Prc4<T1, T2, T3, T4> afterPassingThroughAccept(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Csc4<T1, T2, T3, T4> afterPassingThroughAcceptTo(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Prc4<T1, T2, T3, T4> afterPassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Prc4<T1, T2, T3, T4> afterSuccessPassingThroughApply(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fnc4.empty());
    }

    default public <S> Fnc4<T1, T2, T3, T4, S> afterSuccessPassingThroughApplyTo(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fnc4.empty());
    }

    default public Prc4<T1, T2, T3, T4> afterSuccessPassingThroughAccept(Csc4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Csc4.empty());
    }

    default public Csc4<T1, T2, T3, T4> afterSuccessPassingThroughAcceptTo(Csc4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Csc4.empty());
    }

    default public Prc4<T1, T2, T3, T4> afterSuccessPassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Prc4.empty());
    }

    default public <S> Prc4<T1, T2, T3, T4> afterFailurePassingThroughApply(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fnc4<T1, T2, T3, T4, S> afterFailurePassingThroughApplyTo(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Prc4<T1, T2, T3, T4> afterFailurePassingThroughAccept(Csc4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Csc4<T1, T2, T3, T4> afterFailurePassingThroughAcceptTo(Csc4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Prc4<T1, T2, T3, T4> afterFailurePassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Prc4<T1, T2, T3, T4> beforePassingThroughApply(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2, t3, t4) -> {
            f.apply(t1, t2, t3, t4);
            return this.test(t1, t2, t3, t4);
        };
    }

    default public Prc4<T1, T2, T3, T4> beforePassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2, t3, t4) -> {
            p.test(t1, t2, t3, t4);
            return this.test(t1, t2, t3, t4);
        };
    }

    default public Prc4<T1, T2, T3, T4> beforePassingThroughAccept(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4) -> {
            c.accept(t1, t2, t3, t4);
            return this.test(t1, t2, t3, t4);
        };
    }

    default public Prc4<T1, T2, T3, T4> beforeSuccessPassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, Prc4<? super T1, ? super T2, ? super T3, ? super T4> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2, t3, t4) -> p.test(t1, t2, t3, t4) ? this.test(t1, t2, t3, t4) : onFailure.test(t1, t2, t3, t4);
    }

    default public Prc4<T1, T2, T3, T4> beforeSuccessPassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, Spc<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc4.fromSupplier(onFailure));
    }

    default public Prc4<T1, T2, T3, T4> beforeSuccessPassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Prc4.value(onFailure));
    }

    default public Prc4<T1, T2, T3, T4> beforeSuccessPassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return this.beforeSuccessPassingThroughTest(p, Prc4.empty());
    }

    default public Prc4<T1, T2, T3, T4> beforeFailurePassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, Prc4<? super T1, ? super T2, ? super T3, ? super T4> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Prc4<T1, T2, T3, T4> beforeFailurePassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, Spc<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc4.fromSupplier(onSuccess));
    }

    default public Prc4<T1, T2, T3, T4> beforeFailurePassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Prc4.value(onSuccess));
    }

    default public Prc4<T1, T2, T3, T4> beforeFailurePassingThroughTest(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return this.beforeFailurePassingThroughTest(p, Prc4.empty());
    }

    default public Prc1<Tuple4<T1, T2, T3, T4>> tupled() {
        return tuple -> this.test(tuple._1(), tuple._2(), tuple._3(), tuple._4());
    }

    default public Pr4<T1, T2, T3, T4> unchecked() {
        return (t1, t2, t3, t4) -> {
            try {
                return this.test(t1, t2, t3, t4);
            }
            catch (Throwable t) {
                return (Boolean) SneakyThrow.sneakyThrow(t);
            }
        };
    }

    default public Fnc1<T1, Fnc1<T2, Fnc1<T3, Prc1<T4>>>> currying() {
        return t1 -> t2 -> t3 -> t4 -> this.test(t1, t2, t3, t4);
    }

    default public Prc4<T1, T2, T3, T4> negated() {
        return (t1, t2, t3, t4) -> !this.test(t1, t2, t3, t4);
    }

    default public Prc4<T1, T2, T3, T4> and(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4) && p.test(t1, t2, t3, t4);
    }

    default public Prc4<T1, T2, T3, T4> or(Prc4<? super T1, ? super T2, ? super T3, ? super T4> p) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4) || p.test(t1, t2, t3, t4);
    }

    default public Prc4<T1, T2, T3, T4> and(Prc0 p) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4) && p.test();
    }

    default public Prc4<T1, T2, T3, T4> or(Prc0 p) {
        return (t1, t2, t3, t4) -> this.test(t1, t2, t3, t4) || p.test();
    }

    default public <I1> Prc5<I1, T1, T2, T3, T4> ignoring1Lt() {
        return (i1, t1, t2, t3, t4) -> this.test(t1, t2, t3, t4);
    }

    default public <I1> Prc5<T1, T2, T3, T4, I1> ignoring1Rt() {
        return (t1, t2, t3, t4, i1) -> this.test(t1, t2, t3, t4);
    }

    default public <I1, I2> Prc6<I1, I2, T1, T2, T3, T4> ignoring2Lt() {
        return (i1, i2, t1, t2, t3, t4) -> this.test(t1, t2, t3, t4);
    }

    default public <I1, I2> Prc6<T1, T2, T3, T4, I1, I2> ignoring2Rt() {
        return (t1, t2, t3, t4, i1, i2) -> this.test(t1, t2, t3, t4);
    }

    default public <I1, I2, I3> Prc7<I1, I2, I3, T1, T2, T3, T4> ignoring3Lt() {
        return (i1, i2, i3, t1, t2, t3, t4) -> this.test(t1, t2, t3, t4);
    }

    default public <I1, I2, I3> Prc7<T1, T2, T3, T4, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, t3, t4, i1, i2, i3) -> this.test(t1, t2, t3, t4);
    }

    default public <I1, I2, I3, I4> Prc8<I1, I2, I3, I4, T1, T2, T3, T4> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2, t3, t4) -> this.test(t1, t2, t3, t4);
    }

    default public <I1, I2, I3, I4> Prc8<T1, T2, T3, T4, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, t2, t3, t4, i1, i2, i3, i4) -> this.test(t1, t2, t3, t4);
    }

    default public Prc4<T1, T2, T3, T4> memoized() {
        return CheckedFunction4.super.memoized()::apply;
    }

    default public Pr4<T1, T2, T3, T4> recover(Fn1<? super Throwable, ? extends Pr4<? super T1, ? super T2, ? super T3, ? super T4>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (t1, t2, t3, t4) -> {
            try {
                return this.test(t1, t2, t3, t4);
            }
            catch (Throwable throwable) {
                Pr4<? super T1, ? super T2, ? super T3, ? super T4> pred = recover.apply(throwable);
                Objects.requireNonNull(pred, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                return pred.test(t1, t2, t3, t4);
            }
        };
    }

}
