(this.$WP = this.$WP || []).push(["OnmvvE", (e, t) => { "use strict"; var n, r, i, a, o, s, c, u, l, d, v, f, p, h, y, m, g, b, x, S, E, P, k, O, D, T, q, w, j, C, V, A, F, N, I, R, Q, B = (e, t) => { var r = e.executeWhen || "immediately",
                    i = n(() => ({ invalidationPredicates: t }), [...Object.keys(t)]); return u({ variables: e.variables, query: e.query, requestPolicy: "afterInvalidation" === r ? "cache-only" : e.requestPolicy, pause: "never" === r, context: i }) },
            W = (e, t, n) => e.executeQuery(l(t.query, t.variables), Object.assign({}, t.opts, { invalidationPredicates: n })),
            M = (e, t) => e.reexecuteOperation(Object.assign({}, t, { context: Object.assign({}, t.context, { requestPolicy: "network-only" }) }));

        function L(e) { return (L = "function" == typeof Symbol && "symbol" == typeof Symbol.iterator ? function(e) { return typeof e } : function(e) { return e && "function" == typeof Symbol && e.constructor === Symbol && e !== Symbol.prototype ? "symbol" : typeof e })(e) }

        function U(e) { switch (L(e)) {
                case "string":
                    return JSON.stringify(e);
                case "function":
                    return e.name ? "[function ".concat(e.name, "]") : "[function]";
                case "object":
                    if (e) { var t = function(e) { var t = e[String(F)]; return "function" == typeof t ? t : "function" == typeof e.inspect ? e.inspect : void 0 }(e); if (t) { var n = t.call(e); return "string" == typeof n ? n : U(n) } if (Array.isArray(e)) return "[" + e.map(U).join(", ") + "]"; var r = Object.keys(e).map((function(t) { return "".concat(t, ": ").concat(U(e[t])) })).join(", "); return r ? "{ " + r + " }" : "{}" } return String(e);
                default:
                    return String(e) } } var z = { Name: [], Document: ["definitions"], OperationDefinition: ["name", "variableDefinitions", "directives", "selectionSet"], VariableDefinition: ["variable", "type", "defaultValue", "directives"], Variable: ["name"], SelectionSet: ["selections"], Field: ["alias", "name", "arguments", "directives", "selectionSet"], Argument: ["name", "value"], FragmentSpread: ["name", "directives"], InlineFragment: ["typeCondition", "directives", "selectionSet"], FragmentDefinition: ["name", "variableDefinitions", "typeCondition", "directives", "selectionSet"], IntValue: [], FloatValue: [], StringValue: [], BooleanValue: [], NullValue: [], EnumValue: [], ListValue: ["values"], ObjectValue: ["fields"], ObjectField: ["name", "value"], Directive: ["name", "arguments"], NamedType: ["name"], ListType: ["type"], NonNullType: ["type"], SchemaDefinition: ["directives", "operationTypes"], OperationTypeDefinition: ["type"], ScalarTypeDefinition: ["description", "name", "directives"], ObjectTypeDefinition: ["description", "name", "interfaces", "directives", "fields"], FieldDefinition: ["description", "name", "arguments", "type", "directives"], InputValueDefinition: ["description", "name", "type", "defaultValue", "directives"], InterfaceTypeDefinition: ["description", "name", "directives", "fields"], UnionTypeDefinition: ["description", "name", "directives", "types"], EnumTypeDefinition: ["description", "name", "directives", "values"], EnumValueDefinition: ["description", "name", "directives"], InputObjectTypeDefinition: ["description", "name", "directives", "fields"], DirectiveDefinition: ["description", "name", "arguments", "locations"], SchemaExtension: ["directives", "operationTypes"], ScalarTypeExtension: ["name", "directives"], ObjectTypeExtension: ["name", "interfaces", "directives", "fields"], InterfaceTypeExtension: ["name", "directives", "fields"], UnionTypeExtension: ["name", "directives", "types"], EnumTypeExtension: ["name", "directives", "values"], InputObjectTypeExtension: ["name", "directives", "fields"] },
            $ = {};

        function H(e) { return Boolean(e && "string" == typeof e.kind) }

        function J(e, t, n) { var r = e[t]; if (r) { if (!n && "function" == typeof r) return r; var i = n ? r.leave : r.enter; if ("function" == typeof i) return i } else { var a = n ? e.leave : e.enter; if (a) { if ("function" == typeof a) return a; var o = a[t]; if ("function" == typeof o) return o } } }

        function X(e) { return function(t) { return Y([t.description, e(t)], "\n") } }

        function Y(e, t) { return e ? e.filter((function(e) { return e })).join(t || "") : "" }

        function G(e) { return e && 0 !== e.length ? "{\n" + _(Y(e, "\n")) + "\n}" : "" }

        function K(e, t, n) { return t ? e + t + (n || "") : "" }

        function _(e) { return e && "  " + e.replace(/\n/g, "\n  ") }

        function Z(e) { return -1 !== e.indexOf("\n") }

        function ee(e) { return e && e.some(Z) } var te = [],
            ne = {},
            re = (e, t) => (e.forEach((e, t) => { var { key: n } = te[t];
                ne[n] = Object.assign({}, e, { errors: void 0, error: Array.isArray(e.errors) ? new d({ graphQLErrors: e.errors }) : void 0 }) }), ne.extensions = t, e),
            ie = e => te.length ? q(e, te).then(([e, t]) => re(e, t), e => { console.error("ssrFetchExchange error from makeGraphQlCall:", e) }) : Promise.resolve(),
            ae = () => ne,
            oe = () => te,
            se = ({ query: e, variables: t, combineData: n, showFetchingAfterFirstQuery: o, invalidationPredicates: s = {}, executeWhen: c, requestPolicy: u }) => { var d = r(v),
                    [f] = B({ query: e, variables: t, executeWhen: c, requestPolicy: u }, s),
                    [p, h] = i(t),
                    [y, m] = i(f); return a(() => { h(t), m(f) }, [f.data, f.fetching, l(e, t).key]), [y, (t, r) => { var i = Object.assign({}, p, {}, t);
                    h(i), o && m(Object.assign({}, y, { fetching: !0 })); var a = y.data; return new Promise(t => g(W(d, { query: e, variables: i, opts: r }, s), T(e => { null != y.data && y.data === a ? m(Object.assign({}, e, { data: n(y.data, e.data) })) : m(e), t() }))) }] },
            ce = (e, t, n, r) => { var i; return e ? (i = (i = e.length < n ? [...e] : e.slice(0, n)).concat(t)).length < e.length && e.slice(n + r).length && t.length && (i = i.concat(e.slice(i.length))) : i = [...t], i },
            ue = ({ query: e, variables: t, combineData: n, showFetchingAfterFirstQuery: s, invalidationPredicates: c, executeWhen: u }) => { var d = r(v),
                    f = {};
                c && Object.entries(c).forEach(([e, n]) => { f[e] = n.bind(null, t) }); var [p] = B({ query: e, variables: t, executeWhen: u }, f), [h, y] = i(t), m = o(p), [b, x] = i(p); return a(() => { if (y(t), m.current && m.current.data && t && !p.fetching) { var { data: e } = m.current;
                        m.current = Object.assign({}, p, { data: n(e, p.data, t) }) } else m.current = p;
                    x(m.current) }, [p.data, p.fetching, l(e, t).key]), [b, t => { var r = Object.assign({}, h, {}, t);
                    y(r), s && (m.current = Object.assign({}, m.current, { fetching: !0 }), x(m.current)); var i = {}; return Object.entries(c || {}).forEach(([e, t]) => { i[e] = t.bind(null, r) }), new Promise(t => g(W(d, { query: e, variables: r }, i), T(e => { if (null != m.current.data) { var i = n(m.current.data, e.data, r);
                            m.current = Object.assign({}, e, { data: i }) } else m.current = e;
                        x(m.current), t() }))) }] },
            le = e => e(),
            de = ({ query: e, variables: t, pause: n, wait: r, debounceOptions: o }) => { var [s, c] = i(void 0), [l, d] = i(void 0), [v, f] = u({ query: e, variables: t, pause: !0 }), p = w(le, r, o); return a(() => { p && !n && p(f) }, [p, n, f]), a(() => { v.fetching || (l !== v.error && d(v.error), s !== v.data && c(v.data)) }, [v, s, l]), { data: s, error: l } },
            ve = (e, t, n, r) => ({ query: e, variables: t, pause: n, requestPolicy: r }),
            fe = e => u(ve(e.query, e.variables, e.pause, e.requestPolicy)),
            pe = e => { var [t, n] = u(ve(e.query, e.variables)); return e.children(Object.assign({}, t, { executeQuery: n })) },
            he = [1e3, 2e3, 4e3, 4e3, 4e3],
            ye = ({ query: e, variables: t, pollIntervals: n = he, pause: r = !1, isResultComplete: c }) => { var d = "function" == typeof t ? t(1) : t,
                    v = l(e, d).key,
                    [f, p] = i(d),
                    [h, y] = i(!1),
                    [m, g] = i(!1),
                    [b, x] = u({ query: e, variables: f, pause: r || m, requestPolicy: "network-only" }),
                    S = o(() => {}),
                    E = C(v);
                m && E === v || (S.current = x); var P = o([]),
                    k = s(() => { P.current.forEach(e => clearTimeout(e)), P.current.length = 0, g(!0) }, []); return a(() => { h && !b.fetching && (y(!1), g(!0)) }, [h, b.fetching]), a(() => { if (k(), p(d), !r) { var e = 0,
                            i = 2;
                        g(!1), y(!1), n.forEach((r, a) => { e += r, P.current.push(setTimeout(e => { "function" == typeof t ? 1 !== e && j(t(e), t(e + 1)) ? S.current() : p(t(e)) : S.current(), a === n.length - 1 && y(!0) }, e, i)), i++ }) } return k }, [v, n.join(","), r, k]), a(() => {!1 === b.fetching && E === v && c(b) && k() }, [b, k, c, E, v]), [Object.assign({}, b, { fetching: !m }), S.current] },
            me = e => { var { securityToken: t, ssrData: n } = e || {}, r = t && { headers: { "X-Requested-By": t } } || {}, i = [], a = null;
                a = new A((null == e ? void 0 : e.initialPvid) || null), i.push(f, a.exchange.bind(a), Q.exchange.bind(Q), p({ initialState: n }), R); var o = h({ url: "/data/graphql/batched", fetchOptions: r, exchanges: i }); return a && (o.pvExchange = a), o },
            ge = ({ children: e, client: t }) => c(y, { value: t }, e); return [() => { V = class { constructor() { this.resultCache = void 0, this.invalidationPredicates = void 0, this.resultCache = new Map, this.invalidationPredicates = new Map }
                    exchange({ forward: e, client: t }) { var n = ({ operationName: e }) => "mutation" !== e && "query" !== e,
                            r = e => { var { key: t, operationName: n, context: { requestPolicy: r } } = e; return "query" === n && "network-only" !== r && ("cache-only" === r || this.resultCache.has(t)) },
                            i = e => { var { operation: { key: t }, data: n } = e;
                                void 0 !== n && this.resultCache.set(t, e) },
                            a = e => { var { key: t } = e, n = e.context.invalidationPredicates;
                                n && Object.entries(n).forEach(([e, n]) => { var r = this.invalidationPredicates.get(e) || new Map;
                                    r.set(t, n), 1 === r.size && this.invalidationPredicates.set(e, r) }) },
                            o = e => { var n = new Map,
                                    r = [];
                                e.operation.query.definitions.forEach(e => { e.selectionSet && e.selectionSet.selections && r.push(...e.selectionSet.selections.filter(e => "Field" === e.kind).map(e => e.name.value)) }), r.forEach(t => { var r = this.invalidationPredicates.get(t);
                                    r && (Array.from(r.entries()).map(([t, n]) => { var r = this.resultCache.get(t); return [t, n({ variables: e.operation.variables, data: e.data }, { variables: r && r.operation.variables, data: r && r.data })] }).filter(([, e]) => "validate" !== e).forEach(([e, t]) => n.set(e, t) && r.delete(e)), 0 === r.size && this.invalidationPredicates.delete(t)) }), n.forEach((e, n) => { if (this.resultCache.has(n)) { var r = this.resultCache.get(n);
                                        this.resultCache.delete(n), r && "invalidateAndRefetch" === e && M(t, r.operation) } }) }; return s => { var c = m(s),
                                u = g(c, b(e => !n(e) && r(e)), x(e => a(e)), S(e => { var { key: n, context: { requestPolicy: r } } = e, i = this.resultCache.get(n); if ("cache-and-network" === r && M(t, e), void 0 !== i) return i; var a = { operation: e, data: void 0, error: void 0 }; return this.resultCache.set(n, a), a })),
                                l = g(c, b(e => n(e) || !r(e)), x(e => a(e)), e, x(e => { e.operation && "mutation" === e.operation.operationName ? o(e) : e.operation && "query" === e.operation.operationName && i(e) })); return E([u, l]) } } }, F = "function" == typeof Symbol ? Symbol.for("nodejs.util.inspect.custom") : void 0, N = { Name: function(e) { return e.value }, Variable: function(e) { return "$" + e.name }, Document: function(e) { return Y(e.definitions, "\n\n") + "\n" }, OperationDefinition: function(e) { var t = e.operation,
                            n = e.name,
                            r = K("(", Y(e.variableDefinitions, ", "), ")"),
                            i = Y(e.directives, " "),
                            a = e.selectionSet; return n || i || r || "query" !== t ? Y([t, Y([n, r]), i, a], " ") : a }, VariableDefinition: function(e) { var t = e.variable,
                            n = e.type,
                            r = e.defaultValue,
                            i = e.directives; return t + ": " + n + K(" = ", r) + K(" ", Y(i, " ")) }, SelectionSet: function(e) { return G(e.selections) }, Field: function(e) { var t = e.alias,
                            n = e.name,
                            r = e.arguments,
                            i = e.directives,
                            a = e.selectionSet; return Y([K("", t, ": ") + n + K("(", Y(r, ", "), ")"), Y(i, " "), a], " ") }, Argument: function(e) { return e.name + ": " + e.value }, FragmentSpread: function(e) { return "..." + e.name + K(" ", Y(e.directives, " ")) }, InlineFragment: function(e) { var t = e.typeCondition,
                            n = e.directives,
                            r = e.selectionSet; return Y(["...", K("on ", t), Y(n, " "), r], " ") }, FragmentDefinition: function(e) { var t = e.name,
                            n = e.typeCondition,
                            r = e.variableDefinitions,
                            i = e.directives,
                            a = e.selectionSet; return "fragment ".concat(t).concat(K("(", Y(r, ", "), ")"), " ") + "on ".concat(n, " ").concat(K("", Y(i, " "), " ")) + a }, IntValue: function(e) { return e.value }, FloatValue: function(e) { return e.value }, StringValue: function(e, t) { var n = e.value; return e.block ? function(e, t) { var n = e.replace(/"""/g, '\\"""'); return Z(e) || " " !== e[0] && "\t" !== e[0] ? '"""\n'.concat(t ? n : _(n), '\n"""') : '"""'.concat(n.replace(/"$/, '"\n'), '"""') }(n, "description" === t) : JSON.stringify(n) }, BooleanValue: function(e) { return e.value ? "true" : "false" }, NullValue: function() { return "null" }, EnumValue: function(e) { return e.value }, ListValue: function(e) { return "[" + Y(e.values, ", ") + "]" }, ObjectValue: function(e) { return "{" + Y(e.fields, ", ") + "}" }, ObjectField: function(e) { return e.name + ": " + e.value }, Directive: function(e) { return "@" + e.name + K("(", Y(e.arguments, ", "), ")") }, NamedType: function(e) { return e.name }, ListType: function(e) { return "[" + e.type + "]" }, NonNullType: function(e) { return e.type + "!" }, SchemaDefinition: function(e) { var t = e.directives,
                            n = e.operationTypes; return Y(["schema", Y(t, " "), G(n)], " ") }, OperationTypeDefinition: function(e) { return e.operation + ": " + e.type }, ScalarTypeDefinition: X((function(e) { return Y(["scalar", e.name, Y(e.directives, " ")], " ") })), ObjectTypeDefinition: X((function(e) { var t = e.name,
                            n = e.interfaces,
                            r = e.directives,
                            i = e.fields; return Y(["type", t, K("implements ", Y(n, " & ")), Y(r, " "), G(i)], " ") })), FieldDefinition: X((function(e) { var t = e.name,
                            n = e.arguments,
                            r = e.type,
                            i = e.directives; return t + (ee(n) ? K("(\n", _(Y(n, "\n")), "\n)") : K("(", Y(n, ", "), ")")) + ": " + r + K(" ", Y(i, " ")) })), InputValueDefinition: X((function(e) { var t = e.name,
                            n = e.type,
                            r = e.defaultValue,
                            i = e.directives; return Y([t + ": " + n, K("= ", r), Y(i, " ")], " ") })), InterfaceTypeDefinition: X((function(e) { var t = e.name,
                            n = e.directives,
                            r = e.fields; return Y(["interface", t, Y(n, " "), G(r)], " ") })), UnionTypeDefinition: X((function(e) { var t = e.name,
                            n = e.directives,
                            r = e.types; return Y(["union", t, Y(n, " "), r && 0 !== r.length ? "= " + Y(r, " | ") : ""], " ") })), EnumTypeDefinition: X((function(e) { var t = e.name,
                            n = e.directives,
                            r = e.values; return Y(["enum", t, Y(n, " "), G(r)], " ") })), EnumValueDefinition: X((function(e) { return Y([e.name, Y(e.directives, " ")], " ") })), InputObjectTypeDefinition: X((function(e) { var t = e.name,
                            n = e.directives,
                            r = e.fields; return Y(["input", t, Y(n, " "), G(r)], " ") })), DirectiveDefinition: X((function(e) { var t = e.name,
                            n = e.arguments,
                            r = e.locations; return "directive @" + t + (ee(n) ? K("(\n", _(Y(n, "\n")), "\n)") : K("(", Y(n, ", "), ")")) + " on " + Y(r, " | ") })), SchemaExtension: function(e) { var t = e.directives,
                            n = e.operationTypes; return Y(["extend schema", Y(t, " "), G(n)], " ") }, ScalarTypeExtension: function(e) { return Y(["extend scalar", e.name, Y(e.directives, " ")], " ") }, ObjectTypeExtension: function(e) { var t = e.name,
                            n = e.interfaces,
                            r = e.directives,
                            i = e.fields; return Y(["extend type", t, K("implements ", Y(n, " & ")), Y(r, " "), G(i)], " ") }, InterfaceTypeExtension: function(e) { var t = e.name,
                            n = e.directives,
                            r = e.fields; return Y(["extend interface", t, Y(n, " "), G(r)], " ") }, UnionTypeExtension: function(e) { var t = e.name,
                            n = e.directives,
                            r = e.types; return Y(["extend union", t, Y(n, " "), r && 0 !== r.length ? "= " + Y(r, " | ") : ""], " ") }, EnumTypeExtension: function(e) { var t = e.name,
                            n = e.directives,
                            r = e.values; return Y(["extend enum", t, Y(n, " "), G(r)], " ") }, InputObjectTypeExtension: function(e) { var t = e.name,
                            n = e.directives,
                            r = e.fields; return Y(["extend input", t, Y(n, " "), G(r)], " ") } }, R = (I = { create: ({ forward: e }) => t => { var n = m(t),
                            r = g(n, b(e => { var { operationName: t } = e; return "query" === t || "mutation" === t || "teardown" === t }), e => t => { var n = { talkback: null, batch: null, gotEndSignal: !1 };
                                e(e => { if ("number" == typeof e);
                                    else if (0 === e.tag) { var r = e[0];
                                        n.talkback = r } else if (1 === e.tag) { var i, a = e[0];!1 === (null == a || null == (i = a.context) ? void 0 : i.batch) ? setTimeout(() => { var e = [
                                                [a]
                                            ];
                                            e.tag = 1, t(e) }, 0) : n.batch ? n.batch.push(a) : n.gotEndSignal ? t(0) : (n.batch = [a], setTimeout(() => { var e = [n.batch];
                                            e.tag = 1, n.batch = null, t(e) }, 100)) } }); var r = [e => { 1 === e ? (n.gotEndSignal = !0, n.batch || t(0)) : n.gotEndSignal || n.talkback(e) }];
                                r.tag = 0, t(r) }, P(e => { var t = []; if (e.forEach(e => { "teardown" === e.operationName ? t = t.filter(t => t.key !== e.key) : t.push(e) }), 0 === t.length) return k([]); var r = new Set(t.map(e => e.key)),
                                    i = g(n, b(e => "teardown" === e.operationName && r.delete(e.key) && 0 === r.size)); return g(I.createBatchFetchSource(t), O(i)) })),
                            i = g(n, b(e => { var { operationName: t } = e; return "query" !== t && "mutation" !== t }), e); return E([r, i]) }, createBatchFetchSource(e) { if (e.some(e => "subscription" === e.operationName)) throw new Error("Received a subscription operation in the httpExchange. You are probably trying to create a subscription. Have you added a subscriptionExchange?"); return D(([t, n]) => { var r = new AbortController,
                                { context: i } = e[0],
                                a = "function" == typeof i.fetchOptions ? i.fetchOptions() : i.fetchOptions || {},
                                o = new Headers(a.headers);
                            o.set("content-type", "application/json"); var s = Object.assign({ body: JSON.stringify(e.map(e => { return { query: (t = e.query, function(e, t) { var n = arguments.length > 2 && void 0 !== arguments[2] ? arguments[2] : z,
                                                r = void 0,
                                                i = Array.isArray(e),
                                                a = [e],
                                                o = -1,
                                                s = [],
                                                c = void 0,
                                                u = void 0,
                                                l = void 0,
                                                d = [],
                                                v = [],
                                                f = e;
                                            do { var p = ++o === a.length,
                                                    h = p && 0 !== s.length; if (p) { if (u = 0 === v.length ? void 0 : d[d.length - 1], c = l, l = v.pop(), h) { if (i) c = c.slice();
                                                        else { for (var y = {}, m = Object.keys(c), g = 0; g < m.length; g++) { var b = m[g];
                                                                y[b] = c[b] }
                                                            c = y } for (var x = 0, S = 0; S < s.length; S++) { var E = s[S][0],
                                                                P = s[S][1];
                                                            i && (E -= x), i && null === P ? (c.splice(E, 1), x++) : c[E] = P } }
                                                    o = r.index, a = r.keys, s = r.edits, i = r.inArray, r = r.prev } else { if (u = l ? i ? o : a[o] : void 0, null == (c = l ? l[u] : f)) continue;
                                                    l && d.push(u) } var k = void 0; if (!Array.isArray(c)) { if (!H(c)) throw new Error("Invalid AST Node: " + U(c)); var O = J(t, c.kind, p); if (O) { if ((k = O.call(t, c, u, l, d, v)) === $) break; if (!1 === k) { if (!p) { d.pop(); continue } } else if (void 0 !== k && (s.push([u, k]), !p)) { if (!H(k)) { d.pop(); continue }
                                                            c = k } } }
                                                void 0 === k && h && s.push([u, c]), p ? d.pop() : (r = { inArray: i, index: o, keys: a, edits: s, prev: r }, a = (i = Array.isArray(c)) ? c : n[c.kind] || [], o = -1, s = [], l && v.push(l), l = c) } while (void 0 !== r); return 0 !== s.length && (f = s[s.length - 1][1]), f }(t, { leave: N })), variables: e.variables }; var t })), method: "POST" }, a, { headers: o, signal: r.signal }); return I.executeBatchFetch(e, s).then(e => { e.forEach(e => { void 0 !== e && t(e) }), n() }), () => { r.abort() } }) }, executeBatchFetch(e, t) { var n, { url: r } = e[0].context; return fetch(r, Object.assign({}, t, { credentials: "same-origin" })).then(e => (n = e, I.checkStatus(t.redirect, n), n.json())).then(t => t.map((t, r) => ({ operation: e[r], data: t.data, error: Array.isArray(t.errors) ? new d({ graphQLErrors: t.errors, response: n }) : void 0 }))).catch(t => "AbortError" === t.name ? Array(e.length).fill(void 0) : e.map(e => ({ operation: e, data: void 0, error: new d({ networkError: t, response: n }) }))) }, checkStatus(e = "follow", t) { var n = "manual" === e ? 400 : 300; if (t.status < 200 || t.status >= n) throw new Error(t.statusText) } }).create, A = class { constructor(e) { this.resolvers = void 0, this.currentPvid = void 0, this.currentPvPromise = void 0, this.currentPvResolver = void 0, this.promises = void 0, this.collectedResolver = void 0, this.collectedCallback = void 0, this.currentPvid = e, this.resolvers = {}, this.collectedResolver = null, this.reset() }
                    reset() { this.currentPvPromise = new Promise(e => { this.currentPvResolver = e }), this.collectedCallback = null, this.promises = [new Promise(e => { this.collectedResolver = () => { this.collectedResolver = null, e() } })] }
                    allQueriesResolvedForPageView(e) { return this.currentPvid !== e && (this.currentPvResolver(), this.currentPvid = e, this.reset()), Promise.race([Promise.all(this.promises), this.currentPvPromise]) }
                    exchange({ forward: e }) { return t => g(t, x(e => { if (this.collectedResolver && !this.collectedCallback) { var t = this.collectedResolver;
                                this.collectedCallback = requestIdleCallback(t) }
                            e.key in this.resolvers || this.promises.push(new Promise(t => { this.resolvers[e.key] = t })) }), e, x(e => { this.resolvers[e.operation.key]() })) } }, Q = new V, e("default", ge), e({ QueryRequireSsr: pe, buildUrqlClient: me, debugExchange: null, denormalizedCacheExchange: Q, embedArray: ce, fetchSsrCacheData: ae, fulfillSsrBatch: ie, fulfillSsrBatchData: re, getQueuedSsrRequests: oe, useDebouncedQuery: de, useInvalidatableQuery: B, useMutablePaginatedQuery: ue, usePaginatedQuery: se, usePollingQuery: ye, useQueryRequiredSsr: fe }) },
            [e => (n = e.useMemo, r = e.useContext, i = e.useState, a = e.useEffect, o = e.useRef, s = e.useCallback, c = e.createElement), e => (u = e.useQuery, l = e.createRequest, d = e.CombinedError, v = e.Context, f = e.dedupExchange, p = e.ssrExchange, h = e.createClient, y = e.Provider), e => (m = e.share, g = e.pipe, b = e.filter, x = e.tap, S = e.map, E = e.merge, P = e.mergeMap, k = e.fromArray, O = e.takeUntil, D = e.make, T = e.subscribe), e => q = e.default, e => w = e.useDebouncedCallback, e => j = e.default, e => C = e.default]
        ] },
    ["cDcdfi", "5X2em-", "DbN8HP", "b3xEaf", "gsKhh7", "YwNsO_", "vWxBAe"]
]);