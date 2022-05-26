package genetic;
import java.util.ArrayList;
class Thought3 extends Thought{
private static ArrayList<Thought3> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 884.1059609538179;
private double fd1 = 975.5775843974625;
private Thought fo0 = null;
private Thought fo1 = null;
Thought3 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought3 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought3 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought3 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought3 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought3 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought3 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought3 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought3 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought3 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought3 instance = new Thought3 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought10.getInstance(fb1, fb0, fb1, fb0);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
    fd0 = fd1 + fd0;
    Output.points[0][0] -= fd1;
    fb0 = fb1 || lb1;
    fd0 *= -1;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 171.6553787806842;
    fd0 = fd1 + ld2;
    fb1 = fd0 < fd1;
    lb1 = fb0 || fb1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    fd0 *= -1;

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
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        ab1 = ab2 && ab3;
        boolean lb0 = false;
        ab3 = ab4 || fb0;
        Output.points[0][1] -= fd0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        lb0 = fd1 > fd0;
        fd1 *= -1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    boolean lb2 = true;
    lb2 = fb0 || fb1;

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
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    Thought lo1 = Thought19.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    if (ab4) {
        boolean lb2 = false;
        ab4 = ad3 < ad4;
        Output.points[0][2] += fd0;
        double ld3 = 99.12210452131325;
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3);
}
        ad4 *= -1;
        Thought lo4 = Thought4.getInstance();
        fd0 = fd1 + ld3;
        Output.points[0][3] += ad1;
        fb1 = ad2 < ad3;
        lb2 = !lb0;
        ad4 *= -1;
        fd0 = fd1 + ld3;
        ab1 = ad1 < ad2;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb2, lb0, ab1);
}
if(fo1 != null){
          ab2 = fo1.m2(ad4, fd0, fd1, ld3);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        ab3 = !ab4;
        for(int i0=0; i0<10; i0++){
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought15.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    double ld2 = 232.81704004469333;
    fd0 = fd1 - ld2;
    fd0 = fd1 - ld2;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb1);
}
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld4 = 870.0454000863714;
    Output.points[0][4] -= ld2;
    boolean lb5 = false;
    lb3 = ld4 > fd0;
    lb5 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb1, lb3, lb5);
}
    fd1 *= -1;
    fb0 = fb1 && lb1;
    ld2 = ld4 + fd0;
    Thought lo6 = Thought11.getInstance(lb3, lb5, fb0, fb1);
    lb1 = fd1 > ld2;
if(ao4 != null){
      ld4 = ao4.m3(fd0, fd1, ld2, ld4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 - ld2;
        lb3 = !lb5;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ld4, fd0, fd1, ld2, fb0, fb1, lb1, lb3);
}
    ld4 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld2, ld4, lb5, fb0, fb1, lb1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        fb1 = fd0 < fd1;
    Output.points[0][5] -= ad1;
    ad2 *= -1;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
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
    Output.points[0][6] -= fd1;
    fd0 *= -1;
    ab1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m1();
}
    fd0 *= -1;
    boolean lb0 = false;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    lb0 = lb1 || ab1;
    fd0 *= -1;
    Thought lo2 = Thought17.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, lb1, ab1);
}
    ab2 = ab3 || ab4;
if(ao3 != null){
      fb0 = ao3.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ad1;
    if (fb1) {
if(ao1 != null){
          ad2 = ao1.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
        Output.points[0][7] += ad1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
        } else if (ab2) {
        for(int i0=0; i0<10; i0++){
            ab3 = fd1 < ad1;
            ad2 *= -1;
if(ao3 != null){
              ao2 = ao3.m4();
}
            ab4 = ad3 > ad4;
if(ao4 != null){
              fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb0 = fd1 < fd0;
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        Output.points[0][8] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
        fd1 = fd0 - fd1;
        boolean lb2 = true;
        double ld3 = 690.1131640584083;
if(fo0 != null){
          lb2 = fo0.m2(ld3, fd0, fd1, ld3);
}
        fd0 = fd1 + ld3;
        Thought lo4 = Thought12.getInstance(fo1, fo0, fo1, fo0);
        boolean lb5 = true;
        Output.points[1][0] += fd0;
        fd1 *= -1;
        Thought lo6 = Thought7.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, lb5, lb0, lb1, fb0);
        fb1 = lb2 || lb5;
        }
    fb0 = fd1 > fd0;
    double ld7 = 273.2945585707896;
    Thought lo8 = Thought5.getInstance(fd0, fd1, ld7, fd0, fb1, lb0, lb1, fb0);
    fb1 = lb0 && lb1;
    fb0 = fd1 < ld7;
    fd0 *= -1;
    fd1 = ld7 - fd0;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought3.getInstance(ab2, ab3, ab4, fb0);
    double ld1 = 262.3450204443009;
    fb1 = ld1 < fd0;
if(fo1 != null){
      ab1 = fo1.m2(fd1, ld1, fd0, fd1);
}
    boolean lb2 = false;
    ld1 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ab1;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    boolean lb0 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + ad1;
    double ld1 = 394.7451646449786;
    double ld2 = 796.5188760067989;
    Thought lo3 = Thought7.getInstance(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    Thought lo4 = Thought8.getInstance(lb0, fb0, fb1, lb0);
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(ld1, ld2, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb0;
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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    double ld0 = 931.0147052402015;
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought1.getInstance(ab1, ab2, ab3, ab4);
    fb0 = ad4 < fd0;
    fb1 = !ab1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ad1, ad2);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        ad3 *= -1;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[1][1] += fd1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
if(ao3 != null){
      lb1 = ao3.m2();
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      fd1 = ao4.m3(fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
    fd1 *= -1;
    double ld2 = 987.5838798163494;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    Thought lo1 = Thought4.getInstance(ao1, ao2, ao3, ao4);
    double ld2 = 354.8048715753842;
    if (lb0) {
if(fo0 != null){
          ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
        boolean lb3 = false;
        fd1 = ld2 + ad1;
        ad2 = ad3 + ad4;
        fb0 = fb1 && lb3;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld2, ad1, lb0, fb0, fb1, lb3);
}
        lb0 = fb0 || fb1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
}
Thought.STACK_COUNTER++;
return lb0;
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
    boolean lb0 = false;
    ab1 = ab2 || ab3;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    double ld1 = 647.7028045808273;
    double ld2 = 270.04375978274453;
    Thought lo3 = Thought9.getInstance(ab1, ab2, ab3, ab4);
if(ao1 != null){
      fb0 = ao1.m2(ld2, fd0, fd1, ld1);
}
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = fd0 > fd1;
    ld1 *= -1;
    lb0 = ld2 > fd0;
    fd1 *= -1;
    ld1 = ld2 + fd0;
    ab1 = !ab2;
    ab3 = fd1 > ld1;
    ld2 = fd0 + fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld1, ld2, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld1 *= -1;
    boolean lb4 = true;
    ab4 = fb0 || fb1;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld1);
}
    lb4 = ld2 > fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;

Thought.STACK_COUNTER++;
return lb4;
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
    if (ab1) {
if(ao1 != null){
          ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
        ad2 = ad3 - ad4;
        ab1 = fd0 < fd1;
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 + ad1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ab2 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        ab1 = fd1 < ad1;
if(ao4 != null){
          ao3 = ao4.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = ad1 - ad2;
        fb1 = !ab1;
        ab2 = ab3 && ab4;
if(fo0 != null){
          ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
if(ao4 != null){
          fb0 = ao4.m2();
}
        fb1 = ad2 > ad3;
        boolean lb0 = false;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
}
        ab4 = ad4 > fd0;
        fb0 = fb1 || lb0;
        fd1 = ad1 + ad2;
        ab1 = ab2 && ab3;
        double ld1 = 370.5627252704426;
if(fo0 != null){
          ao4 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fd1 = ld1 + ad1;
        ab1 = ad2 < ad3;
        ab2 = ab3 || ab4;
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = false;
    fd0 *= -1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
        double ld1 = 455.9199342035371;
    Thought lo2 = Thought1.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    ld1 = fd0 + fd1;
    fb0 = fb1 || lb0;
    fb0 = !fb1;
    boolean lb3 = true;
    Output.points[1][2] -= ld1;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb3, lb4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    double ld5 = 629.2312139680079;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld5, fd0, fd1, lb0, lb3, lb4, fb0);
}
    fb1 = lb0 && lb3;
    ld1 = ld5 + fd0;

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
    Thought lo0 = Thought19.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    double ld1 = 265.9584155278056;
    ld1 = fd0 - fd1;
    ld1 *= -1;
    fb0 = fb1 && ab1;
        ab2 = ab3 && ab4;
    fd0 *= -1;
    fb0 = fb1 || ab1;
    fd1 = ld1 + fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
    Output.points[1][3] += ld1;
    Output.points[1][4] += fd0;
    fd1 = ld1 - fd0;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ld1 = fd0 - fd1;
    Output.points[1][5] -= ld1;
    fd0 = fd1 + ld1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
        fb1 = fd1 < ad1;
    Thought lo0 = Thought14.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[1][6] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1();
}
    Thought lo1 = Thought2.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Output.points[1][7] += fd0;
    Thought lo2 = Thought14.getInstance(fd1, ad1, ad2, ad3);
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld3 = 519.1041910459239;
    fb1 = fb0 && fb1;
    boolean lb4 = false;
    lb4 = fb0 || fb1;

Thought.STACK_COUNTER++;
return ad4;
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
    if (ab1) {
        ab2 = ab3 || ab4;
        if (fb0) {
            ad2 = ad3 - ad4;
            Thought lo0 = Thought15.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
            for(int i0=0; i0<10; i0++){
if(fo1 != null){
                  fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
                ab2 = ad1 < ad2;
                ad3 = ad4 - fd0;
                fd1 *= -1;
                Thought lo1 = Thought14.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
                Thought lo2 = Thought7.getInstance();
                ab3 = fd0 < fd1;
                Thought lo3 = Thought14.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
                boolean lb4 = true;
if(fo1 != null){
                  fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
                Thought lo5 = Thought19.getInstance(ad1, ad2, ad3, ad4);
                fb0 = fd0 < fd1;
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
                boolean lb6 = true;
                double ld7 = 750.3477344895699;
if(fo0 != null){
                  ld7 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb4, lb6);
}
                ab1 = fd0 < fd1;
                ld7 = ad1 - ad2;
}}}
Thought.STACK_COUNTER++;
return ad4;
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
    boolean lb0 = true;
    fd0 *= -1;
    fd1 *= -1;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
if(ao2 != null){
      lb0 = ao2.m2(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    lb1 = fd1 < fd0;
if(ao2 != null){
      ao2.m1();
}
    double ld2 = 327.02602561506586;
        fb0 = fb1 || lb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb0);
}
    boolean lb3 = false;
    fd0 = fd1 - ld2;

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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
    double ld1 = 168.75318613440933;
    double ld2 = 236.7982050887848;
    ld1 *= -1;
    double ld3 = 992.7753987375916;
    Output.points[1][8] -= ld2;
if(ao3 != null){
      fb1 = ao3.m2(ld3, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ld1 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb4 = false;
if(ao4 != null){
          lb4 = ao4.m2(fo0, fo1, ao1, ao2, ld2, ld3, ad1, ad2, lb0, fb0, fb1, lb4);
}
        }
    fb0 = ad3 < ad4;
    fb1 = lb0 && fb0;
    fd0 = fd1 - ld1;
    ld2 = ld3 + ad1;
    fb1 = lb0 || fb0;
    ad2 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld1, ld2, ld3, ad1);
}
    fb0 = fb1 || lb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
    Thought lo5 = Thought6.getInstance(fb1, lb0, fb0, fb1);

Thought.STACK_COUNTER++;
return ad2;
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
    fd1 = fd0 - fd1;
    Output.points[2][0] -= fd0;
    double ld0 = 941.2090914708442;
    ab1 = fd0 < fd1;
    double ld1 = 338.7641195879729;
    if (ab2) {
if(ao1 != null){
          ao1.m1(ld0, ld1, fd0, fd1);
}
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
        ab3 = !ab4;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ld1, fd0, fd1, fb0, fb1, ab1, ab2);
}
}
Thought.STACK_COUNTER++;
return ld0;
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
    boolean lb0 = false;
    Output.points[2][1] -= ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    ab4 = !fb0;
    fb1 = ad2 > ad3;
    ad4 *= -1;
    double ld1 = 298.60637725724933;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
}
    ad4 *= -1;
    ab4 = !fb0;
    double ld2 = 287.47482567618755;
    double ld3 = 631.6499087534787;
    ad3 = ad4 - fd0;
    boolean lb4 = true;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(lb0, lb4, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld1, ld2, ld3);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + ld1;
if(ao1 != null){
      fo1 = ao1.m4(ld2, ld3, ad1, ad2, lb4, ab1, ab2, ab3);
}
    ab4 = ad3 > ad4;
    fd0 *= -1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fd1 = fd0 - fd1;
        Thought lo0 = Thought12.getInstance();
        fd0 *= -1;
        fb1 = fd1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 > fd0;
        fb1 = fb0 || fb1;
        Thought lo1 = Thought10.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        Thought lo2 = Thought7.getInstance(fo0, fo1, fo0, fo1);
        fb0 = fb1 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        double ld3 = 128.7821417116339;
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, ld3, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
if(fo1 != null){
          fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        Output.points[2][2] -= ld3;
        boolean lb4 = true;
        lb4 = fb0 || fb1;
if(fo0 != null){
          fo0.m3(lb4, fb0, fb1, lb4);
}
        boolean lb5 = false;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld3, fd0, fd1);
}
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought15.getInstance();
    fb1 = lb0 || ab1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    ab2 = fd1 < fd0;
    if (ab3) {
        ab4 = fd1 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
        fb1 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        lb0 = fd0 < fd1;
        boolean lb2 = true;
        Thought lo3 = Thought0.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
if(fo0 != null){
          ab4 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb0);
}
        fd0 *= -1;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[2][3] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought19.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Thought lo1 = Thought3.getInstance(fo0, fo1, fo0, fo1);
    fb0 = ad1 > ad2;
    fb1 = fb0 || fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
    boolean lb3 = false;
    lb3 = fb0 && fb1;
    lb2 = ad1 > ad2;
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ad1, lb3, fb0, fb1, lb2);
}
    ad2 *= -1;
    lb3 = fb0 || fb1;
    boolean lb4 = false;

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
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ab1 = ab2 || ab3;
    Thought lo0 = Thought17.getInstance();
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
    double ld1 = 573.4075003853409;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, ad1, fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought1.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    ab3 = fd1 < ld1;
    ab4 = ad1 < ad2;
    Output.points[2][4] += ad3;
if(fo0 != null){
      fb0 = fo0.m2();
}
    double ld3 = 864.0796502780368;
    boolean lb4 = true;
    double ld5 = 114.56412034328363;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought6.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    Thought lo1 = Thought8.getInstance(fb0, fb1, fb0, fb1);
    double ld2 = 139.58816650339423;
    boolean lb3 = false;
    boolean lb4 = true;
    ld2 = fd0 - fd1;
    Thought lo5 = Thought12.getInstance(ld2, fd0, fd1, ld2);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    Output.points[2][5] -= fd1;
    lb3 = ld2 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld2, fd0, fd1, lb4, fb0, fb1, lb3);
}
    boolean lb6 = true;
if(ao4 != null){
      ao4.m3(ld2, fd0, fd1, ld2, lb4, lb6, fb0, fb1);
}
    lb3 = !lb4;
    lb6 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2);
}
    boolean lb7 = true;
    fb0 = fb1 || lb3;
    lb4 = lb6 && lb7;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought12.getInstance();
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    ad2 = ad3 - ad4;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought4.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    Thought lo2 = Thought18.getInstance(ad3, ad4, fd0, fd1);
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought2.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        boolean lb4 = true;
        lb4 = fd1 > ad1;
        ad2 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
        fb1 = !lb4;
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3();
}
        fb0 = fb1 || lb4;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb4, fb0);
}
        fb1 = ad1 > ad2;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd0 = fd1 - fd0;
    ab1 = !ab2;
    boolean lb0 = true;
    ab2 = fd1 < fd0;
    double ld1 = 182.6244388031949;
    fd0 *= -1;
    fd1 = ld1 + fd0;
    ab3 = ab4 && fb0;
    double ld2 = 298.0401507640927;
    Thought lo3 = Thought0.getInstance(fb1, lb0, ab1, ab2);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, ld2);
}
    double ld4 = 283.4447529498808;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab3 = ld4 > fd0;
    ab4 = fb0 || fb1;
    boolean lb5 = false;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ld1, ld2, ld4, lb0, lb5, ab1, ab2);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld1, ld2, ld4, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ld1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld2, ld4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ld1 = ld2 + ld4;
    boolean lb6 = false;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, lb5, lb6, ab1, ab2);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = ad2 < ad3;
    Output.points[2][6] += ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought15.getInstance(ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
    Thought lo1 = Thought18.getInstance(fd0, fd1, ad1, ad2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    ad3 *= -1;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
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
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought13.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3();
}
    lb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought12.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || lb1;

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
    Thought lo0 = Thought6.getInstance();
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
    double ld1 = 428.83285556994866;
    fb1 = fd0 > fd1;
    fb0 = ld1 > fd0;
    fb1 = fd1 > ld1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld1;
    fb1 = fb0 && fb1;
    fd0 *= -1;
    fb0 = !fb1;
    fd1 = ld1 - fd0;
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
    fb0 = !fb1;
    Output.points[2][7] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;

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
    double ld0 = 333.97155996425363;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    boolean lb2 = false;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb1);
}
    double ld3 = 397.51971725294965;
if(fo0 != null){
      fo0.m2(ld3, fd0, fd1, ld0);
}
    lb2 = ld3 < fd0;
    fb0 = !fb1;
    lb1 = fd1 < ld0;
    Output.points[2][8] += ld3;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld3, fd0, lb2, fb0, fb1, lb1);
}
    double ld4 = 408.61846231288513;
    Thought lo5 = Thought17.getInstance(fd0, fd1, ld0, ld3, lb2, fb0, fb1, lb1);
    lb2 = !fb0;
    boolean lb6 = false;
    fb0 = ld4 > fd0;
    fd1 = ld0 - ld3;
    Output.points[3][0] -= ld4;
    fb1 = lb1 || lb2;
    fd0 = fd1 - ld0;

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
