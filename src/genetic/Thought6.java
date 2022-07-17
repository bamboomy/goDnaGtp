package genetic;
import java.util.ArrayList;
class Thought6 extends Thought{
private static ArrayList<Thought6> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 306.8961926715966;
private double fd1 = 171.17639169945537;
private Thought fo0 = null;
private Thought fo1 = null;
Thought6 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought6 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought6 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought6 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought6 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought6 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought6 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought6 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought6 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought6 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought6 instance = new Thought6 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought65.getInstance();
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    if (fb1) {
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb0 = fb1 && fb0;
        } else if (fb1) {
        fb0 = fd0 < fd1;
        Thought lo1 = Thought1.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 < fd1;
        fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd0 *= -1;
        boolean lb2 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought382.getInstance(lb0, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
    lb0 = !ab1;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    Thought lo3 = Thought205.getInstance(fd0, fd1, fd0, fd1);
    boolean lb4 = true;
    fd0 = fd1 + fd0;
    lb4 = ab1 || ab2;
    boolean lb5 = false;
    double ld6 = 466.4063983247704;
    fd0 = fd1 + ld6;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld6, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld6, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld6 = fd0 + fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought169.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    boolean lb2 = true;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    boolean lb3 = false;
    lb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb2, lb3, fb0, fb1);
}
    Output.points[4][1] += fd1;
if(fo0 != null){
      ad1 = fo0.m3(lb0, lb2, lb3, fb0);
}
    Thought lo4 = Thought234.getInstance(fo1, fo0, fo1, fo0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        boolean lb1 = false;
        }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
        ab2 = ab3 || ab4;
    double ld2 = 504.41504623262324;
    fb0 = ad3 > ad4;
    Thought lo3 = Thought9.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m1();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    double ld2 = 873.294993421612;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2);
}
    lb1 = fd0 < fd1;
        double ld3 = 187.8117814475683;
    ld2 *= -1;
    fb0 = fb1 && lb0;
    double ld4 = 238.18936243359414;
    lb1 = ld3 > ld4;
if(ao4 != null){
      ao4.m1(fd0, fd1, ld2, ld3, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
    fb0 = ld4 > fd0;
    double ld5 = 433.9278307591568;
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ld3 = ao1.m3(ao2, ao3, ao4, fo0, ld4, ld5, fd0, fd1, fb1, lb0, lb1, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
    fd1 *= -1;
    double ld0 = 313.5853465663011;
    Output.points[4][2] += ld0;
    boolean lb1 = true;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, ad1, ad2, lb1, fb0, fb1, lb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        ab1 = fd1 < fd0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        ab2 = fd1 < fd0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ab1 = fd0 < fd1;
if(ao4 != null){
          ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
        boolean lb0 = true;
        double ld1 = 660.6000934720752;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
        fd1 = ld1 - fd0;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
          fo0.m2(ld1, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
        Output.points[4][3] -= fd0;
        fd1 = ld1 - fd0;
        double ld2 = 967.4160117110425;
        Output.points[4][4] -= fd0;
        if (ab2) {
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = ad2 > ad3;
    ab1 = ab2 || ab3;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3);
}
    boolean lb0 = true;
    Thought lo1 = Thought61.getInstance(ad4, fd0, fd1, ad1);
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    double ld2 = 883.7385136314628;
    fb0 = fb1 || lb0;
    Thought lo3 = Thought21.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, ab1);
}
    Output.points[4][5] += ld2;
    ab2 = ab3 && ab4;
    fb0 = ad1 < ad2;
    boolean lb4 = false;
    fb0 = ad3 < ad4;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        boolean lb1 = false;
    Output.points[4][6] += fd0;
    fb0 = fd1 > fd0;
    Output.points[4][7] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fb1 = fd0 < fd1;
    boolean lb2 = false;
    Thought lo3 = Thought250.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
}
    Thought lo4 = Thought233.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
    fb0 = fb1 && lb0;
    Thought lo5 = Thought355.getInstance();
    Thought lo6 = Thought89.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
    boolean lb7 = false;
    Thought lo8 = Thought60.getInstance(lb0, lb1, lb2, lb7);
    fd1 *= -1;
    fb0 = fb1 && lb0;

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[4][8] += fd1;
    Thought lo0 = Thought33.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        boolean lb1 = false;
        double ld2 = 853.2047362260699;
if(fo1 != null){
          ld2 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
}
        fd0 *= -1;
        Thought lo3 = Thought151.getInstance();
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          ld2 = fo1.m3(fb1, lb1, ab1, ab2);
}
}
Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2();
}
    boolean lb0 = true;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    ad3 = ad4 - fd0;
    double ld1 = 415.2882583643498;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    Output.points[5][0] -= ad2;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m2(ab4, fb0, fb1, ab1);
}
    ab2 = ad3 > ad4;
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
        boolean lb1 = false;
        ab1 = ab2 && ab3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        double ld2 = 317.4747087045546;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    lb0 = fb0 || fb1;
    lb0 = fd0 > fd1;
    fb0 = !fb1;
    boolean lb1 = true;
    lb0 = fd0 < fd1;
    lb1 = fb0 && fb1;
    lb0 = lb1 || fb0;
    fd0 *= -1;
    fb1 = fd1 < fd0;
    Thought lo2 = Thought390.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
    fd1 = fd0 - fd1;
    Output.points[5][1] += fd0;
    Thought lo3 = Thought295.getInstance(ao2, ao3, ao4, fo0, lb0, lb1, fb0, fb1);
    lb0 = !lb1;
    double ld4 = 16.796435402873826;
    double ld5 = 267.12522210591504;
    ld5 *= -1;
    fd0 = fd1 - ld4;
    fb0 = ld5 < fd0;
    fb1 = !lb0;
    fd1 = ld4 + ld5;
    fd0 = fd1 + ld4;
    boolean lb6 = true;
if(fo1 != null){
      lb1 = fo1.m2();
}
    ld5 = fd0 + fd1;
    lb6 = !fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    ad1 = ad2 - ad3;
    double ld0 = 875.742307091131;
    double ld1 = 303.6280566373351;
    fb0 = !fb1;
    double ld2 = 304.2207881227386;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Output.points[5][2] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
    Thought lo3 = Thought282.getInstance(ao4, fo0, fo1, ao1, ld0, ld1, ld2, ad1);
    ad2 = ad3 + ad4;
    if (fb0) {
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought217.getInstance();
    ab2 = fd0 > fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    if (ab1) {
        double ld1 = 895.8078328272868;
        ab2 = fd0 > fd1;
        ab3 = !ab4;
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, ab1, ab2);
}
        Output.points[5][3] += ld1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
}
Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
    fd0 = fd1 + ad1;
    lb1 = ab1 || ab2;
    double ld2 = 548.3791905376382;
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld2;
        ad1 = ad2 - ad3;
    lb0 = ad4 < fd0;
    lb1 = !ab1;

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    Output.points[5][4] -= fd1;
    lb0 = !fb0;
    fb1 = fd0 < fd1;
    lb0 = fb0 || fb1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[5][5] -= fd0;
    lb0 = fd1 > fd0;
    fb0 = fb1 || lb0;
    Output.points[5][6] += fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = lb0 || fb0;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, lb1, fb0);
}
    fb1 = lb0 && lb1;
    Output.points[5][7] -= fd1;
    fb0 = !fb1;
    lb0 = fd0 < fd1;
    double ld2 = 355.44433446874723;
    ld2 = fd0 - fd1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought353.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    Thought lo1 = Thought177.getInstance();
    fd1 = fd0 + fd1;
    Thought lo2 = Thought241.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
        Thought lo3 = Thought218.getInstance(fo1, fo0, fo1, fo0);
    double ld4 = 470.8594384995562;
    ld4 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld4, fd0);
}
    double ld5 = 520.2438860727174;
    ab3 = fd0 < fd1;
    if (ab4) {
        Thought lo6 = Thought107.getInstance(fo0, fo1, fo0, fo1, ld4, ld5, fd0, fd1);
        Thought lo7 = Thought357.getInstance(ld4, ld5, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
}
Thought.STACK_COUNTER++;
return ld4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ad3 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 - ad4;
    fb1 = !lb0;
    fd0 = fd1 - ad1;
    Thought lo1 = Thought361.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    lb0 = !fb0;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb3 = false;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
    lb0 = lb2 || lb3;
    boolean lb4 = false;
    ad3 *= -1;
    double ld5 = 837.9358423667242;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld5, ad1, ad2, lb4, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
        ad4 = fd0 - fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = true;

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fb0 = !fb1;
if(ao1 != null){
      ao1.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    Output.points[5][8] -= fd0;
    double ld1 = 373.62108305710285;
    fd0 = fd1 - ld1;
    lb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
    fd0 = fd1 + ld1;
    boolean lb2 = true;
    fd0 = fd1 + ld1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
    double ld3 = 795.9236057657537;
    boolean lb4 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, ld3, lb2, lb4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    Output.points[6][0] += ad2;
if(ao1 != null){
      ad3 = ao1.m3();
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
        boolean lb1 = true;
        fb0 = !fb1;
        lb1 = ad2 > ad3;
        Thought lo2 = Thought136.getInstance(ao4, fo0, fo1, ao1);
        lb0 = ad4 > fd0;
        fd1 = ad1 + ad2;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
        boolean lb3 = false;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
        double ld4 = 912.757671064544;
        ad4 = fd0 + fd1;
        ld4 = ad1 - ad2;
        ad3 *= -1;
        boolean lb5 = true;
        ad4 = fd0 - fd1;
if(ao4 != null){
          ao3 = ao4.m4(ld4, ad1, ad2, ad3, lb5, lb0, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    Thought lo1 = Thought176.getInstance(ab3, ab4, fb0, fb1);
    lb0 = fd0 > fd1;
    ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    lb1 = ab1 && ab2;
    Output.points[6][1] += fd0;
    ab3 = ab4 && fb0;
    fb1 = !lb0;
    lb1 = fd1 > ad1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb1);
}
    ab1 = ab2 || ab3;
    Thought lo2 = Thought390.getInstance();
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          ad3 = fo1.m3(lb1, ab1, ab2, ab3);
}
        ab4 = ad4 > fd0;
        double ld3 = 886.9795376445409;
        Output.points[6][2] += fd0;
        fd1 *= -1;
}
Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought236.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fd1 > fd0;
    fb1 = fd1 < fd0;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    lb1 = !fb0;
    fb1 = lb1 && fb0;
    Thought lo2 = Thought8.getInstance(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
    Thought lo3 = Thought301.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
    double ld4 = 179.55404816809016;
    boolean lb5 = true;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought138.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld1 = 1.279454799995079;
    ld1 = fd0 + fd1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
    double ld3 = 111.28969510061525;
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 && ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld3);
}
        fb0 = fd0 < fd1;
        }
    double ld4 = 677.2014284030375;
if(fo1 != null){
      ld1 = fo1.m3(ld3, ld4, fd0, fd1, fb1, lb2, ab1, ab2);
}
    for(int i1=0; i1<10; i1++){
        ab3 = ld1 > ld3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
        ld4 *= -1;
        fd0 = fd1 + ld1;
        double ld5 = 251.76077934459101;
        }
if(fo0 != null){
      ld3 = fo0.m3();
}
    Thought lo6 = Thought5.getInstance(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
    fb0 = fb1 && lb2;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][3] += ad2;
if(fo0 != null){
      ad3 = fo0.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    Output.points[6][4] += ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 < ad1;
    double ld1 = 144.32274092520373;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
    fd0 *= -1;
    lb0 = !lb2;
    fb0 = fd1 > ld1;
    fb1 = lb0 && lb2;
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, lb0, lb2, fb0);
}
    if (fb1) {
        ld1 *= -1;
        double ld3 = 521.1277468884988;
        Thought lo4 = Thought94.getInstance(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo5 = Thought258.getInstance(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, lb0, lb2, fb0, fb1);
if(fo0 != null){
          lb0 = fo0.m2(lb2, fb0, fb1, lb0);
}
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = !ab2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
    double ld2 = 904.9832161205811;
    ad3 = ad4 + fd0;
    boolean lb3 = false;
    ab1 = ab2 && ab3;
    fd1 = ld2 - ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ab4 = fo1.m2(ld2, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
    Output.points[6][5] -= ad4;
    lb3 = fd0 < fd1;
    boolean lb4 = false;
    ld2 = ad1 - ad2;
    double ld5 = 136.70757246874012;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, ab1, ab2, ab3);
}
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fd1 *= -1;
    Thought lo0 = Thought43.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    Thought lo1 = Thought68.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    Output.points[6][6] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought306.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    if (fb1) {
        boolean lb3 = true;
        boolean lb4 = false;
        fd0 = fd1 - fd0;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought158.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = lb0 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
    Thought lo2 = Thought228.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
if(ao3 != null){
      ao3.m3(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought4.getInstance();
    lb0 = !fb0;
    fb1 = fd0 < fd1;
    lb0 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 || lb0;
    fd1 = ad1 - ad2;
    Thought lo4 = Thought235.getInstance(ad3, ad4, fd0, fd1);
    Output.points[6][7] -= ad1;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    Output.points[6][8] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    fd0 = fd1 + fd0;
    double ld0 = 214.76965887689727;
    fd0 *= -1;
if(ao1 != null){
      ao1.m2(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 && ab2;
        boolean lb1 = false;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
        Output.points[7][0] += ld0;
        fb1 = !lb1;
        Thought lo2 = Thought110.getInstance();
        ab1 = ab2 || ab3;
        ab4 = fd0 < fd1;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
        double ld3 = 562.1079778278811;
        ld0 = fd0 + fd1;
        ab2 = !ab3;
if(ao1 != null){
          fo1 = ao1.m4(ab4, fb0, fb1, lb1);
}
        ab1 = ab2 && ab3;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
        ab4 = !fb0;
        Output.points[7][1] += ld3;
}
Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    ab1 = ab2 && ab3;
if(ao3 != null){
      ab4 = ao3.m2(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought6.getInstance();
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ad1 = ao3.m3(fb0, fb1, ab1, ab2);
}
    double ld1 = 128.2342245587078;
    ab3 = ab4 || fb0;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought247.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    double ld1 = 150.70429522121051;
    double ld2 = 712.2185594673635;
    boolean lb3 = true;
    Output.points[7][2] += ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
}
    fd0 *= -1;
    double ld4 = 211.89660156003967;
    fd0 = fd1 - ld1;
    ld2 = ld4 - fd0;
    fd1 *= -1;
if(fo0 != null){
          fo0.m1();
}
    fb1 = lb3 || fb0;
    fb1 = ld1 < ld2;
    boolean lb5 = true;
    Output.points[7][3] -= ld4;
    fd0 = fd1 + ld1;
    lb3 = !lb5;
    Thought lo6 = Thought169.getInstance(fo1, fo0, fo1, fo0, ld2, ld4, fd0, fd1, fb0, fb1, lb3, lb5);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[7][4] += fd1;
    boolean lb0 = false;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    Output.points[7][5] += fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = lb1 && lb2;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought119.getInstance(lb0, lb1, lb2, fb0);
    fb1 = lb0 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb2 = fd1 > fd0;
    lb4 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb5 = true;
    boolean lb6 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      lb5 = fo1.m2(fd1, fd0, fd1, fd0, lb6, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 452.9526876326025;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought116.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 + fd0;
if(fo0 != null){
          fb1 = fo0.m2(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
